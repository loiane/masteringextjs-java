package com.loiane.mastering.dao;

import com.loiane.mastering.model.User;

import java.util.List;

public interface UserDao {

	User findById(int id);
	
	User findBySSO(String sso);

	List<User> findAll();
	
}

