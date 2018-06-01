package com.erola.dubbo.example.consumer.controller;

import com.erola.dubbo.example.contract.model.HelloTest;
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
        HelloTest test = new HelloTest();
        test.setAsk("现在时间是？");

        ModelAndView modelAndView = new ModelAndView();
        modelAndView.addObject("helloTest",helloService.sayHello(test));
        modelAndView.setViewName("home/index");
        return modelAndView;
    }

}