package com.mx.pp.blog.services.users;

import java.util.List;
import java.util.Optional;

import com.mx.pp.blog.models.Users.UserImageModel;
import com.mx.pp.blog.services.users.dto.UserImageDTO;

public interface UserImageService {

	public void deleteUserImage(Long id);

	public List<UserImageModel> getAllUserImage();

	public Optional<UserImageModel> getOneUserImage(Long id);

	public UserImageModel newUserImage(UserImageModel userImage);

	public UserImageModel updateUserImage(Long id, UserImageDTO userImageDTO);

}
