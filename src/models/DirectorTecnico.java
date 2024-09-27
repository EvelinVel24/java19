package models;

import java.util.ArrayList;
import java.util.List;

public class DirectorTecnico extends Persona {
    private int añosExperiencia;
    private List<String> tarjetas;

    public DirectorTecnico(String nombre, String apellido, int edad, int añosExperiencia) {
        super(nombre, apellido, edad);
        this.añosExperiencia = añosExperiencia;
        this.tarjetas = new ArrayList<>();
    }

    // Getters y Setters
    public int getAñosExperiencia() {
        return añosExperiencia;
    }

    public void setAñosExperiencia(int añosExperiencia) {
        this.añosExperiencia = añosExperiencia;
    }

    public String amonestar(String tarjeta) {
        tarjetas.add(tarjeta);
        return getNombre() + " ha recibido una tarjeta " + tarjeta + ".";
    }

    @Override
    public String toString() {
        return super.toString() + ", Años de experiencia: " + añosExperiencia;
    }
}
