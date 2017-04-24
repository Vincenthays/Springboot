package com.vincent.Entity;

import javax.persistence.*;

@Entity
@Table
public class AnswerType {

    @Id
    @GeneratedValue
    @Column
    private int id;

    @Column(unique = true)
    private String name;

    public AnswerType() {}

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
}
