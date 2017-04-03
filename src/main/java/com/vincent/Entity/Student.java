package com.vincent.Entity;

import javax.persistence.*;
import javax.validation.constraints.NotNull;
import java.util.Date;

@Entity
@Table(name = "Student")
public class Student {

    @Id
    @GeneratedValue
    @NotNull
    @Column(name = "id", unique = true)
    private int id;

    @NotNull
    @Column(name = "name")
    private String name;

    @Column(name = "birthday")
    private Date birthday;

    public Student() {}

    public Student(String name) {
        this.name = name;
    }

    public Date getBirthday() {
        return birthday;
    }

    public void setBirthday(Date birthday) {
        this.birthday = birthday;
    }

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
