/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package lab2_examen1_fredysalvador;

/**
 *
 * @author Fredy Salvador
 */
public class Personas {
    public String nombre;
    public String poder;
    public String debilidad;
    public Escuadron escuadron;
    public int fuerza;
    public int agilidadFisica;
    public int agilidadMental;

    public Personas() {
    }

    public Personas(String nombre, String poder, String debilidad, String escuadron, int fuerza, int agilidadFisica, int agilidadMental) {
        this.nombre = nombre;
        this.poder = poder;
        this.debilidad = debilidad;
        this.fuerza = fuerza;
        this.agilidadFisica = agilidadFisica;
        this.agilidadMental = agilidadMental;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getPoder() {
        return poder;
    }

    public void setPoder(String poder) {
        this.poder = poder;
    }

    public String getDebilidad() {
        return debilidad;
    }

    public void setDebilidad(String debilidad) {
        this.debilidad = debilidad;
    }

    public Escuadron getEscuadron() {
        return escuadron;
    }

    public void setEscuadron(Escuadron escuadron) {
        this.escuadron = escuadron;
    }

    public int getFuerza() {
        return fuerza;
    }

    public void setFuerza(int fuerza) {
        this.fuerza = fuerza;
    }

    public int getAgilidadFisica() {
        return agilidadFisica;
    }

    public void setAgilidadFisica(int agilidadFisica) {
        this.agilidadFisica = agilidadFisica;
    }

    public int getAgilidadMental() {
        return agilidadMental;
    }

    public void setAgilidadMental(int agilidadMental) {
        this.agilidadMental = agilidadMental;
    }
    
    
    
    
}
