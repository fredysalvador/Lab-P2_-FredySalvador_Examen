/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package lab2_examen1_fredysalvador;

import java.util.List;

/**
 *
 * @author Fredy Salvador
 */
public class Escuadron {
    private String nombre;
    private String lugarBase;
    private String lider;
    private String tipo;
    private List<Personas> miembros;

    public Escuadron(String nombre, String lugarBase, String lider, String tipo, List<Personas> miembros) {
        this.nombre = nombre;
        this.lugarBase = lugarBase;
        this.lider = lider;
        this.tipo = tipo;
        this.miembros = miembros;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getLugarBase() {
        return lugarBase;
    }

    public void setLugarBase(String lugarBase) {
        this.lugarBase = lugarBase;
    }

    public String getLider() {
        return lider;
    }

    public void setLider(String lider) {
        this.lider = lider;
    }

    public String getTipo() {
        return tipo;
    }

    public void setTipo(String tipo) {
        this.tipo = tipo;
    }

    public List<Personas> getMiembros() {
        return miembros;
    }

    public void setMiembros(List<Personas> miembros) {
        this.miembros = miembros;
    }
    
    public void agregarMiembro(Personas persona) {
        miembros.add(persona);
    }
    
    public void eliminarMiembro(Personas persona) {
        miembros.remove(persona);
    }
    
    
    
    @Override
    public String toString() {
        return "Escuadron: " + nombre + "\n" +
               "Lugar base: " + lugarBase + "\n" +
               "Líder: " + lider + "\n" +
               "Tipo: " + tipo + "\n";
    }
    
    
}
