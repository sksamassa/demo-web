package com.example.demoweb.controllers;

import com.example.demoweb.models.Post;
import com.example.demoweb.services.PostService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller
public class PostsViewController {
    private final PostService postService;

    @Autowired
    public PostsViewController(PostService postService){
        this.postService = postService;
    }

    @RequestMapping(path = "/post", method = RequestMethod.GET)
    public String list(Model model){
        postService.addPosts(new Post("Hi there!", 5));
        postService.addPosts(new Post("Hello Sekou!", 100));
        postService.addPosts(new Post("How's going your day!", 50));
        var posts = postService.listAllPosts();

        model.addAttribute("posts", posts);

        return "list";
    }
}
