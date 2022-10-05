package com.anahuac.pdm_exercise_parcial2.poo;

public class Bicicleta {

    private String nombre;
    private String color;

    public Bicicleta(String name, String color){
        this.nombre = name;
        this.color = color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public String getColor() {
        return color;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getNombre() {
        return nombre;
    }
}
