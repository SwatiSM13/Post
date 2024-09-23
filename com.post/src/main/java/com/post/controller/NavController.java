package com.post.controller;

import java.util.List;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

import com.post.entity.Post;

@Controller
public class NavController {

	@GetMapping("/")
	public String newPost() {
		return "newPost";
	}
	
	}
	

