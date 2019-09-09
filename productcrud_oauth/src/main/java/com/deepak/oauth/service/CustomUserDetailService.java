package com.deepak.oauth.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.security.core.userdetails.UserDetailsService;
import org.springframework.security.core.userdetails.UsernameNotFoundException;
import org.springframework.stereotype.Service;

import com.deepak.oauth.data.repos.UserRepository;
import com.deepak.restws.Entities.User;


@Service
public class CustomUserDetailService implements UserDetailsService {

	@Autowired
	UserRepository ur;
	
	@Override
	public UserDetails loadUserByUsername(String name) throws UsernameNotFoundException {
		User u = ur.findByName(name);
		return new org.springframework.security.core.userdetails.User(u.getName(),u.getPassword(),u.getRoles());
	}

}
