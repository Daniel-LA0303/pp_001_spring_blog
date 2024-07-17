package com.mx.pp.blog.repository.users;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.repository.CrudRepository;

import com.mx.pp.blog.models.Users.UsersModel;

public interface UserRepository extends JpaRepository<UsersModel, Long>{
	
	
	
	
}
