package com.jscode.spring.entity;

import javax.persistence.*;

@Table(name = "store_entity")
@Entity
public class StoreEntity {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @Column
    private String name;

    @Column
    @Embedded
    private Address address;

    @Column
    private Long phonenumber;

    public StoreEntity() {

    }

    public Long getId() {
        return id;
    }

    public String getName() {
        return name;
    }

    public Address getAddress() {
        return address;
    }

    public Long getPhonenumber() {
        return phonenumber;
    }
}
