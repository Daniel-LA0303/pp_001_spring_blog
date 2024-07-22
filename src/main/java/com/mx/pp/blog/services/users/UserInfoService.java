package com.mx.pp.blog.services.users;

import java.util.List;
import java.util.Optional;

import com.mx.pp.blog.models.Users.UserInfoModel;
import com.mx.pp.blog.services.users.dto.UserInfoDTO;

public interface UserInfoService {

	public void deleteUserInfo(Long info);

	public List<UserInfoModel> getAllUserInfo();

	public Optional<UserInfoModel> getOneUserInfo(Long id);

	public UserInfoModel newUserInfo(UserInfoModel userInfo);

	public UserInfoModel updateUserInfoModel(Long id, UserInfoDTO userInfoDTO);

}
