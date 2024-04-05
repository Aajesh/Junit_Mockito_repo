package com.aajesh.data.api;

import java.util.List;

/*
* Create the one Interface which name is TodoService
* and We writing Test TodoBusinessImpl using TodoServiceStub that means (TodoService)
* */
public interface TodoService {
    public List<String> retrieveTodos(String user);
}