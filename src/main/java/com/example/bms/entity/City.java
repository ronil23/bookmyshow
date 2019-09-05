package com.example.bms.entity;

import javax.persistence.Column;
import javax.persistence.Entity;

@Entity
public class City extends BaseEntity{


    @Column(name = "name", nullable = false)
    private String name;

}
