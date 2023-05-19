/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package lab2_examen1_fredysalvador;

/**
 *
 * @author Fredy Salvador
 */
public class Mutante  extends Personas {
     
    private String factoresMutantes;

    public Mutante() {
    }

    public Mutante(String factoresMutantes, String nombre, String poder, String debilidad, String escuadron, int fuerza, int agilidadFisica, int agilidadMental) {
        super(nombre, poder, debilidad, escuadron, fuerza, agilidadFisica, agilidadMental);
        this.factoresMutantes = factoresMutantes;
    }

    public String getFactoresMutantes() {
        return factoresMutantes;
    }

    public void setFactoresMutantes(String factoresMutantes) {
        this.factoresMutantes = factoresMutantes;
    }
        
        
        
}
