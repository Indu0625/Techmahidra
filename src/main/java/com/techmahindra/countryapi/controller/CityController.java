package com.techmahindra.countryapi.controller;

import com.techmahindra.countryapi.model.City;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

@RestController
public class CityController {

    @GetMapping("/cities/{cityId}")
    public City getCity(@PathVariable Long cityId) {

        if (cityId == 1L) {
            return new City(1L, "Hyderabad", 1L);
        } else if (cityId == 2L) {
            return new City(2L, "Bangalore", 1L);
        } else if (cityId == 3L) {
            return new City(3L, "Chennai", 1L);
        }

        return new City(4L, "New York", 2L);
    }

    @GetMapping("/countries/{countryId}/cities")
    public List<City> getCities(
            @PathVariable Long countryId,
            @RequestParam(defaultValue = "0") int page,
            @RequestParam(defaultValue = "10") int size) {

        List<City> cities = new ArrayList<>();

        if (countryId == 1L) {
            cities.add(new City(1L, "Hyderabad", 1L));
            cities.add(new City(2L, "Bangalore", 1L));
            cities.add(new City(3L, "Chennai", 1L));
        } else if (countryId == 2L) {
            cities.add(new City(4L, "New York", 2L));
            cities.add(new City(5L, "Chicago", 2L));
            cities.add(new City(6L, "Dallas", 2L));
        }

        int start = page * size;
        int end = Math.min(start + size, cities.size());

        if (start >= cities.size()) {
            return Collections.emptyList();
        }

        return cities.subList(start, end);
    }
}