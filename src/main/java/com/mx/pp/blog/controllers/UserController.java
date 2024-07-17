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

import com.mx.pp.blog.models.Users.UserInfoModel;
import com.mx.pp.blog.models.Users.UsersModel;
import com.mx.pp.blog.services.users.UserInfoService;
import com.mx.pp.blog.services.users.UserService;
import com.mx.pp.blog.services.users.dto.UserAllInfoDTO;
import com.mx.pp.blog.services.users.dto.UserTestDTO;

@RestController
@RequestMapping("/api/users")
public class UserController {
	
	@Autowired
	private UserService userService;
	
	@Autowired
	private UserInfoService userInfoService;
	
	/**
	 * Create a new User
	 * @param user
	 * @return
	 */
	@PostMapping
	public ResponseEntity<UsersModel> saveUser(@RequestBody UsersModel user){
		return new ResponseEntity<>(userService.newUser(user), HttpStatus.CREATED);
	}
	
	/**
	 * Get All users with small info
	 * @return
	 */
	@GetMapping
	public ResponseEntity<Map<String, List<UsersModel>>> getAllUsers() {
	    List<UsersModel> users = userService.getUsers();
	    
	    Map<String, List<UsersModel>> response = new HashMap<>();
	    response.put("users", users);
	    
	    return ResponseEntity.ok(response);
	}
	
	/**
	 * Get one user with small info
	 * @param id
	 * @return
	 */
	@GetMapping("/{id}")
	public ResponseEntity<UsersModel> getOneUser(@PathVariable(name = "id") Long id){
		
		Optional<UsersModel> userOptional = userService.getOneUser(id);

        if (userOptional.isPresent()) {
            return ResponseEntity.ok(userOptional.get());
        } else {
            return ResponseEntity.notFound().build();
        }
	}
	
	/**
	 * Delete a user
	 * @param id
	 * @return
	 */
	@DeleteMapping("/{id}")
	public ResponseEntity<String> deleteUser(@PathVariable(name = "id") Long id){
		userService.deleteUser(id);
		return ResponseEntity.ok("User with ID " + id + " deleted successfully");
	}
	
	/**
	 * New info about user
	 * @param userInfo
	 * @return
	 */
	@PostMapping("/info")
	public ResponseEntity<UserInfoModel> saveUserInfo(@RequestBody UserInfoModel userInfo){
		return new ResponseEntity<>(userInfoService.newUserInfo(userInfo), HttpStatus.CREATED);
	}
	
	/**
	 * Get all info users, a info with user
	 * TODO -- We will do better with @Query, so this we won't use it
	 * @return
	 */
	@GetMapping("/info")
	public ResponseEntity<Map<String, List<UserInfoModel>>> getAllUsersInfo() {
	    List<UserInfoModel> users = userInfoService.getAllUserInfo();
	    
	    Map<String, List<UserInfoModel>> response = new HashMap<>();
	    response.put("usersInfo", users);
	    
	    return ResponseEntity.ok(response);
	}
	
	
	/**
	 * Here we use complex queries 
	 */
	
	/**
	 * This is a test with @Query
	 * @return
	 */
	@GetMapping("/users-details")
	public ResponseEntity<Map<String, List<UserTestDTO>>> getAllUsersDetails() {
	    List<UserTestDTO> users = userService.usersDetails();
	    
	    Map<String, List<UserTestDTO>> response = new HashMap<>();
	    response.put("usersDetails", users);
	    
	    return ResponseEntity.ok(response);
	}
	
	/**
	 * We get a user with all info
	 * @param id
	 * @return
	 */
	@GetMapping("/users-all-info/{id}")
	public ResponseEntity<Map<String, UserAllInfoDTO>> getUserAllInfo(@PathVariable(name = "id") Long id) {
	    UserAllInfoDTO user = userService.userAllInfo(id);
	    
	    Map<String, UserAllInfoDTO> response = new HashMap<>();
	    response.put("userComplete", user);
	    
	    return ResponseEntity.ok(response);
	}
	
}
