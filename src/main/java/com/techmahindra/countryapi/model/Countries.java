package com.techmahindra.countryapi.model;

public class Countries {

    private Long id;
    private String name;

    public Countries(Long id, String name) {
        this.id = id;
        this.name = name;
    }

    public Long getId() {
        return id;
    }

    public String getName() {
        return name;
    }
}