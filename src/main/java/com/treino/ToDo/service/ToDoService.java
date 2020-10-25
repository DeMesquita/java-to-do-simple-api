package com.treino.ToDo.service;

import com.treino.ToDo.entity.ToDoEntity;
import com.treino.ToDo.repository.ToDoRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import java.util.List;

@Component
public class ToDoService {

    @Autowired
    ToDoRepository repository;

    public ToDoEntity createTask( ToDoEntity toDo){
        return repository.save(toDo);
    }

    public ToDoEntity getTask(int id){
        return repository.findById(id).orElseThrow();
    }

    public List<ToDoEntity> getAll(){
        return (List<ToDoEntity>) repository.findAll();
    }

    public List<ToDoEntity> getAllByStatus( boolean done){
        return repository.findAllByDone(done);
    }

    public ToDoEntity updateTask(int id, ToDoEntity toDo){
        ToDoEntity newToDo = this.getTask(id);
        newToDo.setTitle(toDo.getTitle());
        newToDo.setDone(toDo.getDone());
        return this.createTask(newToDo);
    }

    public List<ToDoEntity> deleteTask(int id){
        repository.deleteById(id);
        return this.getAll();
    }
}
