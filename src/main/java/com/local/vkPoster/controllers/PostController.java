package com.local.vkPoster.controllers;

import com.local.vkPoster.config.API;
import com.local.vkPoster.services.PostService;
import io.swagger.annotations.*;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
public class PostController {

    private PostService postService;

    @Autowired
    public PostController(PostService postService) {
        this.postService = postService;
    }

    @ApiOperation(value = "Find scheduled posts by day",response = List.class)
    @ApiResponses(value={
            @ApiResponse(code = 200, message = "Posts Retrieved", response = List.class),
            @ApiResponse(code = 500, message = "Internal Server Error"),
            @ApiResponse(code = 404, message = "Posts not found by this date")
    })
    @GetMapping(API.Post.PART)
    public ResponseEntity<String> getPostsByDay(
            @ApiParam(value = "The date for which you want to get posts", required = true)
            @RequestParam String date
    ) {
//        List<Post> posts = postService.findPostByDay(date);
//        if (posts.size() == 0) {
//            return ResponseEntity.notFound().build();
//        }
        return ResponseEntity.ok("OK");
    }

}
