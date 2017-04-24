package com.vincent.Entity;

import javax.persistence.*;
import java.util.List;

@Entity
@Table
public class User {

    @Id
    @GeneratedValue
    @Column
    private int id;

    @Column
    private String name;

    @Column
    private String first_name;

    @ManyToOne
    @JoinColumn(name = "id_role")
    private Role role;

    @ManyToMany
    @JoinTable(
            name = "students_groups",
            joinColumns = @JoinColumn(name = "id_user", referencedColumnName = "id"),
            inverseJoinColumns = @JoinColumn(name = "id_groupe", referencedColumnName = "id")
    )
    private List<Groupe> studentGroupes;

    @OneToMany(mappedBy = "teacher")
    private List<Groupe> teacherGroupes;

    @OneToMany(mappedBy = "student")
    private List<Answer> answers;

    @OneToMany(mappedBy = "teacher")
    private List<Quiz> quizzes;


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

    public List<Groupe> getStudentGroupes() {
        return studentGroupes;
    }

    public void setStudentGroupes(List<Groupe> studentGroupes) {
        this.studentGroupes = studentGroupes;
    }

    public List<Groupe> getTeacherGroupes() {
        return teacherGroupes;
    }

    public void setTeacherGroupes(List<Groupe> teacherGroupes) {
        this.teacherGroupes = teacherGroupes;
    }

    public List<Answer> getAnswers() {
        return answers;
    }

    public void setAnswers(List<Answer> answers) {
        this.answers = answers;
    }

    public String getFirst_name() {
        return first_name;
    }

    public void setFirst_name(String first_name) {
        this.first_name = first_name;
    }

    public Role getRole() {
        return role;
    }

    public void setRole(Role role) {
        this.role = role;
    }

    public List<Quiz> getQuizzes() {
        return quizzes;
    }

    public void setQuizzes(List<Quiz> quizzes) {
        this.quizzes = quizzes;
    }
}
