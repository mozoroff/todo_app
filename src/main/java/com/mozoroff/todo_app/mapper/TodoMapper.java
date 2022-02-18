package com.mozoroff.todo_app.mapper;

import java.util.List;

import org.apache.ibatis.annotations.Mapper;

import com.mozoroff.todo_app.domain.Todo;

@Mapper
public interface TodoMapper {
    List<Todo> selectAll();
    List<Todo> selectIncomplete();
    List<Todo> selectComplete();
    
    void add(Todo todo);
    void update(Todo todo);
    void delete();
    
}
