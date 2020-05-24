package com.dicoding.javafundamental.generics;

import java.util.ArrayList;
import java.util.List;

public class Main {

    public static void main(String[] args){
        List Io = new ArrayList(); //List tanpa type-parameter
        Io.add("Io - String 1"); // Io untuk menampung objek string
        Io.add(new Planet("mekruis" , 0.06)); // Io menampung objek planet

        for (Object o : Io){
            Planet p = (Planet) o; //perlu type - casting dari object ke planet
            p.print();
        }

        List<Planet> Ip = new ArrayList<>(); //List dengan type-parameter Planet
        Ip.add(new Planet("merkurius",0.05)); // Ip untuk menampung objek planet
//        Ip.add("Ip - String 1"); // baris ini compile error, Ip tidak diizinkan menampung string

        for (Planet p : Ip){
            p.print();
        }
    }

}
