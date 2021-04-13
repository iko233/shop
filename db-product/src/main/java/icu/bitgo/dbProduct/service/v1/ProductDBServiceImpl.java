package icu.bitgo.dbProduct.service.v1;

import icu.bitgo.api.product.pojo.To.ProductInfoTransport;
import icu.bitgo.api.product.service.ProductDBService;
import icu.bitgo.dbProduct.mapper.ProductInfoMapper;
import icu.bitgo.dbProduct.mapper.ProductMapper;
import icu.bitgo.dbProduct.pojo.Do.Product;
import icu.bitgo.dbProduct.pojo.Do.ProductInfo;
import icu.bitgo.entity.common.BaseResponse;
import org.apache.dubbo.config.annotation.DubboService;
import org.springframework.beans.factory.annotation.Autowired;

@DubboService(version = "0.0.1")
public class ProductDBServiceImpl implements ProductDBService {
    private ProductInfoMapper productInfoMapper;
    private ProductMapper productMapper;
    @Autowired
    public void setProductInfoMapper(ProductInfoMapper productInfoMapper) {
        this.productInfoMapper = productInfoMapper;
    }
    @Autowired
    public void setProductMapper(ProductMapper productMapper) {
        this.productMapper = productMapper;
    }

    @Override
    public BaseResponse<ProductInfoTransport> getProductInfo(String id) {
            Product product = productMapper.selectById(id);
            ProductInfo productInfo = productInfoMapper.getProductInfo(id);
            BaseResponse<ProductInfoTransport> productInfoBaseResponse = new BaseResponse<>();
            ProductInfoTransport resBody = new ProductInfoTransport();
            resBody.setTitle(product.getTitle())
                    .setClick(product.getClick())
                    .setBigPic(productInfo.getBigPic())
                    .setDiscount(product.getDiscount())
                    .setId(id)
                    .setFreight(product.getFreight())
                    .setClick(product.getClick())
                    .setSellPrice(product.getSellPrice())
                    .setSell(product.getSell())
                    .setSeller(product.getSeller())
                    .setParameter(productInfo.getParameter());
            productInfoBaseResponse.setMsg("查询成功")
                    .setCode(200)
                    .setBody(resBody);
            return productInfoBaseResponse;

    }

}

