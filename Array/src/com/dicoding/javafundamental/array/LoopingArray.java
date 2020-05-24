package com.dicoding.javafundamental.array;

public class LoopingArray {
    public static void main(String[] args){
        int[] arrInt = new int[100];

        // inisiali element dari 1 sampai 100
        for(int i = 1 ; i <= arrInt.length ; i++){
            arrInt[i] = i + 1;
            System.out.println("angka =" +arrInt[i]);
        }
    }
}
