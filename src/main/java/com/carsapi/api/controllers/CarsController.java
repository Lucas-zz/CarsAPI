package com.carsapi.api.controllers;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

// import com.carsapi.api.dto.CarDTO;

@RestController
@RequestMapping("/api/cars")
public class CarsController {
    String cars;

    @GetMapping
    ResponseEntity<String> getCars() {
        if (cars == null) {
            return ResponseEntity.status(HttpStatus.NOT_FOUND)
                    .body("The list of cars is empty, submit a car first.");
        }

        return ResponseEntity.status(HttpStatus.OK)
                .body("The list of cars: \n" + cars);
    }

    @PostMapping
    public void createCar(@RequestBody String req) {
        cars = req;

        System.out.println(req);
    }
}
