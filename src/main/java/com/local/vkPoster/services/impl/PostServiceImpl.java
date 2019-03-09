package com.local.vkPoster.services.impl;

import com.local.vkPoster.services.PostService;
import com.local.vkPoster.models.Post;
import com.local.vkPoster.repositories.PostRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

@Service
public class PostServiceImpl implements PostService {

    private PostRepository postRepository;

    @Autowired
    public PostServiceImpl(PostRepository postRepository) {
        this.postRepository = postRepository;
    }

    public List<Post> findPostByDay(String date){
        ArrayList<Post> postsByDay = new ArrayList<>();
        postsByDay = (ArrayList<Post>) postRepository.findAll();
        return postsByDay;
    }
}
