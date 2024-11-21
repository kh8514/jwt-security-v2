package com.devrection.jwtsecurityv2.repository;


import com.devrection.jwtsecurityv2.entity.UserEntity;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

public interface UserRepository extends JpaRepository<UserEntity, Integer> {
    UserEntity findByUsername(String username);

    Boolean existsByUsername(String username);
}
