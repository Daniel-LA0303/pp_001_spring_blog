package com.mx.pp.blog.services.users;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.mx.pp.blog.models.Users.UsersModel;
import com.mx.pp.blog.repository.users.UserRepository;

@Service
public class UserServiceImpl implements UserService{

	@Autowired
	private UserRepository userRepository;

	@Override
	public UsersModel newUser(UsersModel user) {
		
		/*UsersModel newUser;
		newUser.setName(user.getName());
		newUser.setEmail(user.getEmail());
		newUser.setPassword(user.getPassword());
		newUser.setToken("");*/
		UsersModel newUser = userRepository.save(user);
		return newUser;
	}
	
	

	@Override
	public List<UsersModel> getUsers() {
		
		List<UsersModel> users = userRepository.findAll();
		
		return users;
	}

	@Override
	public Optional<UsersModel> getOneUser(Long id) {
		
		
		//UsersModel user = userRepository.findById(id);
		
		return userRepository.findById(id);
	}

	@Override
	public UsersModel updateUser(Long id) {
		
		//@SuppressWarnings("deprecation")
		//UsersModel user = userRepository.getById(id);
		
		
		return null;
	}

	@Override
	public void deleteUser(Long id) {
		@SuppressWarnings("deprecation")
		UsersModel user = userRepository.getById(id);
		userRepository.delete(user);
	}
	
}
