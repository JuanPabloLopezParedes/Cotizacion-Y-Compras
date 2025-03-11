/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Educando;

/**
 *
 * @author juanp
 */
public class JefeDeArea extends Trabajador{
    private CentroCosto centrocosto;
    
    public JefeDeArea(String nombre, String identificacion, CentroCosto centrocosto){
        
        //Se llama al constructor de la super clase "Trabajador"
        super(nombre, identificacion); 
        this.centrocosto = centrocosto;
    }
    
    public CentroCosto getCentroCosto() {
    return centrocosto;
    }
    //Informacion del jefe
    public void mostrarInfo(){
        System.out.println("Nombres: " + getNombre());
        System.out.println("Identificacion: " + getIdTrabajador());
        System.out.println("Centro de Costo: " + centrocosto.getNombre());
    }
}
