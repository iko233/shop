package icu.bitgo.staticMaker.controller;

import icu.bitgo.staticMaker.service.ProductService;
import org.springframework.beans.factory.annotation.Autowired;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.method.support.ModelAndViewContainer;

@Controller
public class ProductControler {
    @Autowired
    private ProductService productService;
    @RequestMapping("/product/{pageId}")
    @ResponseBody
    public String go(@PathVariable String pageId){
        return productService.createProductPage(pageId);
    }
}
