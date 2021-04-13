package com.tieway59.ttrmp.controller;

import com.baomidou.mybatisplus.extension.plugins.pagination.Page;
import com.tieway59.ttrmp.domain.Post;
import com.tieway59.ttrmp.service.PostService;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class PostController {

    final PostService postService;

    public PostController(PostService postService) {
        this.postService = postService;
    }


    @GetMapping("/post/{id}")
    public Post getPost(@PathVariable("id") int id) {
        return postService.
                query().
                eq("post_id", id).
                one();
    }

    @GetMapping("/post")
    public Page<Post> getAllPosts(@RequestParam("page_current") int current, @RequestParam("page_size") int size) {
        return postService.page(new Page<>(current, size));
    }

}
