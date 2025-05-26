package com.springurfu.dbhomework.entities;

import jakarta.persistence.*;
import lombok.*;

import java.util.List;

@Entity
@Data
@NoArgsConstructor
@AllArgsConstructor
@Builder
public class ToDoListEntity {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long id;

    private String name;

    @OneToMany(cascade = CascadeType.ALL)
    @JoinTable(
            name="item_list",
            joinColumns = @JoinColumn(name="list_id"),
            inverseJoinColumns = @JoinColumn(name="item_id")
    )
    private List<ToDoItemEntity> events;
}
