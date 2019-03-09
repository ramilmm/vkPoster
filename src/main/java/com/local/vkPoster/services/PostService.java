package com.local.vkPoster.services;


import com.local.vkPoster.models.Post;

import java.util.List;

public interface PostService {

    List<Post> findPostByDay(String date);

}
