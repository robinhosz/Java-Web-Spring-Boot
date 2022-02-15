package com.devjava.userdept.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.devjava.userdept.entities.User;

public interface UserRepository extends JpaRepository<User, Long>{

}
