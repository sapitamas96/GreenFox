package com.greenfoxacademy.reddit.reddit.services;

import com.greenfoxacademy.reddit.reddit.dto.PostDTO;
import com.greenfoxacademy.reddit.reddit.modell.Post;

import java.util.List;

public interface PostService {

    List<Post> getPosts();

    Post save(PostDTO postDTO, String headerValue);

    Post upVote(Long id) throws Exception;

    Post downVote(Long id) throws Exception;
}
