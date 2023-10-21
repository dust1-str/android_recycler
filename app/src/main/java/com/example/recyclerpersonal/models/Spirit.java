package com.example.recyclerpersonal.models;

public class Spirit{
    private String nombre;
    private String color;
    private Gun arma;

    public Spirit(String nombre, String color, Gun arma) {
        this.nombre = nombre;
        this.color = color;
        this.arma = arma;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public Gun getArma() {
        return arma;
    }

    public void setArma(Gun arma) {
        this.arma = arma;
    }
}
