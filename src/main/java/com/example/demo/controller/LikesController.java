package com.example.demo.controller;

import com.example.demo.service.*;
import org.springframework.beans.factory.annotation.*;
import org.springframework.stereotype.*;
import org.springframework.web.bind.annotation.*;

@Controller
public class LikesController {
    @Autowired
    LikesService likesService;
    @ResponseBody
    @RequestMapping(path = "/post/{id}/like", method = RequestMethod.POST)
    public String like(@PathVariable("id") Long id) {
        int likes = likesService.like(id);
        return "" + likes;
    }
}
