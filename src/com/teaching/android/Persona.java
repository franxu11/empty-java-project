package com.teaching.android;

public class Persona { // *1
    //Atributos
    private String nombre; // *2
    private float dinero;


    //Constructor
    public Persona(String nombre, float dinero) { // *3
        this.nombre = nombre; // *4 //This hace referencia a los atributos de arriba
        this.dinero = dinero;
        System.out.println("Creada persona con nombre: " + nombre + " y dinero: " + dinero);
    }

    public void pagar(Persona p, float cantidad) {

        this.dinero = this.dinero + cantidad;
        p.dinero = p.dinero - cantidad;
    }

    public float getDinero() {
        return dinero;
    }
}

/********************************************************/
/*  1. SE DECLARA UNA CLASE
    2. Por seguridad a no ser cambiado sus caracteristicas se declaran ls tipos como private - Son atributos de la clase
    3. Se declara el constructor
    4. this.nombre hace referencia a lo que hay en los atributos de la clase (apartado 2)

 */