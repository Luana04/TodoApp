package com.luana.springboottodoapplication.controllers;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.servlet.ModelAndView;

import com.luana.springboottodoapplication.repositories.TodoItemRepository;


@Controller
public class TodoItemController {

    @Autowired
    private TodoItemRepository todoItemRepository;

    @GetMapping("/")
    public ModelAndView index() {
        ModelAndView modelAndView = new ModelAndView("index");
        modelAndView.addObject("todoItems", todoItemRepository.findAll());
        return modelAndView;
    }

    

}
