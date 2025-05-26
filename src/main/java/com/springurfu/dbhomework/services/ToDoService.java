package com.springurfu.dbhomework.services;

import com.springurfu.dbhomework.dto.TodoListRequest;
import com.springurfu.dbhomework.repository.ToDoItemRepository;
import com.springurfu.dbhomework.repository.ToDoListRepository;
import com.springurfu.dbhomework.mapper.ToDoListMapper;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.stream.Collectors;

@Service
@RequiredArgsConstructor
public class ToDoService {
    private final ToDoListRepository toDoListRepository;
    private final ToDoListMapper toDoListMapper;

    public TodoListRequest saveToDoList(TodoListRequest request){
        var listEntity = toDoListMapper.toEntity(request);
        toDoListRepository.save(listEntity);
        return request;
    }

    public List<TodoListRequest> getAll(){
        return toDoListRepository.findAll().stream().map(toDoListMapper::toRequest).collect(Collectors.toList());
    }
}
