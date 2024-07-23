package com.mx.pp.blog.repository.posts;

import org.springframework.data.jpa.repository.JpaRepository;

import com.mx.pp.blog.models.Posts.PostImageModel;

public interface PostImageRepository extends JpaRepository<PostImageModel, Long> {

}
