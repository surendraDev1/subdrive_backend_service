package com.example.subdrive.entities;

import jakarta.persistence.*;

@Entity
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
    private String address;

    @Column(nullable = true)
    private double latitude;

    @Column(nullable = true)
    private double longitude;

    @Column(nullable = true)
    private double pricePerDay;

    @Column(nullable = true)
    private boolean available;
}
