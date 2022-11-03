package com.example.currencyconverter.repository;

import com.example.currencyconverter.model.Valute;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.Optional;

@Repository
public interface ValuteRepository extends JpaRepository<Valute, Long> {
    Optional<Valute> findByCharCode(String charCode);
}
