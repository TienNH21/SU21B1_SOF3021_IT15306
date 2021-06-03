package com.it15306.repositories;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.it15306.entity.User;

@Repository
public interface UserRepository extends JpaRepository<User, Integer>{
}
