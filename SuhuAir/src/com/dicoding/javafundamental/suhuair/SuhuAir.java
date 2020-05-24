package com.dicoding.javafundamental.suhuair;

import java.sql.SQLOutput;
import java.util.Scanner;

public class SuhuAir {
    public static void main(String[] args){
        // contoh penggunaan IF tiga kasus : wujud air

        //kamus
        int T ;

        //program
        System.out.println("Contoh IF tiga kasus");
        System.out.println("Suhu (der. C) =  ");

        //Scanner masukan suhu air
        Scanner scanner = new Scanner(System.in);
        T = scanner.nextInt(); //Masukan suhu air dengan tipe int

        //Proses pengecekan dengan if
        if(T < 0) {
            System.out.println("Wujud air beku " + T);
        }else if((0 <= T) && ( T <= 100)){
            System.out.println("Wujud air cair " + T);
        }else if(T > 100 ){
            System.out.println("Wujud air uap/gas " + T);
        }
    }
}
