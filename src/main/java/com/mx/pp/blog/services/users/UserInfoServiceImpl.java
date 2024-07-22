package com.mx.pp.blog.services.users;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.mx.pp.blog.models.Users.UserInfoModel;
import com.mx.pp.blog.repository.users.UserInfoRepository;
import com.mx.pp.blog.services.users.dto.UserInfoDTO;

@Service
public class UserInfoServiceImpl implements UserInfoService {

	@Autowired
	private UserInfoRepository userInfoRepository;

	/**
	 * delete info
	 */
	@Override
	public void deleteUserInfo(Long id) {
		@SuppressWarnings("deprecation")
		UserInfoModel userInfo = userInfoRepository.getById(id);
		userInfoRepository.delete(userInfo);
	}

	/**
	 * Get all info users
	 */
	@Override
	public List<UserInfoModel> getAllUserInfo() {
		List<UserInfoModel> userInfo = userInfoRepository.findAll();
		return userInfo;
	}

	/**
	 * Get one user info
	 */
	@Override
	public Optional<UserInfoModel> getOneUserInfo(Long id) {
		return userInfoRepository.findById(id);
	}

	/**
	 * New info user
	 */
	@Override
	public UserInfoModel newUserInfo(UserInfoModel userInfo) {
		UserInfoModel newUserInfo = userInfoRepository.save(userInfo);
		return newUserInfo;
	}

	@Override
	public UserInfoModel updateUserInfoModel(Long id, UserInfoDTO userInfoDTO) {
		@SuppressWarnings("deprecation")
		UserInfoModel userInfo = userInfoRepository.getById(id);

		userInfo.setAge(userInfoDTO.getAge());
		userInfo.setBiography(userInfoDTO.getBiography());
		userInfo.setCity(userInfoDTO.getCity());
		userInfo.setCountry(userInfoDTO.getCountry());
		userInfo.setGender(userInfoDTO.getGender());
		userInfo.setPhone(userInfoDTO.getPhone());
		userInfo.setWebsite(userInfoDTO.getWebsite());

		return userInfoRepository.save(userInfo);
	}

}
