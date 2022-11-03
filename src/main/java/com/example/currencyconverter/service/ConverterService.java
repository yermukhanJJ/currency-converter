package com.example.currencyconverter.service;

import com.example.currencyconverter.model.Request;
import com.example.currencyconverter.model.Response;
import com.example.currencyconverter.model.Valute;
import com.example.currencyconverter.repository.ValuteRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

@Service
@RequiredArgsConstructor
public class ConverterService {

    private final ValuteRepository valuteRepository;

    public Response converter(String from, String to, Request request) {
        Valute fromVal = valuteRepository.findByCharCode(from)
                .orElseThrow(() -> new RuntimeException("Currency is not found"));
        Valute toVal = valuteRepository.findByCharCode(to)
                .orElseThrow(() -> new RuntimeException("Currency is not found"));

        double reqValue = (request.getWorth() * fromVal.getValue()) / fromVal.getNominal();
        double resValue = (reqValue * toVal.getNominal()) / toVal.getValue();

        return new Response(resValue);
    }
}
