package com.mx.pp.blog.services.users;

import java.util.List;
import java.util.Optional;

import com.mx.pp.blog.models.Users.UserInfoModel;

public interface UserInfoService {
	
	public UserInfoModel newUserInfo(UserInfoModel userInfo);
	
	public Optional<UserInfoModel> getOneUserInfo(Long id);
	
	public List<UserInfoModel> getAllUserInfo();
	
	public void deleteUserInfo(Long info);

}
