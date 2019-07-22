package com.app.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.app.dao.ICommonDao;
import com.app.other.EnumRole;
import com.app.pojos.Login;
import com.app.pojos.User;


@CrossOrigin(origins = "http://localhost:4200",allowedHeaders="*")
@RestController
@RequestMapping("/Common")
public class CommonController {
	@Autowired
	private ICommonDao dao; 
	

	@PostMapping("/login")
	public EnumRole logIn(@RequestBody Login l){
		EnumRole role =EnumRole.ADMIN;//= dao.loginUser(l);
		//User u = dao.fetchUser(l);
		return role;
	}
	
	@PostMapping("/SignUp")
	public boolean signUp(@RequestBody User u,@RequestParam String password){
		
		//dao.signUp(u,new Login(u.getEmail(),password,EnumRole.USER));
		
		return false;
	}

}