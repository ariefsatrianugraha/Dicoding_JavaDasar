package com.dicoding.javafundamental.propertimethod;

public class Hewan {
//    Properti atau field
//    Inisialisasi dengan nilai inisial
    double tinggi = 3;
    double berat = 3;

//    Inisialisasi melalui konstruktor
    int umur;

//    konstruktor dengan menggunakan parameter
//    hewan(int umurHewan){
//        umur = umurHewan;
//    }
    Hewan(int umur){
        this.umur = umur;
    }

    void lari(){
        System.out.println("Berlari dengan sangat cepat");
    }

    void jalan(){
        System.out.println("Berjalan dengan sangat perlan");
    }

    void makan(){
        System.out.println("Makan dengan menggunakan mulut");
    }

    double getBerat(){
        return berat;
    }

    double getTinggi(){
        return tinggi;
    }

    double getUmur(){
        return umur;
    }
}
