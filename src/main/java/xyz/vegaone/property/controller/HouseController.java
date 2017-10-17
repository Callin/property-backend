package xyz.vegaone.property.controller;

import lombok.extern.slf4j.Slf4j;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.*;
import xyz.vegaone.property.dto.House;
import xyz.vegaone.property.service.HouseService;

@RestController
@RequestMapping(value = "/house")
@Slf4j
public class HouseController {

    private HouseService houseService;

    @GetMapping(value = "/{id}")
    @ResponseStatus(HttpStatus.OK)
    public House getHouse(@PathVariable(name = "id") String id) {
//        log.info("Inside get");
        House house = new House();

       return house;
    }

    @PostMapping
    @ResponseStatus(HttpStatus.CREATED)
    public House saveHouse(@RequestBody House house) {

        return houseService.savehouse(house);
    }

    @PutMapping
    public House putHouse(House house) {

        return houseService.updateHouse(house);
    }

    @DeleteMapping(value = "/{id}")
    @ResponseStatus(HttpStatus.NO_CONTENT)
    public void deleteHouse(@PathVariable(name = "id") String id) {
        houseService.deleteHouse(Long.valueOf(id));
    }

}
