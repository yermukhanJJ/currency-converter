package com.example.currencyconverter.controller;

import com.example.currencyconverter.model.Request;
import com.example.currencyconverter.model.Valute;
import com.example.currencyconverter.service.ConverterService;
import com.example.currencyconverter.service.ValuteService;
import lombok.RequiredArgsConstructor;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequiredArgsConstructor
public class CourseParsingController {

    private final ValuteService valuteService;

    private final ConverterService converterService;

    @GetMapping(value = "/getCourse")
    public ResponseEntity<List<Valute>> getListInformation() {
        return ResponseEntity.ok(valuteService.findCourseInfo());
    }

    @PostMapping(value = "/converter")
    public ResponseEntity<?> converter(@RequestParam String from, @RequestParam String to,
                                       @RequestBody Request request) {
        return ResponseEntity.ok(converterService.converter(from, to, request));
    }
}
