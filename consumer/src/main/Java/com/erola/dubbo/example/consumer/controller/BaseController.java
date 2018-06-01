package com.erola.dubbo.example.consumer.controller;

import com.erola.dubbo.example.contract.service.IHelloService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;

/**
 * Created by Erola on 2018/5/28.
 */
public abstract class BaseController {

    @Autowired
    @Qualifier("helloService")
    protected IHelloService helloService;

    //需要先判断请求类型 是 普通请求 还是 ajax请求
    /*@ResponseBody
    @ExceptionHandler
    public AjaxResponseModel<String> exception(HttpServletRequest request, Exception e) {
        //添加异常处理逻辑，如日志记录　　　


        return new AjaxResponseModel<String>(-1, e.getMessage(), "");
    }*/

}