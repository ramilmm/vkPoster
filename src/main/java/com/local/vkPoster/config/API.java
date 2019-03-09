package com.local.vkPoster.config;

public interface API {

    String PATH = "/api/1.0/";

    interface Post {

        String PART = "/posts";
        String FULL_PATH = PATH + "/" + PART;

    }

    interface Schedule {

        String PART = "schedule";
        String FULL_PATH = PATH + "/" + PART;


    }

}
