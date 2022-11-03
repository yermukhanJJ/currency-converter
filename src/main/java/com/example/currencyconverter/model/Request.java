package com.example.currencyconverter.model;

import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class Request {
    private double worth;

    public Request() {

    }

    public Request(double worth) {
        this.worth = worth;
    }
}
