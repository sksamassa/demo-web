package com.example.demoweb.services;

import com.example.demoweb.models.Post;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

@Service
public class PostService {
    List<Post> postList = new ArrayList<>();
    public List<Post> listAllPosts(){
        return postList;
    }

    public void addPosts(Post post){
        postList.add(post);
    }
}
