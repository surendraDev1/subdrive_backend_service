package com.example.subdrive.repository;

import com.example.subdrive.entity.Car;
import com.example.subdrive.repositories.CarRepository;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import java.util.List;

import static org.junit.jupiter.api.Assertions.assertFalse;

@SpringBootTest
public class CarRepositoryTest {
    @Autowired
    private CarRepository carRepository;

    @Test
    public void testFindByLocationAndMakeAndPricePerDayBetween() {
        List<Car> cars = carRepository.findByLocationAndMakeAndPricePerDayBetween("seattle", "Toyota", 30, 100);
        System.out.println("Checking if list is empty: " + cars);
        assertFalse(cars.isEmpty());
    }
}