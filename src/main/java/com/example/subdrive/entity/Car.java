package com.example.subdrive.entity;

import jakarta.persistence.*;

@Entity
@Embeddable
@Table(name = "cars")
public class Car {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @Column(nullable = true)
    private String make;

    @Column(nullable = true)
    private String model;

    @Column(nullable = true)
    private double pricePerDay;

    @Column(nullable = true)
    private boolean available;
    @Column(nullable = true)
    private String numberPlate;
    @Column(nullable = true)
    private String description;
    @Column(nullable = true)
    private String[] availability;
    @Column(nullable = true)
    private String location;
    @Column(name = "\"year\"")
    private Integer year;
    @Column(nullable = true)
    private String color;
    @Column(nullable = true)
    private String vin;
    @Column(nullable = true)
    private int mileage;
    @Column(nullable = true)
    private String transmission;
    @Column(nullable = true)
    private String fuelType;
    @Column(nullable = true)
    private String[] images;
}
