package com.mozoroff.todo_app.domain;

import lombok.Data;

@Data
public class Todo {
    private Integer id;
    private Integer userId;
    private String title;
    private boolean doneFlag;
    private String timeLimit;
}
