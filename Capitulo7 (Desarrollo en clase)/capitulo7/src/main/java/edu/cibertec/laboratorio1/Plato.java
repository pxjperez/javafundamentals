/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package edu.cibertec.laboratorio1;

/**
 *
 * @author jpere
 */
public class Plato {
    private String Nombre;
    private int duracion;
    private int contador;

    public Plato(String Nombre, int duracion) {
        this.Nombre = Nombre;
        this.duracion = duracion;
    }

    public Plato() {
    }

    public String getNombre() {
        return Nombre;
    }

    public void setNombre(String Nombre) {
        this.Nombre = Nombre;
    }

    public int getDuracion() {
        return duracion;
    }

    public void setDuracion(int duracion) {
        this.duracion = duracion;
    }

    public int getContador() {
        return contador;
    }

    public void setContador(int contador) {
        this.contador = contador;
    }

    @Override
    public String toString() {
        return "Plato{" + "Nombre=" + Nombre + ", duracion=" + duracion + ", contador=" + contador + '}';
    }
    
}
