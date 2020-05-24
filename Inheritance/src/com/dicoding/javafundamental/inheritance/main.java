package com.dicoding.javafundamental.inheritance;

public class main {
    public static void main(String[] args){
        Hewan hewan = new Hewan(); //memanggil constructor
        System.out.println("Apakah hewan IS-A Object -> " + (hewan instanceof Object));
        System.out.println("Apakah hewan IS-A Hewan -> " + (hewan instanceof Hewan));
        System.out.println("Apakah hewan IS-A Kucing -> " + (hewan instanceof Kucing));

        System.out.println("---------------------------------");

        Kucing kucing = new Kucing(); //memanggil constructor;
        System.out.println("Apakah kucing IS-A Object -> " + (kucing instanceof Object));
        System.out.println("Apakah kucing IS-A Hewan -> " + (kucing instanceof Hewan));
        System.out.println("Apakah kucing IS-A Kucing -> " + (kucing instanceof Kucing));

        System.out.println("---------------------------------");

        hewan.makan(); //kucing mewarisi metode makan() dari parent class
        kucing.makan();
        kucing.makan("daging ikan");

        System.out.println("----------------------------------");

        Kucing meow = new Kucing("ocicat","tropis");
        Kucing puss = new Kucing("ocicat","subtropis");
        Kucing popo = new Kucing("anggora","subtropis");

        System.out.println(meow.toString());
        System.out.println(puss.toString());
        System.out.println(popo.toString());

        System.out.println("Meow equals puss ??" + meow.equals(puss));
        System.out.println("Meow equals popo ??" + meow.equals(popo));

        System.out.println("-----------------------------------");

        Object o = new Kucing(); //kucing adalah object
        Hewan h = new Hewan(); //kkucing adalah hewan
        Kucing k = new Kucing(); //kucing adalah kucing

//        o.makan() -> error karena kelas makan tidak ada dikelas object
        h.makan();
        k.makan();

        Object objectK = k; //bisa langsung di assign
        Hewan hewanK = k; //bisa langsung di assign

//        objectK.makan(); -> akan terjadi error karena method makan() tidak ada diclass obejct
        hewanK.makan();

        Kucing kucingK = (Kucing) h; //tidak bisa langsung di assign, perlu di casting
        kucingK.makan();

        Hewan harimau = new Hewan();
        Kucing anggora = (Kucing) harimau; //compile ok tetapi runtime error ClassCastException
    }

}
