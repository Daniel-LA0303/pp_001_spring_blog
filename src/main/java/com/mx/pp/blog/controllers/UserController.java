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
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.mx.pp.blog.models.Users.UserImageModel;
import com.mx.pp.blog.models.Users.UserInfoModel;
import com.mx.pp.blog.models.Users.UsersModel;
import com.mx.pp.blog.services.users.UserImageService;
import com.mx.pp.blog.services.users.UserInfoService;
import com.mx.pp.blog.services.users.UserService;
import com.mx.pp.blog.services.users.dto.UserAllInfoDTO;
import com.mx.pp.blog.services.users.dto.UserImageDTO;
import com.mx.pp.blog.services.users.dto.UserInfoDTO;
import com.mx.pp.blog.services.users.dto.UserTestDTO;

@RestController
@RequestMapping("/api/users")
public class UserController {

	@Autowired
	private UserService userService;

	@Autowired
	private UserInfoService userInfoService;

	@Autowired
	private UserImageService userImageService;

	/**
	 * Delete a user
	 * 
	 * @param id
	 * @return
	 */
	@DeleteMapping("/{id}")
	public ResponseEntity<String> deleteUser(@PathVariable(name = "id") Long id) {
		userService.deleteUser(id);
		return ResponseEntity.ok("User with ID " + id + " deleted successfully");
	}

	@DeleteMapping("/user-image/{id}")
	public ResponseEntity<String> deleteUserImage(@PathVariable(name = "id") Long id) {
		userImageService.deleteUserImage(id);
		return ResponseEntity.ok("User image with ID " + id + " deleted successfully");
	}

	/**
	 * Delete one info of on user
	 * 
	 * @param id
	 * @return
	 */
	@DeleteMapping("/user-info/{id}")
	public ResponseEntity<String> deleteUserInfo(@PathVariable(name = "id") Long id) {
		userInfoService.deleteUserInfo(id);
		return ResponseEntity.ok("UserInfo with ID " + id + " deleted successfully");
	}

	/**
	 * Get All User Image
	 * 
	 * @return
	 */
	@GetMapping("/user-image")
	public ResponseEntity<Map<String, List<UserImageModel>>> getAllUserImage() {

		List<UserImageModel> users = userImageService.getAllUserImage();

		Map<String, List<UserImageModel>> response = new HashMap<>();
		response.put("users image", users);

		return ResponseEntity.ok(response);

	}

	/**
	 * Get All users
	 * 
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
	 * This is a test with @Query
	 * 
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
	 * Get all info users
	 * 
	 * @return
	 */
	@GetMapping("/user-info")
	public ResponseEntity<Map<String, List<UserInfoModel>>> getAllUsersInfo() {
		List<UserInfoModel> users = userInfoService.getAllUserInfo();

		Map<String, List<UserInfoModel>> response = new HashMap<>();
		response.put("usersInfo", users);

		return ResponseEntity.ok(response);
	}

	/**
	 * Get one user
	 * 
	 * @param id
	 * @return
	 */
	@GetMapping("/{id}")
	public ResponseEntity<UsersModel> getOneUser(@PathVariable(name = "id") Long id) {

		Optional<UsersModel> userOptional = userService.getOneUser(id);

		if (userOptional.isPresent()) {
			return ResponseEntity.ok(userOptional.get());
		} else {
			return ResponseEntity.notFound().build();
		}
	}

	/**
	 * Get One User Image
	 * 
	 * @param id
	 * @return
	 */
	@GetMapping("/user-image/{id}")
	public ResponseEntity<UserImageModel> getOneUserImage(@PathVariable(name = "id") Long id) {

		Optional<UserImageModel> userImage = userImageService.getOneUserImage(id);

		if (userImage.isPresent()) {
			return ResponseEntity.ok(userImage.get());
		} else {
			return ResponseEntity.notFound().build();
		}

	}

	/**
	 * Get One User Info
	 * 
	 * @param id
	 * @return
	 */
	@GetMapping("/user-info/{id}")
	public ResponseEntity<UserInfoModel> getOneUserInfo(@PathVariable(name = "id") Long id) {

		Optional<UserInfoModel> userInfoModel = userInfoService.getOneUserInfo(id);

		if (userInfoModel.isPresent()) {
			return ResponseEntity.ok(userInfoModel.get());
		} else {
			return ResponseEntity.notFound().build();
		}

	}

	/**
	 * We get a user with all info
	 * 
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

	/**
	 * Create a new User
	 * 
	 * @param user
	 * @return
	 */
	@PostMapping
	public ResponseEntity<UsersModel> saveUser(@RequestBody UsersModel user) {
		return new ResponseEntity<>(userService.newUser(user), HttpStatus.CREATED);
	}

	@PostMapping("/user-image")
	public ResponseEntity<UserImageModel> saveUserImage(@RequestBody UserImageModel userImage) {
		return new ResponseEntity<>(userImageService.newUserImage(userImage), HttpStatus.CREATED);
	}

	/**
	 * Create a new User info
	 * 
	 * @param userInfo
	 * @return
	 */
	@PostMapping("/info")
	public ResponseEntity<UserInfoModel> saveUserInfo(@RequestBody UserInfoModel userInfo) {
		return new ResponseEntity<>(userInfoService.newUserInfo(userInfo), HttpStatus.CREATED);
	}

	/**
	 * Update User Image
	 * 
	 * @param id
	 * @param user
	 * @return
	 */
	@PutMapping("/user-image/{id}")
	public ResponseEntity<UserImageModel> updateUserImage(@PathVariable(name = "id") Long id,
			@RequestBody UserImageDTO user) {

		UserImageModel userInfo = userImageService.updateUserImage(id, user);
		return ResponseEntity.ok(userInfo);

	}

	/**
	 * Update User Info
	 * 
	 * @param id
	 * @param user
	 * @return
	 */
	@PutMapping("/user-info/{id}")
	public ResponseEntity<UserInfoModel> updateUserInfo(@PathVariable(name = "id") Long id,
			@RequestBody UserInfoDTO user) {

		UserInfoModel userInfo = userInfoService.updateUserInfoModel(id, user);
		return ResponseEntity.ok(userInfo);

	}

}
