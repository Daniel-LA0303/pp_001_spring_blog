package com.mx.pp.blog.controllers;

import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.mx.pp.blog.models.Users.UsersModel;
import com.mx.pp.blog.services.users.UserService;

@RestController
@RequestMapping("/api/users")
public class UserController {
	
	@Autowired
	private UserService userService;
	
	@PostMapping
	public ResponseEntity<UsersModel> saveUser(@RequestBody UsersModel user){
		return new ResponseEntity<>(userService.newUser(user), HttpStatus.CREATED);
	}
	
	@GetMapping
	public ResponseEntity<Map<String, List<UsersModel>>> getAllUsers() {
	    List<UsersModel> users = userService.getUsers();
	    
	    Map<String, List<UsersModel>> response = new HashMap<>();
	    response.put("users", users);
	    
	    return ResponseEntity.ok(response);
	}
	
	@GetMapping("/{id}")
	public ResponseEntity<UsersModel> getOneUser(@PathVariable(name = "id") Long id){
		
		Optional<UsersModel> userOptional = userService.getOneUser(id);

        if (userOptional.isPresent()) {
            return ResponseEntity.ok(userOptional.get());
        } else {
            return ResponseEntity.notFound().build();
        }
	}
	
	@DeleteMapping("/{id}")
	public ResponseEntity<String> deleteUser(@PathVariable(name = "id") Long id){
		userService.deleteUser(id);
		return ResponseEntity.ok("User with ID " + id + " deleted successfully");
	}
	
	
}
