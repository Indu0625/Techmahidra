package com.techmahindra.countryapi.model;

public class City {

    private Long id;
    private String name;
    private Long countryId;

    public City(Long id, String name, Long countryId) {
        this.id = id;
        this.name = name;
        this.countryId = countryId;
    }

    public Long getId() {
        return id;
    }

    public String getName() {
        return name;
    }

    public Long getCountryId() {
        return countryId;
    }
}