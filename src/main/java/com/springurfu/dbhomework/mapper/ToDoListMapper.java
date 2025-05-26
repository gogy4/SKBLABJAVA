package com.springurfu.dbhomework.mapper;

import com.springurfu.dbhomework.entities.ToDoListEntity;
import com.springurfu.dbhomework.dto.TodoListRequest;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Component;

import java.util.stream.Collectors;

@Component
@RequiredArgsConstructor
public class ToDoListMapper {
    private final ToDoItemMapper itemMapper;
    public ToDoListEntity toEntity(TodoListRequest request){
        ToDoListEntity list = ToDoListEntity.builder()
                .name(request.getName())
                .build();

        var events = request.getEvents().stream()
                .map(itemMapper::toEntity)
                .collect(Collectors.toList());

        list.setEvents(events);

        return list;
    }

    public TodoListRequest toRequest(ToDoListEntity request){
        return TodoListRequest.builder()
                .name(request.getName())
                .events(request.getEvents().stream().map(itemMapper::toRequest).collect(Collectors.toList()))
                .build();
    }
}
