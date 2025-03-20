package com.springurfu.webhomework.entity;

import java.util.Date;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonProperty;

public class Entity {
    private double price;
    private Info info;

    @JsonCreator
    public Entity(@JsonProperty("price") double price, @JsonProperty("info") Info info) {
        this.price = price;
        this.info = info;
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(int price) {
        this.price = price;
    }

    public Info getInfo() {
        return info;
    }

    public void setInfoId(int id) {
        info.setId(id);
    }
}

class Info {
    private int id;
    private Date date;

    @JsonCreator
    public Info(@JsonProperty("id") int id, @JsonProperty("date") Date date) {
        this.id = id;
        this.date = date;
    }

    public void setId(int id) {
        this.id = id;
    }

    public void setDate(Date date) {
        this.date = date;
    }

    public int getId() {
        return id;
    }

    public Date getDate() {
        return date;
    }
}