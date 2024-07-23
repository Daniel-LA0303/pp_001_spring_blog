package com.mx.pp.blog.services.posts;

import java.time.LocalDateTime;
import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.mx.pp.blog.models.Posts.PostModel;
import com.mx.pp.blog.models.Users.UsersModel;
import com.mx.pp.blog.repository.posts.PostRepository;
import com.mx.pp.blog.repository.users.UserRepository;
import com.mx.pp.blog.services.posts.dto.PostDTO;

@Service
public class PostServiceImpl implements PostService {

	@Autowired
	private PostRepository postRepository;

	@Autowired
	private UserRepository userRepository;

	/**
	 * Delete a post
	 */
	@Override
	public void deletePost(Long id) {
		@SuppressWarnings("deprecation")
		PostModel post = postRepository.getById(id);
		postRepository.delete(post);
	}

	/**
	 * Get one post
	 */
	@Override
	public Optional<PostModel> getOnePost(Long id) {
		return postRepository.findById(id);
	}

	/**
	 * Get all posts
	 */
	@Override
	public List<PostModel> getPosts() {
		return postRepository.findAll();
	}

	/**
	 * Save one post
	 */
	@Override
	public PostModel newPost(PostDTO post) {

		UsersModel user = userRepository.findById(post.getIdUser())
				.orElseThrow(() -> new RuntimeException("User not found"));

		PostModel newPost = new PostModel();
		newPost.setContent(post.getContent());
		newPost.setDescription(post.getDescription());
		newPost.setTitle(post.getTitle());
		newPost.setDate(LocalDateTime.now());
		newPost.setUser(user);

		return postRepository.save(newPost);
	}

	/**
	 * Update a post
	 */
	@Override
	public PostModel updatePost(Long id, PostDTO postDTO) {
		@SuppressWarnings("deprecation")
		PostModel post = postRepository.getById(id);
		post.setContent(postDTO.getContent());
		post.setDescription(postDTO.getDescription());
		post.setTitle(postDTO.getTitle());

		return postRepository.save(post);
	}

}
