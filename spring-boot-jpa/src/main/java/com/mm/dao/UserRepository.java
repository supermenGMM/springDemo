package com.mm.dao;

import com.mm.domain.User;
import org.springframework.beans.factory.annotation.Required;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;

import javax.validation.constraints.Max;
import java.util.List;

public interface UserRepository extends JpaRepository<User, Long> {
    List<User> findByName(String name);

    List<User> findByNameAndAge(String name, Integer age);

    @Query("from User u where u.name = :name")
    List<User> findUser(@Param("name") String name);

}
