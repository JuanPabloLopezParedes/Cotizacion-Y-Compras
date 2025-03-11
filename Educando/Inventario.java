/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Educando;

/**
 *
 * @author juanp
 */
import java.util.ArrayList;
import java.util.List;

public class Inventario {
    private List<Bien> bienes;
    
    public Inventario(){
        this.bienes = new ArrayList<>();
    }
    
    public void agregarBien(Bien bien){
        bienes.add(bien);
        System.out.println("Bien" + bien.getNombre() + "agregado al inventario");
        
    }
    
    public Bien obtenerBienPorCodigo(String codigo){
        for(Bien bien : bienes){
            if (bien.getCodigo().equals(codigo)) {
                return bien;
            }
        }
        return null;
        
    }
    
    public void actualizacionInventario(String codigo, int nuevaCantidad){
        
        Bien bien = obtenerBienPorCodigo(codigo);
        if (bien != null) {
            bien.sumarStock(nuevaCantidad);
            
            System.out.println("Inventario actualizado. Nueva cantidad" + bien.getNombre() + ":" + bien.getCantidad());
        } else{
            System.out.println("No se encontro el bien");
        }
        
    }
    
    public void generarInforme(){
        System.out.println("Generando el informe del inventario....");
        for(Bien bien : bienes){
            System.out.println("Codigo: " + bien.getCodigo() + "nombre:" + bien.getNombre() + "cantidad:" + bien.getCantidad());
            
            bien.mostrarHistorialUbicaciones();
            bien.mostrarHistorialMovimientos();
        }
    }
    
    public void actualizacionRegistro(String codigo, int cantidadNueva){
        actualizacionInventario(codigo, cantidadNueva);
        
    }
            
    
}
