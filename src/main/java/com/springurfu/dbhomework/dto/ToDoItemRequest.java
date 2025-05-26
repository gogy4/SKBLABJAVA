package com.springurfu.dbhomework.dto;

import lombok.Builder;
import lombok.Data;

@Data
@Builder
public class ToDoItemRequest {
    private String event;
}
