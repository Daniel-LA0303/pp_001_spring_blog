package com.mx.pp.blog.services.users;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.mx.pp.blog.models.Users.UserImageModel;
import com.mx.pp.blog.repository.users.UserImageRepository;
import com.mx.pp.blog.services.users.dto.UserImageDTO;

@Service
public class UserImageImpl implements UserImageService {

	@Autowired
	private UserImageRepository userImageRepository;

	@Override
	public void deleteUserImage(Long id) {

		@SuppressWarnings("deprecation")
		UserImageModel userImage = userImageRepository.getById(id);
		userImageRepository.delete(userImage);
	}

	@Override
	public List<UserImageModel> getAllUserImage() {
		return userImageRepository.findAll();
	}

	@Override
	public Optional<UserImageModel> getOneUserImage(Long id) {
		return userImageRepository.findById(id);
	}

	@Override
	public UserImageModel newUserImage(UserImageModel userImage) {
		UserImageModel newUserImage = userImageRepository.save(userImage);
		return newUserImage;
	}

	@Override
	public UserImageModel updateUserImage(Long id, UserImageDTO userImageDTO) {

		@SuppressWarnings("deprecation")
		UserImageModel userImage = userImageRepository.getById(id);
		userImage.setPublicID(userImageDTO.getPublicID());
		userImage.setSecureURL(userImageDTO.getSecureURL());
		return userImageRepository.save(userImage);
	}

}
