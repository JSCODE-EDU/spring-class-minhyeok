package com.jscode.spring.entity;

import javax.persistence.*;

@Table(name = "student")
@Entity(name = "student")
public class Student {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long id;
    @Column(nullable = false, name = "name",length = 20)
    private String username;

    @Column(name = "class", columnDefinition = "varchar(20) default 'basic'")
    private String userclass;
}
