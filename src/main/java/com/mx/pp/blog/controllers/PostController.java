package com.mx.pp.blog.controllers;

import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.mx.pp.blog.models.Posts.PostModel;
import com.mx.pp.blog.services.posts.PostService;
import com.mx.pp.blog.services.posts.dto.PostDTO;

@RestController
@RequestMapping("/api/posts")
public class PostController {

	@Autowired
	private PostService postService;

	/**
	 * Delete a user
	 * 
	 * @param id
	 * @return
	 */
	@DeleteMapping("/{id}")
	public ResponseEntity<String> deleteUser(@PathVariable(name = "id") Long id) {
		postService.deletePost(id);
		return ResponseEntity.ok("Post with ID " + id + " deleted successfully");
	}

	/**
	 * Get All posts
	 * 
	 * @return
	 */
	@GetMapping
	public ResponseEntity<Map<String, List<PostModel>>> getAllUsers() {
		List<PostModel> posts = postService.getPosts();

		Map<String, List<PostModel>> response = new HashMap<>();
		response.put("posts", posts);

		return ResponseEntity.ok(response);
	}

	/**
	 * Get one post
	 * 
	 * @param id
	 * @return
	 */
	@GetMapping("/{id}")
	public ResponseEntity<PostModel> getOneUser(@PathVariable(name = "id") Long id) {

		Optional<PostModel> postOptional = postService.getOnePost(id);

		if (postOptional.isPresent()) {
			return ResponseEntity.ok(postOptional.get());
		} else {
			return ResponseEntity.notFound().build();
		}
	}

	/**
	 * Create a new Post
	 * 
	 * @param user
	 * @return
	 */
	@PostMapping
	public ResponseEntity<PostModel> savePost(@RequestBody PostDTO post) {
		return new ResponseEntity<>(postService.newPost(post), HttpStatus.CREATED);
	}

	/**
	 * Update Post
	 * 
	 * @param id
	 * @param user
	 * @return
	 */
	@PutMapping("/{id}")
	public ResponseEntity<PostModel> updateUserImage(@PathVariable(name = "id") Long id,
			@RequestBody PostDTO postModel) {

		PostModel post = postService.updatePost(id, postModel);
		return ResponseEntity.ok(post);

	}

}
