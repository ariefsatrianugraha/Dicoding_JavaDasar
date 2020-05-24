package com.dicoding.javafundamental.operator;

public class operatorUnary {
    public static void main( String[] args){
        System.out.println("Operator Unari Plus");
        int nilaiPlus = 5;
        int hasil = +nilaiPlus;
        System.out.println("Hasil +5 =" + hasil);
        System.out.println();

        System.out.println("Operator Unary Minus");
        int nilaiMinus = 5;
        nilaiMinus = -nilaiMinus;
        System.out.println("Hasil -5 = " + nilaiMinus);
        System.out.println();

        System.out.println("Operator Peningakatan 1 point");
        int nilaiawal = 5;
        nilaiawal++;
        System.out.println("hasil 5++ =" + nilaiawal);
        System.out.println();

        System.out.println("Operator penurunan 1 point");
        int nilaiawal2 = 5 ;
        nilaiawal2--;
        System.out.println("hasil 5-- =" + nilaiawal2);
        System.out.println();

        System.out.println("Operator komploment logika");
        boolean sukses = false; //nilai sukses adalah false
        System.out.println("Hasil !false =" + !sukses);
        System.out.println();

    }
}
