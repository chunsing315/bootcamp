package com.bootcamp.tutorial_practice.model;

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
public class UserRequest {
    private String name;
    private String email;
    private String phone;
}
