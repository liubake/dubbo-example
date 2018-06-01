package com.erola.dubbo.example.provider;

import com.erola.dubbo.example.contract.model.HelloTest;
import com.erola.dubbo.example.contract.service.IHelloService;
import java.text.SimpleDateFormat;
import java.util.Calendar;

/**
 * Created by Erola on 2018/5/29.
 */
public class HelloService implements IHelloService {

    public HelloTest sayHello(HelloTest helloTest) {
        if(helloTest!=null){
           helloTest.setAnswer((new SimpleDateFormat("yyyy-MM-dd HH:mm:ss")).format(Calendar.getInstance().getTime()));
           System.out.println(String.format("Recevie ask: %s , Answer is: %s", helloTest.getAsk(), helloTest.getAnswer()));
        }
        return helloTest;
    }

}