package icu.bitgo.staticMaker.service;

import org.springframework.web.method.support.ModelAndViewContainer;

public interface ProductService {
    ModelAndViewContainer createProductPage(String id);
}
