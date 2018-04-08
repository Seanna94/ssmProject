package com.kaishengit.entity;

public class user {

    private Integer id;
    private String name;
    private String adress;
    private Float score;

    public user() {
    }

    public user(Integer id, String name, String adress, Float score) {
        this.id = id;
        this.name = name;
        this.adress = adress;
        this.score = score;
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getAdress() {
        return adress;
    }

    public void setAdress(String adress) {
        this.adress = adress;
    }

    public Float getScore() {
        return score;
    }

    public void setScore(Float score) {
        this.score = score;
    }


}
