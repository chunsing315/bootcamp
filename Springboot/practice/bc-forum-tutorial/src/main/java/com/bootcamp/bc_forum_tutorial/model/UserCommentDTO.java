package com.bootcamp.bc_forum_tutorial.model;

import java.util.List;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import lombok.ToString;

@AllArgsConstructor
@NoArgsConstructor
@ToString
@Builder
@Setter
@Getter
public class UserCommentDTO {
    private Long id;
    private String username;
    private List<CommentDTO> comments;

}
