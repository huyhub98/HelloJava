package com.ifi.transport.repository;

import com.ifi.transport.entity.User;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;

public interface UserRepository extends JpaRepository<User, Integer> {
    @Query(value = "SELECT u FROM User u WHERE u.username = :username OR u.phoneNumber = :phoneNumber AND u.password = :password")
    User check(@Param("username") String username, @Param("phoneNumber") int phoneNumber, @Param("password") String password);
}