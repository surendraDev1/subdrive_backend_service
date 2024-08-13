package com.example.subdrive.service;

import com.example.subdrive.entity.Car;
import com.example.subdrive.repositories.CarRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class CarService {
    @Autowired
    private CarRepository carRepository;
//
//    public List<Car> findNearbyCars(double latitude, double longitude, double radius) {
//        return carRepository.findNearbyCars(latitude, longitude, radius);
//    }

    public Car saveCar(Car car) {
        return carRepository.save(car);
    }

    public Optional<Car> getCarById(Long id) {
        return carRepository.findById(id);
    }

//    public Optional<Car> getAvailableCarById(Long id) {
//        return carRepository.findByIdAndAvailable(id, true);
//    }

    public void deleteCar(Car car) {
        carRepository.delete(car);
    }

    public List<Car> searchCars(String location, String make, double minPrice, double maxPrice) {
        return carRepository.findByLocationAndMakeAndPricePerDayBetween(location, make, minPrice, maxPrice);
    }
}
