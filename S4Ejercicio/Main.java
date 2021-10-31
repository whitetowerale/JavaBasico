package com.S4Poo.S4Ejercicio;

import java.sql.SQLOutput;

public class Main {
    public static void main(String[] args) {

        SmartDevice iphoneMaria = new SmartWatch(false, "10.0", 5.7d, 3500, "Blanco", "IOS", "lightning");
        SmartWatch iwatchPepe = new SmartWatch(false, "3.0", 2d, 1600, "Plateado", "IOS", "Magnético");


        System.out.println(iphoneMaria.toString());
        System.out.println( iwatchPepe.toString());
    }
    }

