package com.vincent.Entity;

import javax.persistence.*;
import java.util.List;

@Entity
@Table(name = "VGroup")
public class VGroup {

    @Id
    @GeneratedValue
    @Column(name = "id")
    private int id;

    @Column(name = "name")
    private String name;

    @ManyToOne
    @JoinColumn(name = "id_teacher")
    private User teacher;

    @ManyToMany(mappedBy = "studentVGroups")
    private List<User> students;


    public VGroup() {}


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

    public List<User> getStudents() {
        return students;
    }

    public void setStudents(List<User> students) {
        this.students = students;
    }
}
