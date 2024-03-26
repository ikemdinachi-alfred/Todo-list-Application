package com.alfredtech.todolistapplication.data.models;
import jakarta.persistence.*;
import lombok.Getter;
import lombok.Setter;

import java.io.Serializable;
import java.time.Instant;

@Setter
@Getter
@Entity
@Table(name = "todo_items")
public class TodoItems implements Serializable {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    private String description;
    private boolean isCompleted;
    private Instant createdAt;
    private Instant updatedAt;

    @Override
    public String toString(){
        return String.format("""
                TodoItem
                Id : %d
                Description: %s
                isComplete : %s
                createdAt: %s
                updatedAt: %s
                """,id,description,
                isCompleted,createdAt,
                updatedAt);
    }


}
