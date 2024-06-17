package com.example.demo.controller.blog;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

//Controller 폴더 밑에 blog라는 폴더 만들어 줘서 블로그 관련 컨트롤러 작성
@Controller
@RequestMapping("blog")
public class BlogController {
	
	@GetMapping("index")
	public String blogMainMethod() {
		return "blog/blog-index";
	}
	
	@GetMapping("board")
	public String blogBoardMethod() {
		return "blog/blog-board";
	}
}
