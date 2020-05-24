package com.dicoding.javafundamental.inputoutput;

import javax.swing.*;
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class UserBufferedReader {

    public static void main( String[] args){
        InputStreamReader isr =new InputStreamReader(System.in);
        BufferedReader bufferedReader = new BufferedReader(isr);
        System.out.println("Program penjumlahan sangat sederahana");
        int value1 = 0;
        int value2 = 0;
        try {
            System.out.print("masukan nilai pertama :");
            value1 = Integer.parseInt(bufferedReader.readLine());
            System.out.print("Masukan nilai kedua :");
            value2 = Integer.parseInt(bufferedReader.readLine());
        }catch (IOException e){
            e.printStackTrace();
        }

        int hasil =value1 + value2;
        System.out.print("Hasilnya adalah : " + hasil);
    }
}
