package icu.bitgo.staticMaker.controller;

import icu.bitgo.staticMaker.service.GenerateService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.method.support.ModelAndViewContainer;

@Controller
public class TestControler {
    @Autowired
    GenerateService generateService;
    @RequestMapping("/{pageId}")
    public ModelAndViewContainer go(@PathVariable String pageId, ModelAndViewContainer model){

        return model;
    }
}
