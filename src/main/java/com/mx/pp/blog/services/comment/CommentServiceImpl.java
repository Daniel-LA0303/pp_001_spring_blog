package com.mx.pp.blog.services.comment;

import java.time.LocalDateTime;
import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.mx.pp.blog.models.Posts.PostModel;
import com.mx.pp.blog.models.Users.UsersModel;
import com.mx.pp.blog.models.comment.CommentModel;
import com.mx.pp.blog.repository.comment.CommentRepository;
import com.mx.pp.blog.repository.posts.PostRepository;
import com.mx.pp.blog.repository.users.UserRepository;
import com.mx.pp.blog.services.comment.dto.CommentDTO;
import com.mx.pp.blog.services.comment.dto.CommentUpdateDTO;

@Service
public class CommentServiceImpl implements CommentService {

	@Autowired
	private CommentRepository commentRepository;

	@Autowired
	private UserRepository userRepository;

	@Autowired
	private PostRepository postRepository;

	@Override
	public void deleteComment(Long id) {
		@SuppressWarnings("deprecation")
		CommentModel comment = commentRepository.getById(id);
		commentRepository.delete(comment);
	}

	@Override
	public List<CommentModel> getAllComments() {
		return commentRepository.findAll();
	}

	@Override
	public Optional<CommentModel> getOneComment(Long id) {
		return commentRepository.findById(id);
	}

	@Override
	public CommentModel newComment(CommentDTO commentDTO) {

		@SuppressWarnings("deprecation")
		UsersModel user = userRepository.findById(commentDTO.getUserID())
				.orElseThrow(() -> new RuntimeException("User not found"));

		@SuppressWarnings("deprecation")
		PostModel post = postRepository.findById(commentDTO.getPostID())
				.orElseThrow(() -> new RuntimeException("Post not found"));

		CommentModel commentModel = new CommentModel();
		commentModel.setComment(commentDTO.getComment());
		commentModel.setPost(post);
		commentModel.setUser(user);
		commentModel.setDate(LocalDateTime.now());

		return commentRepository.save(commentModel);
	}

	@Override
	public CommentModel updateComment(Long id, CommentUpdateDTO commentUpdateDTO) {
		@SuppressWarnings("deprecation")
		CommentModel comment = commentRepository.getById(id);
		comment.setComment(commentUpdateDTO.getComment());
		return commentRepository.save(comment);
	}

}
