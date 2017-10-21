package xyz.vegaone.property.controller;

import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.*;
import xyz.vegaone.property.dto.Garage;
import xyz.vegaone.property.service.GarageService;

@RestController
@RequestMapping(value = "/garage")
@Slf4j
public class GarageController {
    @Autowired
    private GarageService garageService;

    @GetMapping(value = "/{id}")
    @ResponseStatus(HttpStatus.OK)
    public Garage getGarage(@PathVariable(name = "id") String id) {
//        log.info("Inside get");
        Garage garage = new Garage();

        return garage;
    }

    @PostMapping
    @ResponseStatus(HttpStatus.CREATED)
    public Garage saveGarage(@RequestBody Garage garage) {

        return garage;
    }

    @PutMapping
    public Garage putGarage(Garage garage ) {

        return garageService.updateGarage(garage);
    }

    @DeleteMapping(value = "/{id}")
    @ResponseStatus(HttpStatus.NO_CONTENT)
    public void deleteGarage(@PathVariable(name = "id") String id) {
        garageService.deleteGarage(Long.valueOf(id));
    }
}
