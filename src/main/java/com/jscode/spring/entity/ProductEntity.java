package com.jscode.spring.entity;

import javax.persistence.*;

@Table(name = "product_entity")
@Entity
public class ProductEntity {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @Column
    private String name;

    @Column
    private Long price;

    public ProductEntity() {

    }

/*    @ManyToOne(fetch = FetchType.EAGER)
    private StoreEntity storeEntity;*/

    public Long getId() {
        return id;
    }

    public String getName() {
        return name;
    }

    public Long getPrice() {
        return price;
    }
//
//    public void updateStore(StoreEntity storeEntity){
//        this.storeEntity = storeEntity;
//    }
}
