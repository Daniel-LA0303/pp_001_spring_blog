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

import com.mx.pp.blog.models.comment.CommentModel;
import com.mx.pp.blog.services.comment.CommentService;
import com.mx.pp.blog.services.comment.dto.CommentDTO;
import com.mx.pp.blog.services.comment.dto.CommentUpdateDTO;

@RestController
@RequestMapping("/api/comments")
public class CommentController {

	@Autowired
	private CommentService commentService;

	/**
	 * Delete a comment
	 * 
	 * @param id
	 * @return
	 */
	@DeleteMapping("/{id}")
	public ResponseEntity<String> deleteCategory(@PathVariable(name = "id") Long id) {
		commentService.deleteComment(id);
		return ResponseEntity.ok("Comment with ID " + id + " deleted successfully");
	}

	/**
	 * Get all comments
	 * 
	 * @return
	 */
	@GetMapping
	public ResponseEntity<Map<String, List<CommentModel>>> getAllComments() {
		List<CommentModel> comments = commentService.getAllComments();

		Map<String, List<CommentModel>> response = new HashMap<>();
		response.put("comments", comments);

		return ResponseEntity.ok(response);
	}

	/**
	 * Get one comment
	 * 
	 * @param id
	 * @return
	 */
	@GetMapping("/{id}")
	public ResponseEntity<CommentModel> getOneComment(@PathVariable(name = "id") Long id) {

		Optional<CommentModel> commentOptional = commentService.getOneComment(id);

		if (commentOptional.isPresent()) {
			return ResponseEntity.ok(commentOptional.get());
		} else {
			return ResponseEntity.notFound().build();
		}
	}

	/**
	 * Create a new Comment
	 * 
	 * @param category
	 * @return
	 */
	@PostMapping
	public ResponseEntity<CommentModel> saveCategory(@RequestBody CommentDTO commentDTO) {
		return new ResponseEntity<>(commentService.newComment(commentDTO), HttpStatus.CREATED);
	}

	/**
	 * Update Comment
	 * 
	 * @param id
	 * @param user
	 * @return
	 */
	@PutMapping("/{id}")
	public ResponseEntity<CommentModel> updateUserImage(@PathVariable(name = "id") Long id,
			@RequestBody CommentUpdateDTO commentUpdateDTO) {

		CommentModel comment = commentService.updateComment(id, commentUpdateDTO);
		return ResponseEntity.ok(comment);

	}

}
