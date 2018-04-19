package com.teaching.android;

public class Punto {
    private int x;
    private int y;

    public Punto (int x, int y) { //Constructor con parámetros
        this.x = x;
        this.y = y;

    }
    public Punto () { //Constructor sin parámetros

    }

    //Metodo set y get para cada atributo:
    public int getX() {
        return x;
    }

    public int getY() {
        return y;
    }

    public void setX(int x) {
        this.x = x;
    }

    public void setY(int y) {
        this.y = y;
    }

    //Metodo distancia:

    public double distancia(int x, int y){
        int diferenciaX = x - this.x;
        int diferenciaY = y - this.y;
        double diferenciaXElevado = Math.pow(diferenciaX, 2);
        double diferenciaYElevado = Math.pow(diferenciaY, 2);
        double suma = diferenciaXElevado + diferenciaYElevado;
        double resultado = Math.sqrt(suma);
        return resultado;
    }

    public  double distancia(Punto p) {
        int diferenciaX = x - p.x;
        int diferenciaY = y - p.y;
        double diferenciaXElevado = Math.pow(diferenciaX, 2);
        double diferenciaYElevado = Math.pow(diferenciaY, 2);
        double suma = diferenciaXElevado + diferenciaYElevado;
        double resultado = Math.sqrt(suma);
        return resultado;
    }

    @Override
    public String toString() {
        return "Punto{" +
                "x=" + x +
                ", y=" + y +
                '}';
    }
}
















