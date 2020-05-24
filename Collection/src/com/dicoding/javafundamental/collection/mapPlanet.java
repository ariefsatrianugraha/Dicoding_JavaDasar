package com.dicoding.javafundamental.collection;

import org.w3c.dom.ls.LSOutput;

import java.util.HashMap;
import java.util.Map;

public class mapPlanet {

    public static void main(String[] args){
        // menggunakan HashMap
        Map<String,Planet> planets = new HashMap<>();
        planets.put("Key-1 ", new Planet("merkurius",0.66)); //methid put() untuk menambahkan objek ke map
        planets.put("Key-2 ", new Planet("venus", 0.82));
        planets.put("Key-3 ", new Planet("bumi" , 1.00));
        planets.put("Key-4 ", new Planet("mars" , 0.11));
        planets.put("Key-4 ", new Planet("mars x" , 0.11)); //menambahkan ke map dengan key yang sama


        // method size() untuk mendapatkan ukuran set
        System.out.println("Map planets awal : (Size = " + planets.size() + ")");
        for(String key:planets.keySet()){ //looping key dari map
            // method get() untuk melihat isi map berdasarkan key
            System.out.println("\t " + key + " : " + planets.get(key));
        }

        planets.remove("Key-2 "); //method remove() untuk mengeluarkan objek dari map

        System.out.println("Map planets akhir : (size = " + planets.size() + ")");

        for(Planet planet : planets.values()){ //looping dari value ke map
            System.out.println("\t " + planet);
        }
    }


}
