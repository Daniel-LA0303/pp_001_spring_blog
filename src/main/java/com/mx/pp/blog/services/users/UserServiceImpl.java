package com.mx.pp.blog.services.users;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.mx.pp.blog.models.Users.UsersModel;
import com.mx.pp.blog.repository.users.UserRepository;
import com.mx.pp.blog.services.users.dto.UserAllInfoDTO;
import com.mx.pp.blog.services.users.dto.UserTestDTO;

@Service
public class UserServiceImpl implements UserService {

	@Autowired
	private UserRepository userRepository;

	/**
	 * Delete one use
	 */
	@Override
	public void deleteUser(Long id) {
		@SuppressWarnings("deprecation")
		UsersModel user = userRepository.getById(id);
		userRepository.delete(user);
	}

	/**
	 * Get one user
	 */
	@Override
	public Optional<UsersModel> getOneUser(Long id) {
		return userRepository.findById(id);
	}

	/**
	 * Get all users
	 */
	@Override
	public List<UsersModel> getUsers() {
		List<UsersModel> users = userRepository.findAll();
		return users;
	}

	/**
	 * Add a new user
	 */
	@Override
	public UsersModel newUser(UsersModel user) {
		UsersModel newUser = userRepository.save(user);
		return newUser;
	}

	/**
	 * update user
	 */
	@Override
	public UsersModel updateUser(Long id) {
		// @SuppressWarnings("deprecation")
		// UsersModel user = userRepository.getById(id);
		return null;
	}

	/**
	 * Complex queries
	 */

	/**
	 * We get a user with all info
	 */
	@Override
	public UserAllInfoDTO userAllInfo(Long id) {
		return userRepository.findUserAllInfo(id);
	}

	/**
	 * Test Query
	 */
	@Override
	public List<UserTestDTO> usersDetails() {
		return userRepository.findUsersDetails();
	}

}
