package com.treino.ToDo.entity;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;

@Entity
public class ToDoEntity {

    @Id
    @GeneratedValue
    @Column (name = "id")
    private int id;

    @Column (name = "title")
    private String title;

    @Column (name = "done")
    private boolean done;

    public int getId() {
        return id;
    }

    public String getTitle() {
        return title;
    }

    public boolean getDone() {
        return done;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public void setDone(boolean done) {
        this.done = done;
    }
}
