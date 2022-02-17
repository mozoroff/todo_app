package com.mozoroff.todo_app.mapper;

import org.apache.ibatis.annotations.Mapper;
import java.util.List;

import com.mozoroff.todo_app.domain.Todo;

@Mapper
public interface TodoMapper {
    List<Todo> selectAll();
}
