package com.company;

public class WorkShop {

    public static void main(String[] args) {

        int[] sayilar = new int[]{1, 2, 3, 4, 5, 6, 7, 8, 9, 10};

        System.out.println(sayiVarMi(sayilar,11));

    }

    public static boolean sayiVarMi(int[] sayilar, int sayi1) {
        boolean varMi = false;
        for (int i = 0; i < sayilar.length; i++) {
            if (sayilar[i] == sayi1) {
                varMi= true;
                break;
            } else {
                varMi= false;
            }
            
        }
       return  varMi;
    }
}

/*

class Main {
    public static void main(String[] args) {
          int[] sayilar = new int[]{1, 2, 5, 7, 9, 0};
          int aranacak = 15;

          boolean varMi = sayiBul(sayilar,9); //true

                  //true,9
          mesajVer(varMi,aranacak);
    }

    public static void mesajVer(boolean varMi, int aranacak) {
        String mesaj = "";
        if (varMi==true) {
            mesaj = "Sayı mevcuttur: " + aranacak;
            System.out.println(mesaj);
        } else {
            mesaj = "Sayı mevcut değildir: " + aranacak;
            System.out.println(mesaj);
        }
    }

    public static boolean sayiBul(int[] sayilar, int aranacak){
        boolean varMi = false;

        for (int sayi : sayilar) {
            if (sayi == aranacak) {
                varMi = true;
                break;
            }
        }

        return varMi;
    }
}

//Bir fonksyon yaz - bool döndürsün - sayiBul
//İki parametre alsın. P1 : dizi P2: 30
//30 sayısı dizide yoktur
 */

