package com.dicoding.javafundamental.generics;

public class Planet {

    public String name;
    public double mass;

    public Planet(String name, double mass){
        this.name = name;
        this.mass = mass;
    }

    public void print(){
        System.out.println("Planet : "+ name + "Mass : " + mass);
    }

}
