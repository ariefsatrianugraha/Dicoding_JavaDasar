package com.dicoding.javafundamental.operator;

public class operatorConditional {
    public static void main(String[] args){
        int value1 = 4;
        int value2 = 5;

        System.out.println("Condisi and &&");
        boolean hasil = value1 == 3 && value2 == 5;
        boolean hasil2 = value1 != 3 && value2 == 5;
        System.out.println("hasil value1 == 3 && value2 == 5 =" + hasil);
        System.out.println("hasil value1 != 3 && value2 == 5 =" + hasil2);

        System.out.println();

        System.out.println("condisi or ||");
        hasil = value1 == 3 || value2 == 5;
        hasil2 = value1 != 3 || value2 == 5;
        System.out.println("hasil value1 == 3 || value2 == 5 =" + hasil);
        System.out.println("hasil value1 != 3 || value2 == 5 =" +hasil2);
    }
}
