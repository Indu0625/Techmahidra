package com.techmahindra.countryapi.controller;

import com.techmahindra.countryapi.model.Countries;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.ArrayList;
import java.util.List;

@RestController
public class CountryController {

    @GetMapping("/countries")
    public List<Countries> getCountries() {

        List<Countries> countries = new ArrayList<>();

        countries.add(new Countries(1L, "India"));
        countries.add(new Countries(2L, "USA"));

        return countries;
    }
}