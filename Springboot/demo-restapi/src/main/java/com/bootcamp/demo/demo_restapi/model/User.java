package com.bootcamp.demo.demo_restapi.model;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.Setter;

@Getter // Serialization
// @Setter
// @AllArgsConstructor
public class User {
    Integer id;
    String name;
    String username;
    String email;
    Address address;
    String phone;
    String website;
    Comapny company;

    @Getter // Serialization
    @Setter
    @AllArgsConstructor
    static class Comapny {
        String name;
        String catchPhrase;
        String bs;
    }

    @Getter // Serialization
    static class Address {
        String street;
        String suite;
        String city;
        String zipcode;
        Geo geo;

        @Getter // Serialization
        static class Geo {
            String lat;
            String lng;
        }
    }

    // {
    // "street": "Kulas Light",
    // "suite": "Apt. 556",
    // "city": "Gwenborough",
    // "zipcode": "92998-3874",
    // "geo": {
    // "lat": "-37.3159",
    // "lng": "81.1496"
    // }
    // },"phone":"1-770-736-8031 x56442","website":"hildegard.org","company":
    // {
    // "name": "Romaguera-Crona",
    // "catchPhrase": "Multi-layered client-server neural-net",
    // "bs": "harness real-time e-markets"

}
