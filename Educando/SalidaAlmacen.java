/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Educando;

/**
 *
 * @author juanp
 */
import java.util.List;

public class SalidaAlmacen {
    
    private String fechaEntrega;
    private String fechaSalida;
    private String idSalida;
    private Trabajador empleadoResponsable;
    private List<ItemSolicitud> itemsEntregados;
    
    
    //Constructor
    public SalidaAlmacen(String fechaDeEntrega, String fechaDeSalida, String idSalida, Trabajador empleadoResponsable, List<ItemSolicitud> itemsEntregados){
        this.fechaEntrega = fechaDeEntrega;
        this.fechaSalida = fechaDeSalida;
        this.idSalida = idSalida;
        this.empleadoResponsable = empleadoResponsable;
        this.itemsEntregados = itemsEntregados;
    }
    
    
    //Metodos get y set
    public String getIdSalida() {
        return idSalida;
    }

    public String getFechaSalida() {
        return fechaSalida;
    }

    public String getFechaEntrega() {
        return fechaEntrega;
    }

    public Trabajador getEmpleadoResponsable() {
        return empleadoResponsable;
    }

    public List<ItemSolicitud> getItemsEntregados() {
        return itemsEntregados;
    }
    
    public void registrarSalida(){
        System.out.println("Salida registrada con exito");
        System.out.println("Id salida: " + idSalida);
        System.out.println("Fecha de entrega: " + fechaEntrega);
        System.out.println("Fecha de salida: " + fechaSalida);
        System.out.println("Trabajador responsable: " + empleadoResponsable.getNombre());
        
        System.out.println("Items entregados:");
        for(ItemSolicitud item : itemsEntregados){
            System.out.println("" + item.getBien().getNombre() + item.getCantidad() + "unidades");
        }
        
    }
    
    
}
