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
        todos.add(new Todo(++idCounter, "manish" , "Learn to code", new Date(), false));
        todos.add(new Todo(++idCounter, "nitish" , "Learn to play", new Date(), false));
        todos.add(new Todo(++idCounter, "yogesh" , "Learn Angular", new Date(), false));
    }

    public List<Todo> findAll() {
        return todos;
    }
}