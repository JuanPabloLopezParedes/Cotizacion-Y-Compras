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

public class SolicitudCompra {
    private int id;
    private String fecha;
    private Trabajador solicitante;
    private List<ItemSolicitud> items;
    private boolean aprobadaPorDirector;
    
    public SolicitudCompra(int id, String fecha, Trabajador solicitante){
        this.id = id;
        this.fecha = fecha;
        this.solicitante = solicitante;
        this.items = new ArrayList<>();
        this.aprobadaPorDirector = false;
        
    }
    
    //Agregamos un item a la solicitud
    public void agregarItem(ItemSolicitud item){
        items.add(item);
    }
    
    // Aprobación de solicitud por parte del jefe
    public void aprobacionJefe(JefeDeArea jefe) {
    // Verificar si el jefe pertenece al mismo centro de costos que el solicitante
    if (jefe.getCentroCosto().equals(((Solicitante)solicitante).getCentroCosto())) {
        System.out.println("Solicitud aprobada por el jefe de su área " + jefe.getNombre());
       } else {
        System.out.println("Error: El jefe de área no pertenece al mismo centro de costos que el solicitante.");
       }
    }
    
    //Aprobacion de solicitud por parte del director
    public void aprobacionDirector(DirectorFinanciero director){
        this.aprobadaPorDirector = true;
        System.out.println("Solicitud aprobada por el director financiero " + director.getNombre());
    }
    
    
    //se muestra la solicitud
    public void mostrarSolicitud(){
        System.out.println("Solicitud Id: " + id);
        System.out.println("Solicitante: " + solicitante.getNombre());
        System.out.println("Fecha: " + fecha);
        
        
        System.out.println("Items solicitados");
        for(ItemSolicitud item : items){
            System.out.println("" + item.getBien().getNombre() + "" + item.getCantidad() + "unidades");
        }
        System.out.println("Aprobada por director: " + (aprobadaPorDirector ? "Si" : "No"));
    }
    
    
}
