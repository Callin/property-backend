package xyz.vegaone.property.controller;


import lombok.extern.slf4j.Slf4j;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.*;
import xyz.vegaone.property.dto.Apartment;
import xyz.vegaone.property.service.ApartmentService;

@RestController
@RequestMapping(value = "/apartment")
@Slf4j
public class ApartmentController {
    private ApartmentService apartmentService;

    @GetMapping(value = "/{id}")

    @ResponseStatus(HttpStatus.OK)

    public Apartment getApartment(@PathVariable(name = "id") String id) {
//        log.info("Inside get");
        Apartment apartment = new Apartment();

        return apartment;
    }

    @PostMapping
    @ResponseStatus(HttpStatus.CREATED)
    public Apartment saveApartment(Apartment apartment) {

        return apartmentService.saveApartment(apartment);
    }

    @PutMapping
    public Apartment putAparment(Apartment apartment ) {

        return apartmentService.updateApartment(apartment);
    }

    @DeleteMapping(value = "/{id}")
    @ResponseStatus(HttpStatus.NO_CONTENT)
    public void deleteApartment(@PathVariable(name = "id") String id) {
        apartmentService.deleteApartment(Long.valueOf(id));
    }
}
