/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package lab2_examen1_fredysalvador;

/**
 *
 * @author Fredy Salvador
 */
public class Extraterrestre extends Personas {
     private String planetaProcedencia;

    public Extraterrestre() {
    }

    public Extraterrestre(String planetaProcedencia, String nombre, String poder, String debilidad, String escuadron, int fuerza, int agilidadFisica, int agilidadMental) {
        super(nombre, poder, debilidad, escuadron, fuerza, agilidadFisica, agilidadMental);
        this.planetaProcedencia = planetaProcedencia;
    }

    public String getPlanetaProcedencia() {
        return planetaProcedencia;
    }

    public void setPlanetaProcedencia(String planetaProcedencia) {
        this.planetaProcedencia = planetaProcedencia;
    }
     
     
}
