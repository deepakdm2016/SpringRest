package com.deepak.oauth.data.repos;

import org.springframework.data.repository.CrudRepository;

import com.deepak.restws.Entities.User;


public interface UserRepository extends CrudRepository<User, Integer> {

	User findByName(String name);
	
}
