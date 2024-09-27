package models;

import java.util.ArrayList;
import java.util.List;

public class Jugador extends Persona {
    private int numeroCamiseta;
    private String posicion;
    private List<String> tarjetas;

    public Jugador(String nombre, String apellido, int edad, int numeroCamiseta, String posicion) {
        super(nombre, apellido, edad);
        this.numeroCamiseta = numeroCamiseta;
        this.posicion = posicion;
        this.tarjetas = new ArrayList<>();
    }

    // Getters y Setters
    public int getNumeroCamiseta() {
        return numeroCamiseta;
    }

    public void setNumeroCamiseta(int numeroCamiseta) {
        this.numeroCamiseta = numeroCamiseta;
    }

    public String getPosicion() {
        return posicion;
    }

    public void setPosicion(String posicion) {
        this.posicion = posicion;
    }

    public String amonestar(String tarjeta) {
        tarjetas.add(tarjeta);
        return getNombre() + " ha recibido una tarjeta " + tarjeta + ".";
    }

    public String correr() {
        return getNombre() + " está corriendo.";
    }

    public String saltar() {
        return getNombre() + " está saltando.";
    }

    public String quitarBalon() {
        return getNombre() + " ha quitado el balón.";
    }

    @Override
    public String toString() {
        return super.toString() + ", Número: " + numeroCamiseta + ", Posición: " + posicion;
    }
}
