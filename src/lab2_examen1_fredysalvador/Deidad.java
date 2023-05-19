/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package lab2_examen1_fredysalvador;

/**
 *
 * @author Fredy Salvador
 */
public class Deidad extends Personas {
     private boolean tieneCreyentes;
    private String religionMitologia;

    public Deidad() {
    }

    public Deidad(boolean tieneCreyentes, String religionMitologia, String nombre, String poder, String debilidad, String escuadron, int fuerza, int agilidadFisica, int agilidadMental) {
        super(nombre, poder, debilidad, escuadron, fuerza, agilidadFisica, agilidadMental);
        this.tieneCreyentes = tieneCreyentes;
        this.religionMitologia = religionMitologia;
    }

    public boolean isTieneCreyentes() {
        return tieneCreyentes;
    }

    public void setTieneCreyentes(boolean tieneCreyentes) {
        this.tieneCreyentes = tieneCreyentes;
    }

    public String getReligionMitologia() {
        return religionMitologia;
    }

    public void setReligionMitologia(String religionMitologia) {
        this.religionMitologia = religionMitologia;
    }
    
    
    
    
    
}
