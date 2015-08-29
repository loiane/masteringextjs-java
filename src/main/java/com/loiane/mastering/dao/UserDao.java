package com.loiane.mastering.dao;

import com.loiane.mastering.model.User;

public interface UserDao {

	User findById(int id);
	
	User findBySSO(String sso);
	
}

