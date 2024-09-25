package com.example.demo.car;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class CarController {
    private final CarService carService;

    public CarController(CarService carService) {
        this.carService = carService;
    }

    @GetMapping
    public String index(Model model) {
        var cars = carService.findAll();
        model.addAttribute("cars", cars);
        return "index";
    }

}
