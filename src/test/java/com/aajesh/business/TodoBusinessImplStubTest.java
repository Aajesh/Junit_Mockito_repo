package com.aajesh.business;

import com.aajesh.data.api.TodoService;
import com.aajesh.data.api.TodoServiceStub;
import org.junit.Test;

import java.util.List;

import static org.junit.Assert.assertEquals;

public class TodoBusinessImplStubTest {

    @Test
    public void testRetrieveTodoRElatedToSpring_usingStub(){
        TodoService todoServiceStub= new TodoServiceStub();
        TodoBusinessImpl todoBusinessImpl= new TodoBusinessImpl(todoServiceStub);

        List<String> filterTodos =todoBusinessImpl.retrieveTodoRElatedToSpring("Dummy");
        assertEquals(2,filterTodos.size());
    }
}
