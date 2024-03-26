package com.alfredtech.todolistapplication.data.repositories;

import com.alfredtech.todolistapplication.data.models.TodoItems;
import org.springframework.data.jpa.repository.JpaRepository;

public interface TodoItemRepository extends JpaRepository<TodoItems,Long> {
}
