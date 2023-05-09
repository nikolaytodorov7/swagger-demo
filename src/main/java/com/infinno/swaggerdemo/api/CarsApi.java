package com.infinno.swaggerdemo.api;

import com.infinno.swaggerdemo.model.Car;
import io.swagger.v3.oas.annotations.Operation;
import org.springframework.web.bind.annotation.*;

@RequestMapping("/api/cars")
public interface CarsApi {
    @GetMapping("/{model}")
    @Operation(tags = {"Car"}, summary = "Get car by model path variable")
    Car getCarByModelPathVariable(@PathVariable String model);

    @GetMapping
    @Operation(tags = {"Car"}, summary = "Get car by model header")
    Car getCarByModelHeader(@RequestHeader String model);

    @PostMapping
    @Operation(tags = {"Car"}, summary = "Create car")
    Car createCar(@RequestBody Car car);
}
