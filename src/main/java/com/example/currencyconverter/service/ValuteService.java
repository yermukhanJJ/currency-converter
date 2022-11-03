package com.example.currencyconverter.service;

import com.example.currencyconverter.model.Valute;
import com.example.currencyconverter.repository.ValuteRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
@RequiredArgsConstructor
public class ValuteService {

    private final ValuteRepository valuteRepository;
    private final CourseClient courseClient;

    public List<Valute> findCourseInfo() {
        return valuteRepository.saveAll(courseClient.getCourses());
    }

}
