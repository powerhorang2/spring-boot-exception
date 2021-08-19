package com.example.exception.controller;

import javax.validation.Valid;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.MethodArgumentNotValidException;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.example.exception.dto.User;

@RestController
@RequestMapping("/api")
public class ApiController {

	@GetMapping("/user")
	public User get(@RequestParam(required = false) String name, @RequestParam(required = false) Integer age) {
		User user = new User();
		user.setName(name);
		user.setAge(age);
		
		int a = 10 + age;
		
		return user;
	}
	
	@PostMapping("/user")
	public User post(@Valid @RequestBody User user) {
		System.out.println(user);
		return user;
	}
	
	@ExceptionHandler(value = MethodArgumentNotValidException.class)
	public ResponseEntity methodArgumentNotValidException(MethodArgumentNotValidException e) {
		System.out.println("api controller");
		return ResponseEntity.status(HttpStatus.BAD_REQUEST).body(e.getMessage());
	}
}
