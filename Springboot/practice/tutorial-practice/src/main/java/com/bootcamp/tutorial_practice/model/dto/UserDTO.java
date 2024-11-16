package com.bootcamp.tutorial_practice.model.dto;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import lombok.ToString;

@Getter
@NoArgsConstructor
@AllArgsConstructor
@ToString
@Setter
@Builder
public class UserDTO {

    private Long id;
    private String name;
    private String username;
    private String email;
    private Address address;
    private String phone;
    private String website;
    private CompanyDTO company;

    @Getter
    @NoArgsConstructor
    @AllArgsConstructor
    @ToString
    @Setter
    @Builder
    public static class Address {
        private String street;
        private String suite;
        private String city;
        private String zipcode;
        private GeoDTO geo;

        @Getter
        @NoArgsConstructor
        @AllArgsConstructor
        @ToString
        @Setter
        @Builder
        public static class GeoDTO {
            private String lat;
            private String lng;
        }
    }

    @Getter
    @NoArgsConstructor
    @AllArgsConstructor
    @ToString
    @Setter
    @Builder
    public static class CompanyDTO {
        private String name;
        private String catchPhrase;
        private String bs;
    }
}
