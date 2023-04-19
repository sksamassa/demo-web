package com.example.demoweb.services;

import com.example.demoweb.models.Post;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

@Service
public class PostService {
    public List<Post> listAllPosts(){
        List<Post> postList = new ArrayList<>();
        return postList;
    }
}
