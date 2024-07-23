package com.mx.pp.blog.services.posts;

import java.util.List;
import java.util.Optional;

import com.mx.pp.blog.models.Posts.PostModel;
import com.mx.pp.blog.services.posts.dto.PostDTO;

public interface PostService {

	public void deletePost(Long id);

	public Optional<PostModel> getOnePost(Long id);

	public List<PostModel> getPosts();

	public PostModel newPost(PostDTO post);

	public PostModel updatePost(Long id, PostDTO post);

}
