package com.github.giepe.spring.boot.ws.model;

import java.math.BigInteger;

/**
 * Created by Piotrek on 2016-10-12.
 */
public class Greeting {
    private BigInteger id;
    private String text;

    public Greeting() {
    }

    public BigInteger getId() {
        return id;
    }

    public void setId(BigInteger id) {
        this.id = id;
    }

    public String getText() {
        return text;
    }

    public void setText(String text) {
        this.text = text;
    }
}