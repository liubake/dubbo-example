package com.erola.dubbo.example.contract.model;

import java.io.Serializable;

/**
 * Created by Erola on 2018/5/29.
 */
public class HelloTest implements Serializable {
    private String ask;
    private String answer;

    public String getAsk() {
        return ask;
    }

    public void setAsk(String ask) {
        this.ask = ask;
    }

    public String getAnswer() {
        return answer;
    }

    public void setAnswer(String answer) {
        this.answer = answer;
    }
}