package com.bootcamp.tutorial_practice.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

import com.bootcamp.tutorial_practice.entity.CommentEntity;
import com.bootcamp.tutorial_practice.entity.PostEntity;

@Repository
public interface CommentRepository extends JpaRepository<CommentEntity, Long> {

    /* 1.JPQL
     * 2.Default case, use the name of java entity class
     * 3.when you use nativeQuery, use the field name of database
     */
    

    // @Query("SELECT '*' FROM PostEntity WHERE PostEntity.id >2")
    // List<PostEntity> findPostIDBiggerTHanTwo();

//     @Query(value = "SELECT * FROM p_posts WHERE p_posts.id >2",
//         nativeQuery = true)
//     List<PostEntity> findPostIDBiggerTHanTwo2();
// }
}