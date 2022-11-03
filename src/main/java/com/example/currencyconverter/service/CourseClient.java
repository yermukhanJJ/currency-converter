package com.example.currencyconverter.service;

import com.example.currencyconverter.model.ValCurs;
import com.example.currencyconverter.model.Valute;
import org.springframework.stereotype.Component;
import org.springframework.web.client.RestTemplate;

import java.util.List;

@Component
public class CourseClient {

    private final String URL = "https://cbr.ru/scripts/XML_daily.asp";

    final RestTemplate restTemplate = new RestTemplate();

    public List<Valute> getCourses() {
        ValCurs response = restTemplate.getForObject(URL, ValCurs.class);

        if (response != null) {
            response
                    .getValute()
                    .forEach(x -> {
                        x.setValue(Double.parseDouble(x.get_value().replace(",", ".")));
                        System.out.println(x);
                    });

            return response.getValute();
        }

        return null;
    }
}
