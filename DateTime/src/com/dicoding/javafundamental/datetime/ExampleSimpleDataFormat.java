package com.dicoding.javafundamental.datetime;

import java.text.SimpleDateFormat;
import java.util.Date;

public class ExampleSimpleDataFormat {

    public static void main(String[] args){
        SimpleDateFormat sdf = new SimpleDateFormat("dd/M/yyyy");
        String dateFormated = sdf.format(new Date());
        System.out.println("Format tanggal difault :" + new Date());
        System.out.println("Format tanggal default format :" +dateFormated);
    }

}
