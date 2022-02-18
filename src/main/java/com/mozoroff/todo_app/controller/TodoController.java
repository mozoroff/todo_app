package com.mozoroff.todo_app.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;

import com.mozoroff.todo_app.domain.Todo;
import com.mozoroff.todo_app.mapper.TodoMapper;

@Controller
public class TodoController {

    @Autowired
    TodoMapper todoMapper;

    @RequestMapping("/")
    public String index(Model model) {
//        List<Todo> list = todoMapper.selectAll();
        List<Todo> incompleteList = todoMapper.selectIncomplete();
        List<Todo> completeList = todoMapper.selectComplete();
        
        model.addAttribute("todos", incompleteList);
        model.addAttribute("doneTodos", completeList);
        
        return "index";
    }
    
    @PostMapping("/add")
    public String add(Todo todo) {
    	todoMapper.add(todo);
    	System.out.println(todo);
    	return "redirect:/";
    }
    
    @PostMapping("/update")
    public String update(Todo todo) {
    	todoMapper.update(todo);
    	return "redirect:/";
    }
    
    @PostMapping("/delete")
    public String delete() {
    	todoMapper.delete();
    	return "redirect:/";
    }


}
