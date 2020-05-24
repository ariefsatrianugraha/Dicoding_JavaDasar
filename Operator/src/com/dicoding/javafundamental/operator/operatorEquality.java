package com.dicoding.javafundamental.operator;

public class operatorEquality {
    public static void main(String[] args){
        int value1 = 5;
        int value2 = 4;
        boolean hasil;

        hasil = value1 == value2;
        System.out.println("hasil dari value1 == value2 =" + hasil);
        System.out.println();

        System.out.println("tidak sama dengan");
        hasil = value1 != value2;
        System.out.println("hasil dari value1 != value2 =" + hasil);
        System.out.println();

        System.out.println("lebih besar dari");
        hasil = value1 > value2;
        System.out.println("hasil dari value1 > value2 =" + hasil);
        System.out.println();

        System.out.println("sama atau lebih besar dari");
        hasil = value1 >= value2;
        System.out.println("hasil dari value1 >= value2 =" + hasil);
        System.out.println();

        System.out.println("kurang dari");
        hasil = value1 < value2;
        System.out.println("hasil dari value1 < vallue2 =" + hasil);
        System.out.println();

        System.out.println("sama atau kurang dari");
        hasil = value1 <= value2;
        System.out.println("Hasil dari value1 <= value2 =" + hasil);
        System.out.println();
    }
}
