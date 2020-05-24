package com.dicoding.javafundamental.propertimethod;

public class main {
    public static void main(String[] args){
//        tambahkan 1 argument dengan nilai int 2
//        nilai tersebut adalah nilai untuk digunakan unutk inisialisasi variable umur
        Hewan kucing = new Hewan(2);
        kucing.lari();
        kucing.jalan();
        kucing.makan();

//        contoh penggunaan fungsi getUmur
        System.out.println("Umur nya adalah " + kucing.getUmur());

//        Perhitungan indeks masa tubuh (BMI)
//        berat(kg) / (tinggi (m) * tinggi(m))
        double bmi = kucing.getBerat() / ((kucing.getTinggi() * 0.01) * (kucing.getTinggi() * 0.01));
        System.out.println(" Indks masa tubuhnya adalah " + bmi);
    }
}
