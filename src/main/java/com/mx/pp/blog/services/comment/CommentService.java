package com.mx.pp.blog.services.comment;

import java.util.List;
import java.util.Optional;

import com.mx.pp.blog.models.comment.CommentModel;
import com.mx.pp.blog.services.comment.dto.CommentDTO;
import com.mx.pp.blog.services.comment.dto.CommentUpdateDTO;

public interface CommentService {

	public void deleteComment(Long id);

	public List<CommentModel> getAllComments();

	public Optional<CommentModel> getOneComment(Long id);

	public CommentModel newComment(CommentDTO commentDTO);

	public CommentModel updateComment(Long id, CommentUpdateDTO commentUpdateDTO);

}
