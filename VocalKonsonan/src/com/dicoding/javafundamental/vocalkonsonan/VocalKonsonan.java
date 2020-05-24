package com.dicoding.javafundamental.vocalkonsonan;

import java.util.Scanner;

public class VocalKonsonan {

    public static void main(String[] args){

        //kamus
        String word = "";
        int vocal = 0;
        int konsonan = 0;


        //Program
        //masukan kalimat
        System.out.println("Masukan Kalimat : ");
        Scanner scanner = new Scanner(System.in);
        word = scanner.nextLine();


        //memangil prosedur yang mengembalikan nilai int
        vocal = num_vokal(word);
        konsonan = num_konsonan(word);

        System.out.println("Jumlah huruf vocal : " + vocal);
        System.out.println("Jumlah huruf konsonan : " + konsonan);
    }

    private static int num_vokal(String word){
        int i;
        int jumlah_vakal = 0;

        for(i = 0; i < word.length(); i++){
            if(word.charAt(i) == 'a' || word.charAt(i) == 'i' || word.charAt(i) == 'u' || word.charAt(i) == 'e' || word.charAt(i) == 'o'){
                jumlah_vakal++;
            }
        }

        return jumlah_vakal;
    }

    private static int num_konsonan(String word){
        int i;
        int jumlah_konsonan = 0;

        for(i = 0; i< word.length() ; i++){
            if(word.charAt(i) != 'a' && word.charAt(i) != 'i' && word.charAt(i) != 'u' && word.charAt(i) != 'e' && word.charAt(i) != 'o'){
                jumlah_konsonan++;
            }
        }

        return jumlah_konsonan;
    }

}
