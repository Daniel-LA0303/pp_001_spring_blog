package com.mx.pp.blog.services.users;

import java.util.List;
import java.util.Optional;

import com.mx.pp.blog.models.Users.UsersModel;

public interface UserService {
	
	public UsersModel newUser(UsersModel user);
	
	public List<UsersModel> getUsers();
	
	public Optional<UsersModel> getOneUser(Long id);
	
	public UsersModel updateUser(Long id);
	
	public void deleteUser(Long id);

}
