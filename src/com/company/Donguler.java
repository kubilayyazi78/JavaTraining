package com.company;

public class Donguler {
    public static void main(String[] args) {
        for (int i = 0; i <= 10; i++) {
            System.out.println(i);
        }
        int sayi = 10;
        while (sayi <= 100) {
            System.out.println(sayi);
            sayi++;
        }
        int sayi2 = 11;
        do {
            System.out.println(sayi2);
            sayi2 = sayi2 + 10;
        } while (sayi2 > 100);

    }
}
