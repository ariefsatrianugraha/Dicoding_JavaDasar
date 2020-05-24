package com.dicoding.javafundamental.inputoutput;

import java.util.Scanner;

public class InputOutputFunction {
    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);
        System.out.println("Program penjumlahan sangat sederhana");
        System.out.print("Masukan angka pertama :");
        int value1 = scanner.nextInt();
        System.out.print("Masukan angka kedua :");
        int value2 = scanner.nextInt();
        int hasil = value1 + value2;
        System.out.print("Hasilnya : " + hasil);
    }
}

