package com.loiane.mastering.service;

import com.loiane.mastering.model.User;

import java.util.List;

public interface UserService {

	User findById(int id);
	
	User findBySso(String sso);

	List<User> findAll();
}