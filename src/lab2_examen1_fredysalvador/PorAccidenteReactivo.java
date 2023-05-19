/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package lab2_examen1_fredysalvador;

/**
 *
 * @author Fredy Salvador
 */
public class PorAccidenteReactivo extends Personas{
        private int edadAccidente;
    private String tipoAccidente;
    
    public PorAccidenteReactivo() {
    }
    

    public PorAccidenteReactivo(int edadAccidente, String tipoAccidente, String nombre, String poder, String debilidad, String escuadron, int fuerza, int agilidadFisica, int agilidadMental) {
        super(nombre, poder, debilidad, escuadron, fuerza, agilidadFisica, agilidadMental);
        this.edadAccidente = edadAccidente;
        this.tipoAccidente = tipoAccidente;
    }

    public int getEdadAccidente() {
        return edadAccidente;
    }

    public void setEdadAccidente(int edadAccidente) {
        this.edadAccidente = edadAccidente;
    }

    public String getTipoAccidente() {
        return tipoAccidente;
    }

    public void setTipoAccidente(String tipoAccidente) {
        this.tipoAccidente = tipoAccidente;
    }
    
    
}
