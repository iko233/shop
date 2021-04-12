package icu.bitgo.staticMaker.service.Impl;

import icu.bitgo.staticMaker.service.GenerateService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.thymeleaf.TemplateEngine;
import org.thymeleaf.context.Context;

import java.io.File;
import java.io.PrintWriter;

@Service
public class GenerateServiceImpl implements GenerateService {

    @Autowired
    TemplateEngine templateEngine;

    @Override
    public void createProductPage() {
        Context context = new Context();  //thymeleaf包下的
        // 1.1 存入数据
//        context.setVariables(loadModel(id));
        // 2 输出流
        File file = new File("d:\\" + "productInfo.html");

        try(PrintWriter writer = new PrintWriter(file,"UTF-8")){ //流在小括号里面会被自动的释放
            //生成HTML
            templateEngine.process("1",context,writer);
        }catch (Exception e){
            System.out.println(e);
        }

    }
}
