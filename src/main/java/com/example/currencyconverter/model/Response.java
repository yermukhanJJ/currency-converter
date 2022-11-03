package com.example.currencyconverter.model;

import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class Response {
    private double total;

    public Response(double total) {
        this.total = total;
    }

    public Response() {

    }
}
