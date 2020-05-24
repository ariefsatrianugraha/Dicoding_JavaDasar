package com.dicoding.javafundamental.collection;

import java.util.ArrayList;
import java.util.Collection;
import java.util.List;

public class listPlanet {

    public static void main(String[]args){

//        deklarasi array
        String[] heroes = new String[2];
        heroes[0] = "arief";
        heroes[1] = "satria";
//        heroes[2] = "nugraha" //error ArratIndexOutOfBoundsException ukuran array tetap

//        Menggunakan array list
        List<String> planets = new ArrayList<>();
        planets.add("merkurius"); // methis add() untuk menambah object ke list
        planets.add("venus");
        planets.add("mars");
        planets.add("bumi"); //object lainnya masih bisa terus ditambahkan kelist

        System.out.println("List planet awal :");
        for(int i = 0; i < planets.size(); i++){ //methos size() untuk mendapatkan ukuran list
            // method get() untuk melihat isi list pada index i
            System.out.println("\t index - " + i + " = " + planets.get(i));
        }

        planets.remove("venus"); // methid remove() unutk mengeluarkan object dari list

        System.out.println("List planet akhir");
        for(int i = 0; i < planets.size(); i++){
            System.out.println("\t index -" + i +" = " + planets.get(i));
        }
    }
}
