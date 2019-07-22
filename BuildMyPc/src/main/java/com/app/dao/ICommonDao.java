package com.app.dao;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;

import com.app.other.EnumCategory;
import com.app.other.EnumRole;
import com.app.pojos.Login;
import com.app.pojos.User;


public interface ICommonDao extends JpaRepository<Login,String>{
	
	 public List<EnumCategory> fetchCategory();
	//public EnumRole loginUser(Login login);
	//public User fetchUser(Login l);
	//public boolean signUp(User u, Login login);

}
