package com.erola.dubbo.example.consumer.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.servlet.ModelAndView;

import java.io.IOException;

/**
 * Created by Erola on 2018/5/28.
 */
@Controller
@RequestMapping(value = "/home")
public class HomeController extends BaseController {

    @RequestMapping(value="/index", method = {RequestMethod.GET})
    public ModelAndView index() throws IOException {

        ModelAndView modelAndView = new ModelAndView();
        modelAndView.setViewName("home/index");
        return modelAndView;
    }

}