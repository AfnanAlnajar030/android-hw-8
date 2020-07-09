package com.example.pokemoncw7;

import java.io.Serializable;

public class Pokemon implements Serializable {

    String name ;
    private int image;
    private int attack;
    private int defence ;
    private int total;
    private String type;

    //constructor
    public Pokemon(String name, int image, int attack, int defence, int total, String type) {
        this.name = name;
        this.image = image;
        this.attack = attack;
        this.defence = defence;
        this.total = total;
        this.type = type;
    }

    //getters and setters
    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getImage() {
        return image;
    }

    public void setImage(int image) {
        this.image = image;
    }

    public int getAttack() {
        return attack;
    }

    public void setAttack(int attack) {
        this.attack = attack;
    }

    public int getDefence() {
        return defence;
    }

    public void setDefence(int defence) {
        this.defence = defence;
    }

    public int getTotal() {
        return total;
    }

    public void setTotal(int total) {
        this.total = total;
    }

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }
}
