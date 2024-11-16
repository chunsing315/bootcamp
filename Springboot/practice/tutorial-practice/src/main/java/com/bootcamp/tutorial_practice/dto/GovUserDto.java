package com.bootcamp.tutorial_practice.dto;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Getter;

@Getter
@Builder
@AllArgsConstructor
// Builder + AllArgs (as a set)
public class GovUserDto {
    private String name;
    private String email;
}
