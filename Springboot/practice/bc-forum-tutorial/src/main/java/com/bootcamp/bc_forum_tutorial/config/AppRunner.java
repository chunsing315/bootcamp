package com.bootcamp.bc_forum_tutorial.config;

import java.util.List;
import java.util.stream.Collectors;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.context.annotation.Configuration;

import com.bootcamp.bc_forum_tutorial.entity.AddressEntity;
import com.bootcamp.bc_forum_tutorial.entity.CommentEntity;
import com.bootcamp.bc_forum_tutorial.entity.CompanyEntity;
import com.bootcamp.bc_forum_tutorial.entity.GeoEntity;
import com.bootcamp.bc_forum_tutorial.entity.PostEntity;
import com.bootcamp.bc_forum_tutorial.entity.UserEntity;
import com.bootcamp.bc_forum_tutorial.model.CommentPlaceHolder;
import com.bootcamp.bc_forum_tutorial.model.Mapper;
import com.bootcamp.bc_forum_tutorial.model.PostPlaceHolder;
import com.bootcamp.bc_forum_tutorial.model.UserPlaceHolder;
import com.bootcamp.bc_forum_tutorial.service.CommentService;
import com.bootcamp.bc_forum_tutorial.service.PostService;
import com.bootcamp.bc_forum_tutorial.service.UserService;

@Configuration
public class AppRunner implements CommandLineRunner {

  @Autowired
  private UserService userService;

  @Autowired
  private PostService postService;

  @Autowired
  private CommentService commentService;

  @Autowired
  private Mapper mapper;

  @Override
  public void run(String... args) throws Exception {
    System.out.println("Start Server : ");

    System.out.println("Start saving  address, company ,geo, post and comment");
    List<UserPlaceHolder> userPlaceHolders = userService.getRawData();
    List<PostPlaceHolder> postPlaceHolders = postService.getRawData();
    List<CommentPlaceHolder> commentPlaceHolders =commentService.getRawData();

    // Convert and construct UserEntity
    List<UserEntity> userEntities = userPlaceHolders.stream().map(uDto -> {
      UserEntity userEntity = this.mapper.map(uDto);

      AddressEntity addressEntity = this.mapper.mapToAddressEntity(uDto);

      GeoEntity geoEntity = this.mapper.mapToGeoEntity(uDto);
      geoEntity.setAddress(addressEntity);

      addressEntity.setGeo(geoEntity);
      addressEntity.setUser(userEntity);

      CompanyEntity companyEntity = this.mapper.mapToCompanyEntity(uDto);
      companyEntity.setUser(userEntity);

      List<PostEntity> postEntities = postPlaceHolders.stream() //
          .filter(pDto -> pDto.getUserId().equals(uDto.getId())) //
          .map(pDto -> {
            PostEntity postEntity = this.mapper.map(pDto);

            List<CommentEntity> commentEntities = commentPlaceHolders.stream() //
                .filter(cDto -> cDto.getPostId().equals(pDto.getId())) //
                .map(cDto -> {
                  CommentEntity commentEntity = this.mapper.map(cDto);
                  commentEntity.setPost(postEntity);
                  return commentEntity;
                }).collect(Collectors.toList());

            postEntity.setComments(commentEntities);
            postEntity.setUser(userEntity);
            return postEntity;
          }) //
          .collect(Collectors.toList());

      userEntity.setAddressEntity(addressEntity);
      userEntity.setCompanyEntity(companyEntity);
      userEntity.setPosts(postEntities);
      return userEntity;
    }).collect(Collectors.toList());

      // Save all data to all Users, Posts, Comments, Addresses, Companies, Geos
      userService.saveAll(userEntities);
    // for-loop X 3
    // for (UserPlaceHolder user : userPlaceHolders) {
    //   for (PostPlaceHolder post : postPlaceHolders) {
    //     for (CommentPlaceHolder comment : commentPlaceHolders) {

    //     }
    //   }
    // }
  }

}
