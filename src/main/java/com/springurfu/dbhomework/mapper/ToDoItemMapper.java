package com.springurfu.dbhomework.mapper;

import com.springurfu.dbhomework.entities.ToDoItemEntity;
import com.springurfu.dbhomework.entities.ToDoListEntity;
import com.springurfu.dbhomework.dto.ToDoItemRequest;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Component;

@Component
@RequiredArgsConstructor
public class ToDoItemMapper {
    public ToDoItemEntity toEntity(ToDoItemRequest request) {
        return ToDoItemEntity.builder()
                .event(request.getEvent())
                .build();
    }

    public ToDoItemRequest toRequest(ToDoItemEntity entity){
        return ToDoItemRequest.builder()
                .event(entity.getEvent())
                .build();
    }
}
