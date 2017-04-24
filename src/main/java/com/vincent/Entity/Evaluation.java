package com.vincent.Entity;

import javax.persistence.*;

@Entity
@Table
public class Evaluation {

    @Id
    @GeneratedValue
    @Column
    private int id;

    @Column
    private String commentary;

    @ManyToOne
    @JoinColumn(name = "id_lecture")
    private Lecture lecture;


    public Evaluation() {}


    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getCommentary() {
        return commentary;
    }

    public void setCommentary(String commentary) {
        this.commentary = commentary;
    }

    public Lecture getLecture() {
        return lecture;
    }

    public void setLecture(Lecture lecture) {
        this.lecture = lecture;
    }
}
