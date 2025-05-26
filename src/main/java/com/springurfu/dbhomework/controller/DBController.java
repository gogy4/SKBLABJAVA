package com.springurfu.dbhomework.controller;

import com.springurfu.dbhomework.services.ToDoService;
import com.springurfu.dbhomework.dto.TodoListRequest;
import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequiredArgsConstructor
public class DBController{
    private final ToDoService service;

    @PostMapping("add-todo-list")
    public TodoListRequest addToDoList(@RequestBody TodoListRequest todoListRequest) {
        return service.saveToDoList(todoListRequest);
    }

    @GetMapping("get-all-todo")
    public List<TodoListRequest> getAll(){
        return service.getAll();
    }
}
