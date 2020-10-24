package com.treino.ToDo.repository;

import com.treino.ToDo.entity.ToDoEntity;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface ToDoRepository extends CrudRepository<ToDoEntity, Integer> {
    List<ToDoEntity> getAllByStatus(boolean done);

}
