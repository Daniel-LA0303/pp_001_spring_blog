package com.mx.pp.blog.services.posts;

import java.util.List;
import java.util.Optional;

import com.mx.pp.blog.models.Posts.PostImageModel;
import com.mx.pp.blog.services.posts.dto.PostImageDTO;

public interface PostImageService {

	public void deletePostImage(Long id);

	public List<PostImageModel> getAllPostImage();

	public Optional<PostImageModel> getOnePostImage(Long id);

	public PostImageModel newPostImage(PostImageDTO postImageDTO);

	public PostImageModel updatePostImage(Long id, PostImageDTO postImageDto);

}
