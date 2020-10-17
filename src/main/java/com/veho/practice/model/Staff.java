package com.veho.practice.model;

import lombok.Data;

import javax.persistence.*;

@Entity
@Data
public class Staff {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    private String staffNumber;
    private String name;
    private String gender;
    @OneToOne
    private Deparment deparment;
}
