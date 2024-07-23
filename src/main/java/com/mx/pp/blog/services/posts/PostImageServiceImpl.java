package com.mx.pp.blog.services.posts;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.mx.pp.blog.models.Posts.PostImageModel;
import com.mx.pp.blog.models.Posts.PostModel;
import com.mx.pp.blog.repository.posts.PostImageRepository;
import com.mx.pp.blog.repository.posts.PostRepository;
import com.mx.pp.blog.services.posts.dto.PostImageDTO;

@Service
public class PostImageServiceImpl implements PostImageService {

	@Autowired
	private PostImageRepository postImageRepository;

	@Autowired
	private PostRepository postRepository;

	/**
	 * Delete post
	 */
	@Override
	public void deletePostImage(Long id) {

		@SuppressWarnings("deprecation")
		PostImageModel post = postImageRepository.getById(id);
		postImageRepository.delete(post);

	}

	/**
	 * Get all post image
	 */
	@Override
	public List<PostImageModel> getAllPostImage() {
		return postImageRepository.findAll();
	}

	/**
	 * Get one post image
	 */
	@Override
	public Optional<PostImageModel> getOnePostImage(Long id) {
		return postImageRepository.findById(id);
	}

	/**
	 * New post image
	 */
	@Override
	public PostImageModel newPostImage(PostImageDTO postImageDTO) {

		@SuppressWarnings("deprecation")
		PostModel post = postRepository.findById(postImageDTO.getId())
				.orElseThrow(() -> new RuntimeException("Post not found"));

		PostImageModel postImage = new PostImageModel();
		postImage.setPost(post);
		postImage.setPublicID(postImageDTO.getPublicID());
		postImage.setSecureURL(postImageDTO.getSecureURL());

		return postImageRepository.save(postImage);
	}

	/**
	 * Update post image
	 */
	@Override
	public PostImageModel updatePostImage(Long id, PostImageDTO postImageDTO) {

		@SuppressWarnings("deprecation")
		PostImageModel postImage = postImageRepository.getById(id);
		postImage.setPublicID(postImageDTO.getPublicID());
		postImage.setSecureURL(postImageDTO.getSecureURL());

		return postImageRepository.save(postImage);
	}

}
