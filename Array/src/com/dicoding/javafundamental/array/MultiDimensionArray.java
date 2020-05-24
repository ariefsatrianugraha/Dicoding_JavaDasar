package com.dicoding.javafundamental.array;

public class MultiDimensionArray {
    public static void main(String[] args){
        char[][] arrChar = new char[2][];
        arrChar[0] = new char[2];
        arrChar[1] = new char[3];

//        Dimensi 0 yang indeksnya 0 memiliki panjang 2
        arrChar[0][0] = 'A';
        arrChar[0][1] = 'B';

//        Dimensi 1 yang indeksnya 1 memiliki panjang 3
        arrChar[1][0] = 'C';
        arrChar[1][1] = 'D';
        arrChar[1][2] = 'E';

//        Tampilkan semua data dari dimensi 1 yang memiliki indeks 0
        System.out.println("indeks 0 indeks 0 panjangnya 2 =" + arrChar[0][0]);
        System.out.println("indels 0 indeks 1 panjangnya 2 =" + arrChar[0][1]);

//        Tampilkan semua data dari dimensi 1 yang memiliki indeks 1
        System.out.println("indeks 1 indeks 0 panjangnya 3 =" + arrChar[1][0]);
        System.out.println("indeks 1 indeks 1 panjangnya 3 =" + arrChar[1][1]);
        System.out.println("indeks 1 indeks 2 panjangnya 3 =" + arrChar[1][2]);
    }
}
