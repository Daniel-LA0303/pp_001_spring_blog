package com.mx.pp.blog.services.users;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.mx.pp.blog.models.Users.UserInfoModel;
import com.mx.pp.blog.repository.users.UserInfoRepository;

@Service
public class UserInfoServiceImpl implements UserInfoService{
	
	@Autowired
	private UserInfoRepository userInfoRepository;

	@Override
	public UserInfoModel newUserInfo(UserInfoModel userInfo) {
		
		UserInfoModel newUserInfo = userInfoRepository.save(userInfo);
		return newUserInfo;
	}

	@Override
	public Optional<UserInfoModel> getOneUserInfo(Long id) {
		
		return userInfoRepository.findById(id);
	}

	@Override
	public List<UserInfoModel> getAllUserInfo() {
		List<UserInfoModel> userInfos = userInfoRepository.findAll();
		return userInfos;
	}

	@Override
	public void deleteUserInfo(Long id) {
		
		@SuppressWarnings("deprecation")
		UserInfoModel userInfo = userInfoRepository.getById(id);
		userInfoRepository.delete(userInfo);
		
	}
	
	
	
	

}
