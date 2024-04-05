package com.aajesh.business;

import com.aajesh.data.api.TodoService;

import java.util.ArrayList;
import java.util.List;
/*
 * TodoBusinessImpl SUT
 * TodoService Dependency
 * */

public class TodoBusinessImpl {

    private TodoService todoService;

    public TodoBusinessImpl(TodoService todoService) {
        this.todoService = todoService;
    }

    public List<String> retrieveTodoRElatedToSpring(String user) {
        List<String> filterTodos = new ArrayList<String>();
        List<String> todos = todoService.retrieveTodos(user);
        for (String todo : todos) {
            if (todo.contains("Spring")) {
                filterTodos.add(todo);
            }
        }

        return filterTodos;
    }
}