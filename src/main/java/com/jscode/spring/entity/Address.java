package com.jscode.spring.entity;

import javax.persistence.Embeddable;

@Embeddable
public class Address {
    private String address1;

    private String addressDetail;

    public Address(){

    }

    //Getter를 생성해주어야 한다!
    public String getAddress1() {
        return address1;
    }

    public String getAddressDetail() {
        return addressDetail;
    }
}
