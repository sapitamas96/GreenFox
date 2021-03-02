package com.greenfoxacademy.reddit.reddit.controllers;

import com.greenfoxacademy.reddit.reddit.dto.PostDTO;
import com.greenfoxacademy.reddit.reddit.modell.Post;
import com.greenfoxacademy.reddit.reddit.services.PostService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/posts")
public class PostController {

    private PostService postService;

    @Autowired
    public PostController(PostService postService) {
        this.postService = postService;
    }

    @GetMapping
    public List<Post> getPosts() {
        return postService.getPosts();
    }

    @PostMapping
    public Post postPost(@RequestBody PostDTO postDTO, @RequestHeader("header-name") String headerValue) {
        return postService.save(postDTO, headerValue);
    }

    @PutMapping("/{id}/upvote")
    public Post upVote(@PathVariable Long id) throws Exception {
        return postService.upVote(id);
    }

    @PutMapping("/{id}/downvote")
    public Post downVote(@PathVariable Long id) throws Exception {
        return postService.downVote(id);
    }
}
