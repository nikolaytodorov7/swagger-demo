package com.infinno.swaggerdemo.controller;

import com.infinno.swaggerdemo.api.CarsApi;
import com.infinno.swaggerdemo.model.Car;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class CarsController implements CarsApi {
    @Override
    public Car getCarByModelPathVariable(String model) {
        return new Car(model);
    }

    @Override
    public Car getCarByModelHeader(String model) {
        return new Car(model);
    }

    @Override
    public Car createCar(Car car) {
        car.setId(1L);
        return car;
    }
}
