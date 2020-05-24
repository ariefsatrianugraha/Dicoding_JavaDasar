package com.dicoding.javafundamental.percabangan;

public class SwitchWithoutBreak {
    public static void main(String[] args){
        String input = "C";
        int output = 0;

        switch (input){
            case "A":
                output++;
            case "B":
                output++;
            case "C":
//                Program akan menjalankan kode didalam case ini
                output++; //ouput = 1

//                karena di akhir case C tidak ada break,maka program akan berjalan pada case selanjutnya
            case "D":
//                kode ini kana dijalankan oleh program
                output++; //output = 2
            case "E":
//                kode ini akan dijalankan oleh program
                output++; //output = 3
            default:
//                case default akan dijalankan
                output++; //output = 4
        }

        System.out.println("Hasilnya adalah " + output);
    }
}
