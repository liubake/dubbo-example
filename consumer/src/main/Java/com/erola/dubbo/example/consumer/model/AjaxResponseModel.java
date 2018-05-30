package com.erola.dubbo.example.consumer.model;

import com.fasterxml.jackson.annotation.JsonProperty;

/**
 * Created by Erola on 2018/5/29.
 */
public class AjaxResponseModel<T> {
    @JsonProperty(value = "Status")
    private int status;
    @JsonProperty(value = "Message")
    private String message;
    @JsonProperty(value = "Data")
    private T data;

    public AjaxResponseModel(){}

    public AjaxResponseModel(Integer status, String message, T data){
        this.status = status;
        this.message = message;
        this.data = data;
    }

    public int getStatus(){
        return this.status;
    }
    public String getMessage(){
        return this.message;
    }
    public T getData(){
        return this.data;
    }

    public void setStatus(int status){
        this.status=status;
    }
    public void setMessage(String message){
        this.message=message;
    }
    public void setData(T data){
        this.data=data;
    }
}