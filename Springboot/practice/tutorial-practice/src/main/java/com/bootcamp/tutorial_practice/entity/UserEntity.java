package com.bootcamp.tutorial_practice.entity;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;

import jakarta.persistence.CascadeType;
import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.FetchType;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.OneToMany;
import jakarta.persistence.OneToOne;
import jakarta.persistence.Table;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

/* ! Hibernate -> @Entity
 * For java developer, this is your database
 * we do not care about database
 */
@Entity
@Table(name = "p_users")
@Getter
@Builder
@AllArgsConstructor
@NoArgsConstructor
@Setter
public class UserEntity implements Serializable {
    @Id // Primary Key
    @GeneratedValue(strategy = GenerationType.IDENTITY) // auto-increment
    private Long id;

    @Column(name = "colName")
    private String name;
    @Column(name = "colUsername")
    private String username;
    @Column(name = "colEmail")
    private String email;
    @Column(name = "colPhone")
    private String phone;
    @Column(name = "colWebsite")
    private String website;

    @Builder.Default
    // ALL = REMOVE + PERSIST + MERGE
    @OneToMany(mappedBy = "user"
            , cascade = { CascadeType.PERSIST, CascadeType.MERGE }
            , fetch = FetchType.LAZY) // Select * from p_users; if LAZY: not yet (select * from p_posts)
    private List<PostEntity> posts = new ArrayList<>();

    @OneToOne(mappedBy = "user", cascade = { CascadeType.PERSIST, CascadeType.MERGE })
    private CompanyEntity company;
}
