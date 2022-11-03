package com.example.currencyconverter.model;

import lombok.AllArgsConstructor;
import lombok.NoArgsConstructor;

import javax.xml.bind.annotation.XmlElement;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlRootElement;
import java.io.Serializable;
import java.time.LocalDate;
import java.util.List;

@XmlRootElement(name = "ValCurs")
@XmlAccessorType(XmlAccessType.FIELD)
public class ValCurs implements Serializable {

    @XmlElement(name = "Valute")
    private List<Valute> valute;
    @XmlElement(name = "Date")
    private LocalDate date;

    public List<Valute> getValute() {
        return valute;
    }

    @Override
    public String toString() {
        return "CourseDto{" +
                "valute=" + valute +
                ", date=" + date +
                '}';
    }
}
