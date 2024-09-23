package com.post.service;

import java.util.List;

import com.post.entity.Post;

public interface PostService {

	void createPost(Post post);
	List<Post>fetchAllPosts();
	Post getPost(Long id);
	void updatePost(Post post);
	
}
