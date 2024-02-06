package com.example.demo.service;

import com.example.demo.model.Post;
import org.springframework.stereotype.*;

import java.util.ArrayList;
import java.util.Calendar;
import java.util.Date;
import java.util.List;

@Service
public class PostService {
    List<Post> posts;

    {
        posts = new ArrayList<>();
        Post post1 = new Post("Летучие мыши стали активнее!", new Date(999-1900, Calendar.JANUARY, 2));
        Post post2 = new Post("Крысы съели ужин слепого человека!", new Date(567-1900, Calendar.MAY, 8));
        Post post3 = new Post("Цветы расцвели на центральной клумбе города!", new Date(2024-1900, Calendar.FEBRUARY, 30));
        posts.add(post1);
        posts.add(post2);
        posts.add(post3);
    }

    public List<Post> listAllPosts(){
        return posts;
    }

    public void create(String text) {
        posts.add(new Post(text, new Date()));
    }
}
