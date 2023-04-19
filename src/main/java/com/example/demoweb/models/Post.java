package com.example.demoweb.models;

public class Post {
    private String text;
    private Integer likes;

    public Post(){}
    public Post(String text, Integer likes){
        this.text = text;
        this.likes = likes;
    }

    public void setText(String text) {
        this.text = text;
    }

    public String getText() {
        return text;
    }

    public void setLikes(Integer likes) {
        this.likes = likes;
    }

    public Integer getLikes() {
        return likes;
    }
}
