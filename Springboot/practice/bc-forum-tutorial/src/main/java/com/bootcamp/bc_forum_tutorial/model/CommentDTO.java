package com.bootcamp.bc_forum_tutorial.model;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import lombok.ToString;

@AllArgsConstructor
@NoArgsConstructor
@Getter
@Setter
@Builder
@ToString
public class CommentDTO {

    private Long id;
    private Long postId;
    // private String username;
    private String body;
    private String email;
    private String name;
}
