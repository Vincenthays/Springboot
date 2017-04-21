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
            name = "classes_students",
            joinColumns = @JoinColumn(name = "id_user", referencedColumnName = "id"),
            inverseJoinColumns = @JoinColumn(name = "id_class", referencedColumnName = "id")
    )
    private List<Class> studentClasses;

    @OneToMany(mappedBy = "teacher")
    private List<Class> teacherClasses;


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

    public List<Class> getStudentClasses() {
        return studentClasses;
    }

    public void setStudentClasses(List<Class> studentClasses) {
        this.studentClasses = studentClasses;
    }

    public List<Class> getTeacherClasses() {
        return teacherClasses;
    }

    public void setTeacherClasses(List<Class> teacherClasses) {
        this.teacherClasses = teacherClasses;
    }
}
