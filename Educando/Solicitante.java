/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Educando;

/**
 *
 * @author juanp
 */
public class Solicitante extends Trabajador{
    
    private CentroCosto centrocosto;
    
    public Solicitante(String nombre, String identificacion, CentroCosto centrocosto){
        super(nombre, identificacion);
        this.centrocosto = centrocosto;
    }
        
    public CentroCosto getCentroCosto(){
        return centrocosto;
    }
    
}
