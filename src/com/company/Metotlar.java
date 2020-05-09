package com.company;

public class Metotlar {
    public static void main(String[] args) {
        mesajVer("aa"); // staticte üretmene gerek yok nesneyi.
        mesajVer("bb");
        Metotlar method = new Metotlar(); // nesne oluşturma. ClassName cs = new Classname
        method.hesapla();
        System.out.println(topla(6, 3));

        System.out.println(toplananYuzdesi(10,90));

    }

    public static void mesajVer(String isim) {
        System.out.println("Belhanda" + " " + isim);
    }

    public void hesapla() {
        System.out.println("10");
    }

    public static int topla(int sayi1, int sayi2) {
        int toplam = sayi1 + sayi2;
        return toplam;
        //System.out.println("Toplam : = "+toplam);
    }

    public static double toplananYuzdesi(int sayi1, int sayi2) {
        int toplam = topla(sayi1, sayi2);
        double sonuc = toplam * 10 / 100;
        return sonuc;
    }

    public static double krediHesapla() {
        //hesaplar yapılır
        return 125000;
    }
}
