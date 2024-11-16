package com.bootcamp.demo;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.EqualsAndHashCode;

import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.RequiredArgsConstructor;
import lombok.Setter;
import lombok.ToString;

@Data
@Builder // call all argument constructor.
// @Setter
@AllArgsConstructor
@NoArgsConstructor
// @ToString
// @EqualsAndHashCode
// @RequiredArgsConstructor

public class Person1 {
    @Getter
    private String name;
    @Getter
    private int age;

    public static void main(String[] args) {
        Person1 p1 = new Person1();
        p1.setAge(29);
        System.out.println(p1.getAge() + ' ' + p1.getName());

        Person1 p2 = new Person1("Peter", 10);
        System.out.println(p2);
        p1.setName("Jennifer");
        System.out.println(p1.toString());

        System.out.println(p1.hashCode());
        System.out.println(p2.hashCode());
        System.out.println(p2.equals(p1));

        Person1 p3 = Person1.builder() //
                    .age(13) //
                    .name("john") //
                    .build();

    }
}
