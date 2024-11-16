package com.bootcamp.tutorial_practice.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Modifying;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;

import com.bootcamp.tutorial_practice.entity.PostEntity;
import com.bootcamp.tutorial_practice.entity.UserEntity;

/* ! Hibernate / JPA
 * 1. During compile time, genrate Class to implement thisintereface
 * 2. Implement theall the method according to the DB driver
 * 3. Construct the corresponding Entity Java Object
 * 
 */
@Repository
public interface UserRepository extends JpaRepository<UserEntity, Long> {

    /*
     * save() -> insert into
     * findAll()
     * findById()
     * delete()
     * count()
     * deleteById()
     */

    // // select * from Users where name = ?
    // List<UserEntity> findByName(String name);

    // List<UserEntity> findByNameAndWebsiteAndEmailAndPhoneAndUsername(String name,
    // String username,
    // String website,
    // String phone,
    // String email);

    // List<UserEntity> findbyIdOrfindByName(String Name, Long id);
    // List<UserEntity> findByNameSortById(String Name,Long id);

    // ! JPA method : 1)Built-in 
    // save() -> insert into Users value(..) -> map

    // ! JPA method : 2)Custom method 
    List<UserEntity> findByUsername(String username);
    List<UserEntity> findByEmail(String email);
    
    // List<UserEntity> findByPhone(String phone);

    // List<UserEntity> findByWebsite(String website);

    // ! JPQL
// Syntax is similar to SQL
    // e.username is the Entity attribute 
    // support AND, OR, INNER JOIN, LEFT JOIN, etc.....
    @Query("SELECT e FROM UserEntity e where e.username = : username")
    UserEntity findByUsername2(@Param("username") String username);

    // Native Query, SQL language.
    // p.username is column name
    @Query(value = "SELECT * FROM p_users p WHERE p.colUsername = username",
        nativeQuery = true)
    UserEntity findByUsername3(@Param("username") String username);
    
    @Query("SELECT e FROM UserEntity e where e.username = : username ORDER BY e.website DESC")
    UserEntity findByUsernameOrderedByWebsiteDesc(@Param("username") String username);

    // SQL must be right or SQLError
    @Modifying
    @Query(value = "UPDATE p_users p SET colEmail = : userEmail where id = : id", nativeQuery = true)
    int updateUserEmail(@Param("userEmail") String userEmail, @Param("id") Long id);
}
