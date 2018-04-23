package com.teaching.android;

public class Circulo {
    private int radio;
    private Punto centro;


    public Circulo () { //Constructor sin parámetros

    }

    public Circulo (int x, int y, int radio) { //Constructor con 3 parámetros
        this.radio = radio;
        this.centro = new Punto(x,y);

    }

    public Circulo (Punto p,int radio) { //Constructor con 2 parámetros
        this.radio = radio;
        this.centro = p;

    }

    public int getRadio() {
        return radio;
    }

    public void setRadio(int radio) {
        this.radio = radio;
    }

    public Punto getCentro() {
        return centro;
    }

    public void setCentro(Punto centro) {
        this.centro = centro;
    }

    //Metodo calcula Área: PI x radio al cuadrado
    public double getArea () {
        double area = Math.PI * Math.pow(radio, 2);
        return area;
    }

    //Método calcula Circunferencia: 2 x PI x radio
    public double getCircunferencia() {
        double circunferencia = 2 * Math.PI * radio;
        return circunferencia;
    }

    @Override
    public String toString() {
        return "Circulo{" +
                "radio=" + radio +
                ", centro=" + centro +
                '}';
    }
}

