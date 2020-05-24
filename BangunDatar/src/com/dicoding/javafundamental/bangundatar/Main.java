package com.dicoding.javafundamental.bangundatar;

import java.util.Scanner;

public class Main {

    private static char pilihan;
    private static Scanner scanner = new Scanner(System.in);

    public static void main(String[] args){
        //Kamus
        PesergiPanjang pp;
        SegitigaSiku ss;
        Lingkaran l;

        int s1,s2,r;

        pp = new PesergiPanjang();
        ss = new SegitigaSiku();
        l = new Lingkaran();


//        Program
        //panggil metode
        MainMenu();

        //Kondisional unutuk pilihan menu dimasukan
        switch (pilihan){
            case '1': {
                System.out.println("Masukan panjang pesergi : ");
                s1 = scanner.nextInt();
                System.out.println("Masukan lebar pesergi : ");
                s2 = scanner.nextInt();
                System.out.println("Luas persegi panjang : " + pp.luas(s1,s2));
                System.out.println("Keliling persegi panjang : " + pp.keliling(s1,s2));
                break;
            }
            case '2': {
                System.out.println("Masukan alas segitiga siku : ");
                s1 = scanner.nextInt();
                System.out.println("Masukan tinggi segitiga siku : ");
                s2 = scanner.nextInt();
                System.out.println("Luas segitiga : " + ss.luas(s1,s2));
                System.out.println("Keliling segitiga : " + ss.keliling(s1,s2));
                break;
            }
            case '3': {
                System.out.println("Masukan jari jari lungkaran : ");
                r = scanner.nextInt();
                System.out.println("Luas lingkaran : " + l.luas(r));
                System.out.println("keliling lingkaran : " + l.keliling(r));
                break;
            }
            default:{
                System.out.println("Tidak ada pilihan !!!");
                break;
            }
        }


    }

    private static void MainMenu(){
        //Pilihana menu
        System.out.println("=======================");
        System.out.println("Hitung Luas dan keliling");
        System.out.println("1. Pesergi panjang");
        System.out.println("2. Segitiga siku");
        System.out.println("3. Lingkaran");
        System.out.println("Masukan Menu : ");
        pilihan = scanner.next().charAt(0);
    }
}
