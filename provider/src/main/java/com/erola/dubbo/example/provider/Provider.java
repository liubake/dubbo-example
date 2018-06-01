package com.erola.dubbo.example.provider;

import org.springframework.context.support.FileSystemXmlApplicationContext;
import java.io.File;
import java.net.URLDecoder;

/**
 * Created by Erola on 2018/5/29.
 */
public class Provider {

    public static void main(String[] args) throws Exception {
        File currentFile = new File(Provider.class.getProtectionDomain().getCodeSource().getLocation().getPath());
        //为什么用toURI方式再toString获取路径？这个锅请给FileSystemXmlApplicationContext
        //FileSystemXmlApplicationContext会丢弃路径中的第一个/，导致在linux中识别成相对路径
        String rootDirectory = URLDecoder.decode(currentFile.getParentFile().toURI().toString(), "utf-8");
        String providerConfigPath = rootDirectory + File.separator + "config"+ File.separator +"dubbo-provider.xml";
        (new FileSystemXmlApplicationContext(providerConfigPath)).start();
        System.in.read();
    }

}