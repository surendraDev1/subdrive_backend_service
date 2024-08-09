package com.example.subdrive.entity;

import org.springframework.stereotype.Component;

import java.util.List;

@Component
public class User {
    private String hostId;
    private String firstName;
    private String lastName;
    private PaymentInformation paymentInformation;
    private List<Car> carList;
    private Documents hostDocuments;
    private Documents renterDocuments;
    private Integer rating;

}
