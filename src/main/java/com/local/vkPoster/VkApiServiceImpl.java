package com.local.vkPoster;

import com.local.vkPoster.client.VkClient;
import com.local.vkPoster.models.Post;
import com.local.vkPoster.services.VkApiService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class VkApiServiceImpl implements VkApiService {

    private VkClient client;

    @Autowired
    public VkApiServiceImpl(VkClient client) {
        this.client = client;
    }

    @Override
    public void sendToSuggestedNews(Post post) {

    }

    @Override
    public String uploadPhoto(String imageUrl) {
        return null;
    }

    @Override
    public void sendNotification(Post post) {



    }
}
