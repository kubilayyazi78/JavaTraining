package com.company;
/*
public class vehicleManager extends creditManager {
    public void calculete(){
        System.out.println("Vehicle Kredi Hesaplandı.");
    }
}*/


public class vehicleManager implements CreditManager {
    @Override
    public void calculate() {
        System.out.println("Vehicle Kredi Hesaplandı.");
    }
}

