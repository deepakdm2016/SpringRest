package com.deepak.oauth.data.repos;

import org.springframework.data.repository.CrudRepository;

import com.deepak.oauth.data.entities.User;


public interface UserRepository extends CrudRepository<User, Integer> {

	User findByName(String name);
	
}
