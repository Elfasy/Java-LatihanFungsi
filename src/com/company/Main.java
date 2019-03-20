package com.company;

import  java.util.*;
public class Main {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.print("panjang = ");
        int inputPanjang = input.nextInt();
        System.out.print("lebar = ");
        int inputLebar = input.nextInt();
        gambar(inputPanjang,inputLebar);

        System.out.println("Keliling = " + keliling(inputPanjang,inputLebar));
        System.out.println("Luas = " + luas(inputPanjang,inputLebar));

        System.out.println("==================================");

        tampilLuasDanKeliling(inputPanjang,inputLebar);
    }

    private static int luas(int panjang, int lebar){
        int hasil = panjang * lebar;
        return hasil;
    }

    private static int keliling(int panjang, int lebar){
        int hasil = (panjang + lebar) *2;
        return  hasil;
    }

    private static void tampilLuasDanKeliling(int panjang,int lebar){
        System.out.println("Keliling = " + keliling(panjang,lebar));
        System.out.println("Luas = " + luas(panjang,lebar));
    }
    private static void gambar(int panjang, int lebar){
        for(int i=0;i < lebar;i++){
            for(int j=0;j < panjang; j++){
                System.out.print("* ");
            }
            System.out.println();
        }
    }


}
