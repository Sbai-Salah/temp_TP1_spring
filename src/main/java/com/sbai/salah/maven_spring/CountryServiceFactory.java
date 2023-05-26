package com.sbai.salah.maven_spring;

public class CountryServiceFactory {
    public Country getInstance(String name, int population) {
        return new Country(name, population);
    }

    public Country getInstance() {
        return new Country("Default Country", 0);
    }
}

