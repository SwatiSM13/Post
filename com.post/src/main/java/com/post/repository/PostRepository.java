package com.post.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.post.entity.Post;

public interface PostRepository extends JpaRepository<Post,Long>
{

}



