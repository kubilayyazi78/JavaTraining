package com.company;

import java.security.ProtectionDomain;

public class Main {
    public static void main(String[] args) {

      /*    Product product1=new Product();
          product1.setName("Laptop");

          Product product2=new Product();
          product2.setName("Mouse");
        Product[] urunler=new Product[]{product1,product2};

        for (int i =0; i<urunler.length; i++)
        {
            System.out.println(urunler[i].getName());
        }*/


      //  creditManager creditManager=new creditManager();

      //  CreditManager.add();
       // CreditManager.c();
    Product  product =new Product();
   // product.setDescription();

      //  mortgageManager mortgageManager=new mortgageManager();
      //  mortgageManager.add();

      //  CreditManager [] credits=new CreditManager[3];

        java.util.ArrayList<CreditManager> credits =new java.util.ArrayList<CreditManager>();

        credits.add(new mortgageManager());
        credits.add(new vehicleManager());
        credits.add(new officerManager());
       /*
        credits[0]=new mortgageManager();
        credits[1]=new vehicleManager();
        credits[2]=new officerManager();
*/

      for (CreditManager credit : credits){
          credit.calculate();
        }
    }
}
