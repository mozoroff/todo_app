package com.mozoroff.todo_app.controller;

import java.util.List;

import com.mozoroff.todo_app.domain.Todo;
import com.mozoroff.todo_app.mapper.TodoMapper;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class TodoController {

    @Autowired
    TodoMapper todoMapper;

    @RequestMapping(value = "/")
    public String index(Model model) {
        List<Todo> list = todoMapper.selectAll();
        model.addAttribute("todos", list);
        return "index";
    }

}
