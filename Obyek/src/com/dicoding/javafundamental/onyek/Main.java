package com.dicoding.javafundamental.onyek;

public class Main {
    public static void main(String[] args){
////        menciptakan obyek dengan nama obyekHewan
//        hewan obyekHewan = new hewan();
//        obyekHewan.cetakNama("ayam");

        hewan elang = new hewan("elang");
        hewan kucing = new hewan( "kucing");

        elang.beratHewan(5);
        elang.jumlahKakiHewan(2);
        elang.cetakHewan();

        kucing.beratHewan(10);
        kucing.jumlahKakiHewan(4);
        kucing.cetakHewan();
    }
}
