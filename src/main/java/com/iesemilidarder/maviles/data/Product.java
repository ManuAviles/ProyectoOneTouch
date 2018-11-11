package com.iesemilidarder.maviles.data;

import java.util.ArrayList;
import java.util.List;

public abstract class Product {

    protected Integer id;
    protected String name;
    protected String place;
    protected String company;
    protected Double Price;

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getPlace() {
        return place;
    }

    public void setPlace(String place) {
        this.place = place;
    }

    public String getCompany() {
        return company;
    }

    public void setCompany(String company) {
        this.company = company;
    }

    public Double getPrice() {
        return Price;
    }

    public void setPrice(Double price) {
        Price = price;
    }

    public void setName() {
    }



}
