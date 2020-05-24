package com.dicoding.javafundamental.function;

public class MethodOverloading {
    public static void main(String[] args){
        double p = 6;
        double l = 7.5;
        double hasil = hitungLuas(p,l);
        System.out.println("hasil dari double adalah " + hasil);

        int pj = 8;
        int lb = 4;
        int hsl = hitungLuas(pj,lb);
        System.out.println("hasil dari int adalah " + hsl);
    }

    public static double hitungLuas(double panjang,double lebar){
        double luas = panjang * lebar;
        return  luas;
    }

    public static int hitungLuas(int panjang, int lebar){
        int luas = panjang * lebar;
        return luas;
    }
}
