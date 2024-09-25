package com.example.demo.car;

import java.util.List;

import org.springframework.stereotype.Service;

@Service
public class CarService {

    private final CarRepository carRepository;

    public CarService(CarRepository carRepository) {
        this.carRepository = carRepository;

    }

    public List<Car> findAll() {
        return carRepository.findAll();
    }
}
