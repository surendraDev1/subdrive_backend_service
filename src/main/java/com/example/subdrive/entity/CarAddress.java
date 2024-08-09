package com.example.subdrive.entity;

import jakarta.persistence.Column;
import org.springframework.stereotype.Component;

@Component
public class CarAddress {
    @Column(nullable = true)
    private double latitude;
    @Column(nullable = true)
    private double longitude;
    private String houseNumer;
    private Integer aptNumber;
    private String aptName;
    private String street;
    private String village;
    private String Mandal;
    private String district;
    private String city;
    private Integer pinCode;

}
