package com.alfredtech.todolistapplication.services;

import com.alfredtech.todolistapplication.data.models.TodoItems;
import com.alfredtech.todolistapplication.data.repositories.TodoItemRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.time.Instant;
import java.util.Optional;
@Service
public class TodoItemServiceImpl implements TodoItemService{
    @Autowired
    private TodoItemRepository todoItemRepository;
    @Override
    public Iterable<TodoItems> getAll() {
        return todoItemRepository.findAll();
    }

    @Override
    public Optional<TodoItems> getById(Long id) {
        return todoItemRepository.findById(id);
    }

    @Override
    public TodoItems save(TodoItems item) {
       if (item.getId()==null){
           item.setCreatedAt(Instant.now());
       }
       item.setUpdatedAt(Instant.now());
        return todoItemRepository.save(item);
    }

    @Override
    public void delete(TodoItems items) {
        todoItemRepository.delete(items);


    }
}
