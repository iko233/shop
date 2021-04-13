package icu.bitgo.staticMaker.service.Impl;

import icu.bitgo.api.product.pojo.To.ProductInfoTransport;
import icu.bitgo.api.product.service.ProductDBService;
import icu.bitgo.entity.common.BaseResponse;
import icu.bitgo.staticMaker.service.ProductService;
import org.apache.dubbo.config.annotation.DubboReference;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Service;
import org.thymeleaf.TemplateEngine;
import org.thymeleaf.context.Context;
import java.io.File;
import java.io.PrintWriter;

@Service
public class ProductServiceImpl implements ProductService {

    @Autowired
    private TemplateEngine templateEngine;
    @DubboReference(version = "0.0.1")
    private ProductDBService productDBService;


    @Override
    public String createProductPage(String id ) {
        BaseResponse<ProductInfoTransport> productInfo = productDBService.getProductInfo(id);
        if (200 == productInfo.getCode()) {
            Context context = new Context();
            context.setVariable("productInfo", productInfo);
            File dir=new File("D:/"+id);
            if(!dir.exists()){
                dir.mkdir();
            }
            File file = new File("d:/" + id + "/index.html");
            String productPage = templateEngine.process("productInfo", context);
            try (PrintWriter writer = new PrintWriter(file, "UTF-8")) {

                writer.write(productPage);
            } catch (Exception e) {
                System.out.println(e);
            }
            return productPage;
        }
        return null;
    }
}
