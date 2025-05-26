package com.springurfu.dbhomework.repository;

import com.springurfu.dbhomework.entities.ToDoItemEntity;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface  ToDoItemRepository extends JpaRepository<ToDoItemEntity, Long> {
}
