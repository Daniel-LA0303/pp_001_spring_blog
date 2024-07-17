package com.mx.pp.blog.repository.users;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

import com.mx.pp.blog.models.Users.UserInfoModel;

public interface UserInfoRepository extends JpaRepository<UserInfoModel, Long>{
	
	//@Query()
	
	
	
}
