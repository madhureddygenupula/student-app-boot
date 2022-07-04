package com.ty.studentappboot;

import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class UserController {

	@PostMapping("user")
	public String saveUser() {
		return "Save method is called";
	}
	
	@GetMapping("user")
	public String getuser() {
		return "get method is called";
		
	}
	
	@PutMapping("user")
	public String updateUser() {
		return "update Method is called";
	}
	
	@DeleteMapping("user")
	public String deleteUser() {
		return "delete method is called";
		
	}
	@GetMapping("user/{id}")
	public String getUserById(@PathVariable int id) {
		return "getUserById method is called";
	}
}
