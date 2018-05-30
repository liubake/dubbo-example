package com.erola.dubbo.example.consumer.config;

import java.io.IOException;
import java.io.InputStream;
import java.util.Properties;

/**
 * Created by Erola on 2018/5/29.
 */
public class SiteConfig {
    /**
     *
     */
    private String jsVersion;
    /**
     *
     */
    private String cssVersion;

    /**
     *
     * @return
     */
    public String getJsVersion() {
        return getSiteConfigInstance().jsVersion;
    }
    /**
     *
     * @return
     */
    public String getCssVersion() {
        return getSiteConfigInstance().cssVersion;
    }

    /**
     *
     */
    private static SiteConfig siteConfigInstance;

    /**
     * 获取SiteConfig配置实例
     * @return
     */
    private static SiteConfig getSiteConfigInstance(){
        if(siteConfigInstance!=null)
            return siteConfigInstance;
        else {
            throw new NullPointerException("NettyClientConfig uninitialized!");
        }
    }

    /**
     * 初始化站点配置
     * @param propertiesStream
     */
    public static void initializeSiteConfig(InputStream propertiesStream){
        try{
            Properties propertiesConfig =new Properties();
            propertiesConfig.load(propertiesStream);
            setPropertiesConfig(propertiesConfig);
        } catch (IOException e) {
            //这种配置初始化错误直接抛出去，阻止程序继续运行
            throw new RuntimeException(e);
        } finally {
            if(propertiesStream!=null) {
                try {
                    propertiesStream.close();
                } catch (IOException e) {
                    e.printStackTrace();
                }
            }
        }
    }

    /**
     * 设置配置文件中的的参数
     * @param propertiesConfig
     */
    private static void setPropertiesConfig(Properties propertiesConfig){
        if(siteConfigInstance==null) {
            siteConfigInstance = new SiteConfig();
        }
        siteConfigInstance.jsVersion=propertiesConfig.get("jsVersion").toString().trim();
        siteConfigInstance.cssVersion=propertiesConfig.get("cssVersion").toString().trim();
    }
}