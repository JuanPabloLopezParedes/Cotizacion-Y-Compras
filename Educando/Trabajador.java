/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Educando;

/**
 *
 * @author juanp
 */
public class Trabajador {
    
    protected String nombre;
    protected String identificacion;
    
    public Trabajador(String nombre, String identificacion){
        this.nombre = nombre;
        this.identificacion = identificacion;
    }
    
    //Obtener el identificador
    public String getNombre(){
        return nombre;
    }
    
    public String getIdTrabajador(){
        return identificacion;
    }
    
    
    
}
