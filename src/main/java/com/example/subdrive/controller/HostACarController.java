package com.example.subdrive.controller;

import com.example.subdrive.entity.Car;
import com.example.subdrive.service.CarService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.security.access.prepost.PreAuthorize;
import org.springframework.security.core.context.SecurityContextHolder;
import org.springframework.web.bind.annotation.*;
import io.swagger.v3.oas.annotations.Operation;

import java.util.List;

@RestController
@RequestMapping("/api/cars")
public class HostACarController {
    @Autowired
    private CarService carService;

    @PostMapping
    public ResponseEntity<Car> createCar(@RequestBody Car car) {
        Car savedCar = carService.saveCar(car);
        return new ResponseEntity<>(savedCar, HttpStatus.CREATED);
    }

    @GetMapping("/search")
    @Operation(summary = "Search Cars")
    public ResponseEntity<List<Car>> getCars(@RequestParam String location, @RequestParam String make,
                                             @RequestParam double minPrice, @RequestParam double maxPrice) {
        List<Car> cars = carService.searchCars(location, make, minPrice, maxPrice);
        return ResponseEntity.ok(cars);
    }

    @PreAuthorize("hasAuthority('SCOPE_TEST')")
    @GetMapping("/ping")
    public String ping() {
        var context = SecurityContextHolder.getContext();
        var authentication = context.getAuthentication();
        return "Scopes: " + authentication.getAuthorities();
    }
}
