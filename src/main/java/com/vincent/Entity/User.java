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
            name = "roux_group_students",
            joinColumns = @JoinColumn(name = "id_user", referencedColumnName = "id"),
            inverseJoinColumns = @JoinColumn(name = "id_roux_group", referencedColumnName = "id")
    )
    private List<RouxGroup> studentRouxGroups;

    @OneToMany(mappedBy = "teacher")
    private List<RouxGroup> teacherRouxGroups;


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

    public List<RouxGroup> getStudentRouxGroups() {
        return studentRouxGroups;
    }

    public void setStudentRouxGroups(List<RouxGroup> studentRouxGroups) {
        this.studentRouxGroups = studentRouxGroups;
    }

    public List<RouxGroup> getTeacherRouxGroups() {
        return teacherRouxGroups;
    }

    public void setTeacherRouxGroups(List<RouxGroup> teacherRouxGroups) {
        this.teacherRouxGroups = teacherRouxGroups;
    }
}
