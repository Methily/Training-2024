package com.example.demo.dao;

import org.springframework.data.repository.CrudRepository;

import com.example.demo.entities.User;

public interface UserRepository extends CrudRepository<User, Integer>{
	
}
