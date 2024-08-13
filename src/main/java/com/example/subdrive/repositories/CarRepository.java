package com.example.subdrive.repositories;

import com.example.subdrive.entity.Car;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

import java.util.List;
import java.util.Optional;

@Repository
public interface CarRepository extends JpaRepository<Car, Long> {
//    @Query("SELECT c FROM Car c WHERE " +
//            "(6371 * acos(cos(radians(?1)) * cos(radians(c.latitude)) * cos(radians(c.longitude) - radians(?2)) + sin(radians(?1)) * sin(radians(c.latitude)))) < ?3")
//    List<Car> findNearbyCars(double latitude, double longitude, double radius);

//    Optional<Car> findByIdAndAvailable(Long id, boolean available);

    List<Car> findByLocationAndMakeAndPricePerDayBetween(String location, String make, double minPrice, double maxPrice);
}
