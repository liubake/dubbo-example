package com.erola.dubbo.example.provider;

import com.erola.dubbo.example.contract.model.HelloTest;
import com.erola.dubbo.example.contract.service.IHelloService;

/**
 * Created by Erola on 2018/5/29.
 */
public class HelloService implements IHelloService {

    public HelloTest sayHello(HelloTest helloTest) {
        if(helloTest==null){
           helloTest.setAnswer("");
        }
        return helloTest;
    }

}