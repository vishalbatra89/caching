package com.hibernate.caching.entity;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;

@Entity 
@Table(name="Society")
public class CachingEntity 
{
    @Id 
    @Column(name="flatno")
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int flatno;
    @Column (name="name")
    private String name;
    @Column(name="tower")
    private int tower;
    @Column (name="parking")
    private boolean parking;
    public int getFlatno() {
        return flatno;
    }
    public void setFlatno(int flatno) {
        this.flatno = flatno;
    }
    public String getName() {
        return name;
    }
    public void setName(String name) {
        this.name = name;
    }
    public int getTower() {
        return tower;
    }
    public void setTower(int tower) {
        this.tower = tower;
    }
    public boolean isParking() {
        return parking;
    }
    public void setParking(boolean parking) {
        this.parking = parking;
    }
    public CachingEntity(String name, int tower, boolean parking) {
        this.name = name;
        this.tower = tower;
        this.parking = parking;
    }
    public CachingEntity() {
    }

    

}
