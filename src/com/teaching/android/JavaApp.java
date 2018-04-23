package com.teaching.android;

import java.util.Random;
import java.util.Scanner;


/**
 * Empty Java App for teaching purposes.
 */
public class JavaApp {

    public static void main(String[] args) {

        /************************************************/

        //EJERCICIO RELACIONADO CON EL FICHERO Matriz.java Interesante revisar.
        Matriz m = new Matriz(3);
        Matriz n = new Matriz(3);

        int[] vector = {3, 2, 1, 1, 2, 3, 2, 3, 1};
        m.asignarDatos(vector);

        m.asignarDatos(new int[] {3, 2, 1, 1, 2, 3, 2, 3, 1});

        int[] vector2 = {1, 1, 2, 2, 1, 1, 1, 2, 1};
        n.asignarDatos(vector2);

        m.mostrar();
        n.mostrar();

        m.producto(n);
        m.mostrar();

        m.suma(n);
        m.mostrar();




/*
        //EJERCICIO RELACIONADO CON EL FICHERO Circulo.java
        Punto centro = new Punto(2,4);
        Circulo c = new Circulo(2,3,5);
        Circulo c2 = new Circulo(centro, 5);
        System.out.println("Area de c es: " + c.getArea());
        System.out.println("Area de c2 es: " + c2.getArea());
        double area = c.getArea();
        double circunferencia = c.getCircunferencia();
        System.out.println("El resultado del área es: " + area);
        System.out.println("El resultado de la circunferencia es: " + circunferencia);
*/
/*
        //EJERCICIO RELACIONADO CON EL FICHERO Punto.java
        Punto p1 = new Punto(2,4);
        Punto p2 = new Punto(3,5);
        double distancia = p1.distancia(3,5);
        System.out.println("La distancia entre los dos puntos es: " + distancia);
        double distancia2 = p1.distancia(p2);
        System.out.println("La distancia entre los dos puntos es: " + distancia);
        System.out.println(p1);
        System.out.println(p2);


        //EJERCICIO RELACIONADO CON EL FICHERO Persona.java
        /*
        Persona p1 = new Persona("Paco", 100.4f);
        Persona p2 = new Persona("Pepe", 500);
        System.out.println("Paco tiene " + p2.getDinero());
        System.out.println("Pepe tiene " + p1.getDinero());
        p1.pagar(p2, 35);
        System.out.println("Paco tiene " + p2.getDinero());
        System.out.println("Pepe tiene " + p1.getDinero());
        */


        //EJERCICIO 5 IMPRIMIR LOS 20 NUMEROS IMPARES
        /*
        for (int i = 1; i < 20; i = i + 2) {
            System.out.println(i);
        }
        */

        //EJERCICIO 4 Adivinar un numero comprendido entre 1-10 con 3 intentos.
        // Create a random number between 1 and 10

        //2 maneras:
        /*Random generator = new Random();

        int random = generator.nextInt(10) + 1;



        System.out.print("Estoy pensando en un número del 1 al 10. Puedes adivinarlo?");

        Scanner keyboard = new Scanner(System.in);
        int valor = keyboard.nextInt();

        for (int i = 0; i<3; i++) {
            int valor = keyboard.nextInt();

            if (valor == random) {
                System.out.print("Correcto!");
                System.exit(0);
            }
            if (i<2) {
                if (valor > random) {
                    System.out.println("Mas pequeño, prueba otra vez!");
                } else {
                    System.out.println("Mas alto, prueba otra vez!");
                }
            }
        }
        System.out.println("Has perdido, el número correcto es " + random);
        //Comento para que se vea como hacerlo con un for
        /*
        if (valor == random) {
            System.out.print("Correcto!");
            System.exit(0);
        } else if (valor > random) {
            System.out.println("Más pequeño! Prueba otra vez:");
        } else {
            System.out.println("Más alto! Prueba otra vez:");
        }

        valor = keyboard.nextInt();
        if (valor == random) {
            System.out.println("Correcto!");
            System.exit(0);
        } else if (valor > random) {
            System.out.println("Más pequeño! Prueba otra vez:");
        } else {
            System.out.println("Más alto! Prueba otra vez:");
        }

        valor = keyboard.nextInt();
        if (valor == random) {
            System.out.println("Correcto!");
            System.exit(0);
        }

        System.out.println("Has perdido, el número correcto es " + random);
    }
        //EJERCICIO 3
        /*
        System.out.println("Escribe un número: ");
        Scanner keyboard = new Scanner(System.in);
        int valor = keyboard.nextInt();

        if (valor % 2 == 0) {
            System.out.println("Es par");
        }
        else {
            System.out.println("Es impar");
        }



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


