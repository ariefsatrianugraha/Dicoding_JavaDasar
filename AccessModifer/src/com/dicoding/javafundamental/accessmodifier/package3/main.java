package com.dicoding.javafundamental.accessmodifier.package3;

public class main {
    public static void main(String[] args){
        System.out.println("Nilai dari luar adalah " + Perhitungan.nilai);

        System.out.println("getNilai memiliki nilai " + Perhitungan.getNilai());

        for(int x = 0; x < 5; x++){
            new Perhitungan();
        }

        System.out.println("nilai sampai "+ Perhitungan.nilai);

        System.out.println("getNilai memiliki nilai " + Perhitungan.getNilai());
    }
}
