package com.example.springboot.todo;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

import org.springframework.stereotype.Service;

@Service
public class TodoHardcodedService {
    private static List<Todo> todos = new ArrayList<Todo>();
    private static int idCounter = 0;

    static {
        todos.add(new Todo(++idCounter, "manish" , "Learn code", new Date(), false));
        todos.add(new Todo(++idCounter, "nitish" , "Learn springboot", new Date((new Date()).getTime() + 86400000), false));
        todos.add(new Todo(++idCounter, "yogesh" , "Learn Angular", new Date((new Date()).getTime() - 86400000), false));
    }

    public List<Todo> findAll() {
        return todos;
    }

    
    public Todo save(Todo todo) {
        if(todo.getId()==-1 || todo.getId() == 0) {
            todo.setId(++idCounter);
            todo.setUsername("manish");
            todos.add(todo);
        } else {
            deleteById(todo.getId());
            todos.add(todo);
        }
        return todo;
    }

    public Todo deleteById(long id) {
        Todo todo = findById(id);
        if(todo == null) return null;

        if(todos.remove(todo)) {
            return todo;
        }

        return null;

    }

    public Todo findById(long id) {
        for(Todo todo: todos) {
            if(todo.getId() == id) {
                return todo;
            }
        }

        return null;
    }


}