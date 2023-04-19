package com.example.demoweb.controllers;

import com.example.demoweb.services.PostService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

@Controller
public class PostsViewController {
    private final PostService postService;

    @Autowired
    public PostsViewController(PostService postService){
        this.postService = postService;
    }

    @RequestMapping(path = "/post", method = RequestMethod.GET)
    public String list(Model model){
        var posts = postService.listAllPosts();
        model.addAttribute("posts", posts);

        return "listView";
    }

}
