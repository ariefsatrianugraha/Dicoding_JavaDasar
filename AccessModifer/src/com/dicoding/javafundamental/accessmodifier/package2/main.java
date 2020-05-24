package com.dicoding.javafundamental.accessmodifier.package2;

import com.dicoding.javafundamental.accessmodifier.package1.KelasA;

public class main {
    public static void main(String[] args){
//        kode ini pasti mengalami kompiler error

        KelasA kelasA = new KelasA();
//        System.out.println(kelasA.functionB());
//
//        System.out.println(kelasA.memberB);
//        System.out.println(kelasA.memberC);

        KelasB kelasB = new KelasB();
        kelasB.methodC();
    }
}
