package com.springframework.chucknorrisapp.controllers;

import com.springframework.chucknorrisapp.services.ReturnJokeService;
import com.springframework.chucknorrisapp.services.ReturnJokeServiceImpl;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class JokesController {
    private final ReturnJokeService returnJokeService;

    public JokesController(ReturnJokeService returnJokeService) {
        this.returnJokeService = returnJokeService;
    }

    @RequestMapping( {"/",""})
    public String Jokes(Model model){
        model.addAttribute("joke",returnJokeService.returnJoke());
        return "index";
    }
}
