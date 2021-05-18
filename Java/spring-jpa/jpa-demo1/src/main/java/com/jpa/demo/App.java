package com.jpa.demo;

import com.jpa.demo.model.Country;
import com.jpa.demo.service.CountryService;

/**
 * Hello world!
 *
 */
public class App {
    public static void main(String[] args) {

        Country country = new Country("US", "United States of America");

        CountryService service = new CountryService();

        // service.create(country);

        // service.update("US", country);

        // service.delete("FR");

        service.findAll().forEach(System.out::println);

        System.out.println(service.findOne("US"));

        service.shutdown();
    }
}


