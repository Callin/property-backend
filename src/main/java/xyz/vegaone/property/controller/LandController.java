package xyz.vegaone.property.controller;

import lombok.extern.slf4j.Slf4j;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.*;
import xyz.vegaone.property.dto.Land;
import xyz.vegaone.property.service.LandService;

@RestController
@RequestMapping(value = "/land")
@Slf4j
public class LandController {
    private LandService landService;

    @GetMapping(value = "/{id}")
    @ResponseStatus(HttpStatus.OK)
    public Land getLand(@PathVariable(name = "id") String id) {
//        log.info("Inside get");
        Land land = new Land();

        return land;
    }

    @PostMapping
    @ResponseStatus(HttpStatus.CREATED)
    public Land saveLand(Land land) {

        return landService.saveLand(land);
    }

    @PutMapping
    public Land putLand(Land land) {

        return landService.updateLand(land);
    }

    @DeleteMapping(value = "/{id}")
    @ResponseStatus(HttpStatus.NO_CONTENT)
    public void deleteLand(@PathVariable(name = "id") String id) {
        landService.deleteLand(Long.valueOf(id));
    }

}
