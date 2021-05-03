package com.example.config.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Component;
import org.springframework.stereotype.Repository;

import com.example.config.domain.UserInformation;

@Repository
@Component
public interface UserRepository extends JpaRepository<UserInformation, Integer> {
}
