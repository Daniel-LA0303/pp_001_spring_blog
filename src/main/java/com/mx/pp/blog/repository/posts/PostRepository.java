package com.mx.pp.blog.repository.posts;

import org.springframework.data.jpa.repository.JpaRepository;

import com.mx.pp.blog.models.Posts.PostModel;

public interface PostRepository extends JpaRepository<PostModel, Long> {

}
