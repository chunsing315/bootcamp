package com.bootcamp.tutorial_practice.entity;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Getter;
import lombok.NoArgsConstructor;

@Entity
@Table(name = "p_comments2")
@Builder
@Getter
@AllArgsConstructor
@NoArgsConstructor
public class CommentEntity {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "colId")
    private Long id;
    @Column(name = "colPostId")
    private Long postId;
    @Column(name = "colName")
    private String name;
    @Column(name = "email")
    private String email;
    @Column(name = "colBody", length = 1000)
    private String body;
}
