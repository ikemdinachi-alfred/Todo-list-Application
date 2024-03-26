package com.alfredtech.todolistapplication.services;
import com.alfredtech.todolistapplication.data.models.TodoItems;


import java.util.Optional;

public interface TodoItemService {
    Iterable<TodoItems> getAll();
    Optional<TodoItems> getById(Long id);
    TodoItems save(TodoItems todoItems);
    void delete(TodoItems todoItems);
}
