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

public class Almacen {
    private List<EntradaAlmacen> entradas;
    private List<SalidaAlmacen> salidas;
    private List<Bien> inventarioDelAlmacen;
    
    public Almacen(){
        this.entradas = new ArrayList<>();
        this.salidas = new ArrayList<>();
        this.inventarioDelAlmacen = new ArrayList<>();
    }
    
    public void registroEntrada(EntradaAlmacen entrada){
        entradas.add(entrada);
    }
    
    public void registroSalida(SalidaAlmacen salida){
        salidas.add(salida);
    }
    
     // Registrar un bien en el almacen
    public void registrarEntrada(Bien bien, int cantidad) {
        Bien bienExistente = buscarBien(bien.getCodigo());

        if (bienExistente != null) {
            bienExistente.sumarStock(cantidad);
        } else {
            bien.sumarStock(cantidad);
            inventarioDelAlmacen.add(bien);
        }
        System.out.println("Entrada registrada: " + cantidad + " unidades de " + bien.getNombre() + " añadidas al almacén.");
    }

    // Registrar la salida de un bien
    public void registrarSalida(Bien bien, int cantidad) {
        Bien bienExistente = buscarBien(bien.getCodigo());

        if (bienExistente != null && bienExistente.getCantidad() >= cantidad) {
            bienExistente.sumarStock(-cantidad);
            System.out.println("Salida registrada: " + cantidad + " unidades de " + bien.getNombre() + " retiradas del almacén.");
        } else {
            System.out.println("No hay suficiente stock para la salida del bien " + bien.getNombre());
        }
    }
    

    // Método para buscar un bien en el inventario por código
    public Bien buscarBien(String codigo) {
        for (Bien bien : inventarioDelAlmacen) {
            if (bien.getCodigo().equals(codigo)) {
                return bien;
            }
        }
        return null;
    }
    

    // Método para mostrar el inventario actual
    public void mostrarInventario() {
        System.out.println("\n Inventario del Almacén:");
        for (Bien bien : inventarioDelAlmacen) {
            System.out.println("Código: " + bien.getCodigo() + " | Nombre: " + bien.getNombre() + " | Cantidad: " + bien.getCantidad());
        }
    }
}
