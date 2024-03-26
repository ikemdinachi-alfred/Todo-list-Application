package com.alfredtech.todolistapplication.controller;

import com.alfredtech.todolistapplication.services.TodoItemService;
import com.alfredtech.todolistapplication.services.TodoItemServiceImpl;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.servlet.ModelAndView;

@Controller
@RestController
@RequestMapping("api/todo/")
public class TodoController {
    @Autowired
    private TodoItemService todoItemService;

    @GetMapping("/")
    public ModelAndView index(){
        ModelAndView modelAndView = new ModelAndView("index");
        modelAndView.addObject("todoItems",todoItemService.getAll());
        return modelAndView;

    }

}
