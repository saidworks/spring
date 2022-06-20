package com.saidworks.thymleaf.repo;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.saidworks.thymleaf.model.User;



@Repository
public interface UserRepository extends JpaRepository<User, Long> {
  User findByEmail(String email);
}