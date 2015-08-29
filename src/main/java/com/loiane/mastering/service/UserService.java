package com.loiane.mastering.service;

import com.loiane.mastering.model.User;

public interface UserService {

	User findById(int id);
	
	User findBySso(String sso);
	
}