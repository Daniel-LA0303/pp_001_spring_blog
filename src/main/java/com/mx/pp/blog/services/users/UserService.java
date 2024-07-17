package com.mx.pp.blog.services.users;

import java.util.List;
import java.util.Optional;

import com.mx.pp.blog.models.Users.UsersModel;
import com.mx.pp.blog.services.users.dto.UserAllInfoDTO;
import com.mx.pp.blog.services.users.dto.UserTestDTO;

public interface UserService {
	
	public UsersModel newUser(UsersModel user);
	
	public List<UsersModel> getUsers();
	
	public Optional<UsersModel> getOneUser(Long id);
	
	public UsersModel updateUser(Long id);
	
	public void deleteUser(Long id);
	
	/**
	 * Complex queries
	 */
	
	public List<UserTestDTO> usersDetails();
	
	public UserAllInfoDTO userAllInfo(Long id);

}
