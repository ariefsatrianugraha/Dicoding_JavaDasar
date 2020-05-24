package com.dicoding.javafundamental.onyek;

public class hewan {
//    public void cetakNama(String nama){
//        System.out.println("Nama Hewan " + nama);
//    }

    String nama;
    int berat;
    int jumlahKaki;

//    ini merupakan konstruktor dari kelas hewan.konstruktor adalah method pertama kali dijalankan ketika object diciptakan
    public hewan(String namaHewan){
        nama = namaHewan;
    }

    public void beratHewan (int beratHewan){
        berat = beratHewan;
    }

    public void jumlahKakiHewan (int jumlahKakiHewan){
        jumlahKaki = jumlahKakiHewan;
    }

    public void cetakHewan (){
        System.out.println("Nama Hewan " + nama);
        System.out.println("Berat Hewan " + berat +"kg");
        System.out.println("Jumlah Kaki Hewan " + jumlahKaki);
    }
}
