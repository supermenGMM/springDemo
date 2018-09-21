package com.mm.dao.supermeng;

import com.mm.domain.supermeng.User;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;

import javax.validation.constraints.Max;
import java.util.List;
@Repository
public interface UserRepository extends JpaRepository<User, Long> {
    List<User> findByName(String name);

    List<User> findByNameAndAge(String name, Integer age);

    @Query("from User u where u.name = :name")
    List<User> findUser(@Param("name") String name);

    List<User> findTop5();

    @Query(nativeQuery = true,value = "select * from user limit 0,6")
    List<User> findTop6();

}
