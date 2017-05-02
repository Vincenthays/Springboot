package com.vincent.Entity;

import javax.persistence.*;
import java.util.List;

@Entity
@Table(name = "User")
public class User {

    @Id
    @GeneratedValue
    @Column(name = "id")
    private int id;

    @Column(name = "name")
    private String name;

    @ManyToMany
    @JoinTable(
            name = "vgroups_students",
            joinColumns = @JoinColumn(name = "id_user", referencedColumnName = "id"),
            inverseJoinColumns = @JoinColumn(name = "id_group", referencedColumnName = "id")
    )
    private List<VGroup> studentVGroups;

    @OneToMany(mappedBy = "teacher")
    private List<VGroup> teacherVGroups;


    public User() {}


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

    public List<VGroup> getStudentVGroups() {
        return studentVGroups;
    }

    public void setStudentVGroups(List<VGroup> studentVGroups) {
        this.studentVGroups = studentVGroups;
    }

    public List<VGroup> getTeacherVGroups() {
        return teacherVGroups;
    }

    public void setTeacherVGroups(List<VGroup> teacherVGroups) {
        this.teacherVGroups = teacherVGroups;
    }
}
