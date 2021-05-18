package com.mvc.demo.service;

import java.time.LocalDateTime;
import java.util.LinkedList;
import java.util.List;

import javax.annotation.PostConstruct;

import com.mvc.demo.model.Todo;

import org.springframework.context.annotation.ScopedProxyMode;
import org.springframework.stereotype.Component;
import org.springframework.web.context.annotation.SessionScope;

@Component
@SessionScope(proxyMode = ScopedProxyMode.TARGET_CLASS)
public class TodoService {

    private List<Todo> todoList = new LinkedList<>();

    @PostConstruct
    public void setup(){
        todoList.add(new Todo("todo 1", LocalDateTime.now()));
        todoList.add(new Todo("todo 2", LocalDateTime.now()));
        todoList.add(new Todo("todo 3", LocalDateTime.now()));
    }

    public List<Todo> getTodoList() {
        return todoList;
    }

    public void addTodo(Todo todo){
        todoList.add(todo);
    }
    
}
