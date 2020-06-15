package com.example.springboot05.repository;

import com.example.springboot05.entity.User;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.CrudRepository;
import java.util.List;
import org.springframework.data.repository.query.Param;

public interface UserRepository extends CrudRepository<User,Long> {
    //<!--Iterable<User> findByname(String name);-->
    List<User> findByName(@Param("name") String name);
}
