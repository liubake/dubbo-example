package com.erola.dubbo.example.provider;

import org.springframework.context.support.AbstractXmlApplicationContext;
import org.springframework.context.support.FileSystemXmlApplicationContext;
import java.io.File;
import java.net.URLDecoder;

/**
 * Created by Erola on 2018/5/29.
 */
public class Provider {

    public static void main(String[] args) throws Exception {
        File currentFile = new File(Provider.class.getProtectionDomain().getCodeSource().getLocation().getPath());
        String rootDirectory = URLDecoder.decode(currentFile.getParent(), "utf-8");
        String providerConfigPath = rootDirectory + File.separator + "config"+ File.separator +"dubbo-provider.xml";

        //System.setProperty("java.net.preferIPv4Stack", "true");
        AbstractXmlApplicationContext context = new FileSystemXmlApplicationContext(providerConfigPath);
        context.start();
        System.in.read();
    }

}