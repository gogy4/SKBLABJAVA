package com.springurfu.dbhomework.dto;

import lombok.Builder;
import lombok.Data;

import java.util.List;

@Data
@Builder
public class TodoListRequest {
    private String name;
    private List<ToDoItemRequest> events;
}
