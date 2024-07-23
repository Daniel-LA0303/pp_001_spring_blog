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

import com.mx.pp.blog.models.Posts.PostImageModel;
import com.mx.pp.blog.models.Posts.PostModel;
import com.mx.pp.blog.services.posts.PostImageService;
import com.mx.pp.blog.services.posts.PostService;
import com.mx.pp.blog.services.posts.dto.PostDTO;
import com.mx.pp.blog.services.posts.dto.PostImageDTO;

@RestController
@RequestMapping("/api/posts")
public class PostController {

	@Autowired
	private PostService postService;

	@Autowired
	private PostImageService postImageService;

	/**
	 * Delete a post
	 * 
	 * @param id
	 * @return
	 */
	@DeleteMapping("/{id}")
	public ResponseEntity<String> deletePost(@PathVariable(name = "id") Long id) {
		postService.deletePost(id);
		return ResponseEntity.ok("Post with ID " + id + " deleted successfully");
	}

	/**
	 * Delete a post image
	 * 
	 * @param id
	 * @return
	 */
	@DeleteMapping("/post-image/{id}")
	public ResponseEntity<String> deletePostImage(@PathVariable(name = "id") Long id) {
		postImageService.deletePostImage(id);
		return ResponseEntity.ok("Post Image with ID " + id + " deleted successfully");
	}

	/**
	 * Get all post Image
	 * 
	 * @return
	 */
	@GetMapping("/post-image")
	public ResponseEntity<Map<String, List<PostImageModel>>> getAllPostImage() {
		List<PostImageModel> posts = postImageService.getAllPostImage();

		Map<String, List<PostImageModel>> response = new HashMap<>();
		response.put("posts image", posts);

		return ResponseEntity.ok(response);
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
	 * Get one post image
	 * 
	 * @param id
	 * @return
	 */
	@GetMapping("/post-image/{id}")
	public ResponseEntity<PostImageModel> getOnePostImage(@PathVariable(name = "id") Long id) {

		Optional<PostImageModel> postOptional = postImageService.getOnePostImage(id);

		if (postOptional.isPresent()) {
			return ResponseEntity.ok(postOptional.get());
		} else {
			return ResponseEntity.notFound().build();
		}
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
	 * Create a new Post Image
	 * 
	 * @param user
	 * @return
	 */
	@PostMapping("/post-image")
	public ResponseEntity<PostImageModel> savePostImage(@RequestBody PostImageDTO post) {
		return new ResponseEntity<>(postImageService.newPostImage(post), HttpStatus.CREATED);
	}

	/**
	 * Update Post
	 * 
	 * @param id
	 * @param user
	 * @return
	 */
	@PutMapping("/{id}")
	public ResponseEntity<PostModel> updatePost(@PathVariable(name = "id") Long id, @RequestBody PostDTO postModel) {

		PostModel post = postService.updatePost(id, postModel);
		return ResponseEntity.ok(post);

	}

	/**
	 * Update a post image
	 * 
	 * @param id
	 * @param postImageDTO
	 * @return
	 */
	@PutMapping("/post-image/{id}")
	public ResponseEntity<PostImageModel> updatePostImage(@PathVariable(name = "id") Long id,
			@RequestBody PostImageDTO postImageDTO) {

		PostImageModel post = postImageService.updatePostImage(id, postImageDTO);
		return ResponseEntity.ok(post);

	}

}
