package com.company;

public class Metotlar {
    public static void main(String[] args) {
     mesajVer(); // staticte üretmene gerek yok nesneyi.
     Metotlar method = new Metotlar(); // nesne oluşturma. ClassName cs = new Classname
        method.hesapla();
    }

    public static  void mesajVer(){
        System.out.println("Belhanda");
    }

    public  void hesapla(){
        System.out.println("10");
    }
}
