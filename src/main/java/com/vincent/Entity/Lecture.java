package com.vincent.Entity;

import javax.persistence.*;
import java.util.List;

@Entity
@Table(name = "Lecture")
public class Lecture {

    @Id
    @GeneratedValue
    @Column(name = "id")
    private int id;

    @Column(name = "name")
    private String name;

    @OneToMany(mappedBy = "lecture")
    private List<Evaluation> evaluations;

    @ManyToOne
    @JoinColumn(name = "id_groupe")
    private Groupe groupe;


    public Lecture() {}
}
