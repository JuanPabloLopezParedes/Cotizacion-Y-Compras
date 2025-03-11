/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Educando;

/**
 *
 * @author juanp
 */
public class DirectorFinanciero {
    
    private String nombre;
    private String numeroId;
    
    public DirectorFinanciero(String nombre, String numeroIdentificacion){
        this.nombre = nombre;
        this.numeroId = numeroIdentificacion;
    }
    
    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getNumeroIdentificacion() {
        return numeroId;
    }

    public void setNumeroIdentificacion(String numeroIdentificacion) {
        this.numeroId = numeroIdentificacion;
    }

    @Override
    public String toString() {
        return "DirectorFinanciero [nombre=" + nombre + ", numeroIdentificacion=" + numeroId + "]";
    }
    
}
