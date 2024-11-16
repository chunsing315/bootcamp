package com.bootcamp.demo.demo_restapi.entity;
import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
// lke JPA
import jakarta.persistence.Id;
import jakarta.persistence.Table;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import java.io.Serializable;

@Entity //JPA help create table if not exists
// no need constructer
@Table(name = "Users")
// getter enough
@Getter
@AllArgsConstructor
@NoArgsConstructor
@Setter
@Builder
public class UserEntity implements Serializable {
    @Id // Primary Key
    @GeneratedValue (strategy = GenerationType.IDENTITY) //auto increment
    private Long id;
    @Column (name = "fullName")
    private String name;
    private String username;
    @Column (name = "userEmail")
    private String email; // this will auto change to user_email (becuase sql is case in sensitive)

    private String phone;
    private String website;

}
