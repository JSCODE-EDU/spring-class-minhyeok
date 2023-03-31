package com.jscode.spring.entity;

import java.util.ArrayList;
import java.util.List;
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
    @OneToMany(fetch = FetchType.EAGER,cascade = CascadeType.ALL)
    private List<ProductEntity> productEntity;

    public Long getId() {
        return id;
    }

    public List<ProductEntity> getProductEntity() {
        return productEntity;
    }

    public void setProductEntity(List<ProductEntity> productEntity) {
        this.productEntity = productEntity;
    }

    public void addProduct(ProductEntity productEntity){
        this.productEntity.add(productEntity);
        //productEntity.updateStore(this);
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
