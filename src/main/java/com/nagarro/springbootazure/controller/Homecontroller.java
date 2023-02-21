package com.nagarro.springbootazure.controller;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

import com.nagarro.springbootazure.entity.User;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/users")
public class Homecontroller {
	
	@GetMapping("/")
	public List<User> getallusers(){
		List<User> mylist = new ArrayList<>(Arrays.asList(new User(1,"shailya","123@gmail.com","123456789"),new User(2,"aman","1234@gmail.com","125456789")));
		return mylist;
	}
}
