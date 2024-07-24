package com.mx.pp.blog.repository.comment;

import org.springframework.data.jpa.repository.JpaRepository;

import com.mx.pp.blog.models.comment.CommentModel;

public interface CommentRepository extends JpaRepository<CommentModel, Long>{

}
