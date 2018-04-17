package com.teaching.android;

import java.util.Scanner;

/**
 * Empty Java App for teaching purposes.
 */
public class JavaApp {

    public static void main(String[] args) {


        //EJERCICIO 3

        System.out.println("Escribe un número: ");
        Scanner keyboard = new Scanner(System.in);
        int valor = keyboard.nextInt();

        if (valor % 2 == 0) {
            System.out.println("Es par");
        }
        else {
            System.out.println("Es impar");
        }


        /*
        //EJERCICIO 2
        System.out.println(2+5-3*2);
        System.out.println(2*4*2/2);
        System.out.println(1/2);
        System.out.println(5*(1/2));
        System.out.println(5f*1/2);

        //EJERCICIO 1
        byte b = 65; //8 bits
        char c = 'A'; //16 bits
        short s = 65; // 16 bits
        int i = 65; // 32 bits
        long l = 65L; // 64 bits
        float f = 65f; // 32 bits
        double d = 65.55; //64 bits
        boolean bol = true; // 1 bit


        System.out.println(b);
        System.out.println(c);
        System.out.println(s);
        System.out.println(i);
        System.out.println(l);
        System.out.println(f);
        System.out.println(d);
        System.out.println(bol);*/

    }

}
