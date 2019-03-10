package com.local.vkPoster.services;

import com.local.vkPoster.models.Post;

public interface VkApiService {

    void sendToSuggestedNews(Post post);

    String uploadPhoto(String imageUrl);

    void sendNotification(Post post);

}
