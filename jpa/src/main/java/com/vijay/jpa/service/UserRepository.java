package com.vijay.jpa.service;

import org.springframework.data.jpa.repository.JpaRepository;

import com.vijay.jpa.entity.User;

public interface UserRepository extends JpaRepository<User, Long>{
	

}
