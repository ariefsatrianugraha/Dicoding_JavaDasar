package com.dicoding.javafundamental.collection;

import java.util.*;

public class setPlanet {
    public static void  main(String[] args){
        // menggunakan HashSet

        Set<String> planets = new HashSet<>();

        planets.add("merkurius"); // method add() untuk menambahkan objek ke set
        planets.add("venus");
        planets.add("bumi");
        planets.add("bumi"); //menambahkan object bumi beberapa kali
        planets.add("bumi");
        planets.add("mars"); // objek bisa terus bertambah ke set

        // method size() untuk mendapatkan ukuran set
        System.out.println("Set planet awal: ( size = " + planets.size() + ")");
        for(String planet : planets){
            System.out.println("\t " + planet);
        }

        planets.remove("venus"); //method remove() untuk mengeluarkan object dari set

        System.out.println("Set planet akhir : (Set = " + planets.size() + ")");
        for(Iterator iterator = planets.iterator() ; iterator.hasNext(); ){
            // looping menggunakan iterator
            System.out.println("\t " + iterator.next());
        }
    }
}
