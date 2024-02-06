package com.example.demo.service;

import com.example.demo.model.Post;
import org.springframework.stereotype.*;

import java.util.ArrayList;
import java.util.List;

@Service
public class PostService {

    public List<Post> listAllPosts(){
        Post post1 = new Post("Летучие мыши стали активнее!");
        Post post2 = new Post("Крысы съели ужин слепого человека!");
        Post post3 = new Post("Цветы расцвели на центральной клумбе города!");

        List<Post> posts = new ArrayList<Post>();
        posts.add(post1);
        posts.add(post2);
        posts.add(post3);
        return posts;
    }
}
