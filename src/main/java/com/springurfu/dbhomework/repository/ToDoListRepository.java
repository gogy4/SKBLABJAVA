package com.springurfu.dbhomework.repository;

import com.springurfu.dbhomework.entities.ToDoListEntity;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface ToDoListRepository extends JpaRepository<ToDoListEntity, Long> {
}
