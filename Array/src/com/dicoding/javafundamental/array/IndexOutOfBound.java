package com.dicoding.javafundamental.array;

public class IndexOutOfBound {
    public static void main(String[] args){
        int[] arrInt = {1,2,3,4};
        System.out.println(arrInt[0]);
        System.out.println(arrInt[1]);
        System.out.println(arrInt[2]);

        System.out.println(arrInt[4]);
    }
}
