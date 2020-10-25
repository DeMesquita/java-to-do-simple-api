package com.treino.ToDo.controller;

import com.treino.ToDo.entity.ToDoEntity;
import com.treino.ToDo.service.ToDoService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;

import java.util.List;

@Controller
public class ToDoController {

    @Autowired
    ToDoService service;

    @PostMapping("/create")
    public ResponseEntity<ToDoEntity> createTask(@RequestBody ToDoEntity toDo){
        return ResponseEntity.ok(service.createTask(toDo));
    }

    @GetMapping("/getAll")
    public ResponseEntity<List<ToDoEntity>> getAllTasks(){
        return ResponseEntity.ok(service.getAll());
    }

    @GetMapping("/get/{id}")
    public ResponseEntity<ToDoEntity> getTask(@PathVariable int id){
        return ResponseEntity.ok(service.getTask(id));
    }


}
