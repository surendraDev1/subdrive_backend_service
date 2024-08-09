package com.example.subdrive.entity;

import org.springframework.stereotype.Component;

import java.util.List;

@Component
public class CarDocuments implements Documents{
    private String insurance;
    private String RTO;
    private String printOfSale;

    @Override
    public List<String> getDocuments(String carId) {
        return null;
    }
}
