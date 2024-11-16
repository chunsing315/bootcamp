package com.bootcamp.bc_forum_tutorial.model;

import java.util.ArrayList;
import java.util.List;

import com.bootcamp.bc_forum_tutorial.model.UserDTO.addressDTO.PostDTO;
import com.bootcamp.bc_forum_tutorial.model.UserPlaceHolder.AddressDTO;
import com.bootcamp.bc_forum_tutorial.model.UserPlaceHolder.CompanyDTO;

import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import lombok.ToString;

@AllArgsConstructor
@NoArgsConstructor
@ToString
@Getter
@Setter
@Builder
public class UserDTO {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    private String name;
    private String username;
    private String phone;
    private String website;
    private String email;
    private AddressDTO address;
    private CompanyDTO company;
    private List<PostDTO> posts = new ArrayList<>();

    @AllArgsConstructor
    @NoArgsConstructor
    @ToString
    @Getter
    @Setter
    @Builder
    public static class addressDTO {
        private Long id;
        private String street;
        private String city;
        private String zipcdoe;
        private GeoDTO geo;

        @AllArgsConstructor
        @NoArgsConstructor
        @ToString
        @Getter
        @Setter
        @Builder
        public static class PostDTO {
            private Long id;
            private String body;
            private String title;
            private List<CommentDTO> comments = new ArrayList<>();
        }

        @AllArgsConstructor
        @NoArgsConstructor
        @ToString
        @Getter
        @Setter
        @Builder
        public static class GeoDTO {
            private String lat;
            private String lng;
        }

        @AllArgsConstructor
        @NoArgsConstructor
        @ToString
        @Getter
        @Setter
        @Builder
        public static class CompanyDTO {
            private Long id;
            private String name;
            private String catchPhrase;
            private String bs;
        }
    }
}
