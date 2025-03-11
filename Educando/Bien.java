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

public class Bien {
    private String codigo;
    private String nombre;
    private String tipo;
    private int cantidad;
    private List<String> historialDeUbicacion;
    private List<String> historialDeMovimiento;
    private boolean seguridadActivada;

    // Constructor
    public Bien(String codigo, String nombre, String tipo, int cantidad) {
        this.codigo = codigo;
        this.nombre = nombre;
        this.tipo = tipo;
        this.cantidad = cantidad;
        this.historialDeMovimiento = new ArrayList<>();
        this.historialDeUbicacion = new ArrayList<>();
        this.seguridadActivada = false;
    }

    // Registro de ubicación 
    public void asignarUbicacion(String responsable, String ubicacion, String fecha) {
        String registroUbicacion = "Responsable: " + responsable + ", Ubicación: " + ubicacion + ", Fecha: " + fecha;
        historialDeUbicacion.add(registroUbicacion);
    }

    // Registro de movimiento
    public void moverBien(String fecha, String nuevaUbicacion, String responsable) {
        if (seguridadActivada) {
            System.out.println("Movimiento denegado. Se ha activado la seguridad");
            return;
        }
        asignarUbicacion(responsable, nuevaUbicacion, fecha);
        historialDeMovimiento.add("Dirigido a " + nuevaUbicacion + ". Fecha: " + fecha);
        System.out.println("Bien movido a la nueva ubicación " + nuevaUbicacion);
    }

    public void activarSeguridad() {
        this.seguridadActivada = true;
        System.out.println("Seguridad activada para el producto " + nombre);
    }

    public void desactivarSeguridad() {
        this.seguridadActivada = false;
        System.out.println("Seguridad desactivada para el producto " + nombre);
    }

    // Metodo para Sumar stock
    public void sumarStock(int cantidad) {
        if (cantidad < 0) {
            System.out.println("Error: No se puede agregar una cantidad negativa.");
            return;
        }
        this.cantidad += cantidad;
    }

    // Método para restar stock
    public boolean restarStock(int cantidad) {
        if (cantidad <= 0) {
            System.out.println("Error: La cantidad a restar debe ser mayor que cero.");
            return false;
        }
        if (cantidad > this.cantidad) {
            System.out.println("Error: No hay suficiente stock para retirar.");
            return false;
        }
        this.cantidad -= cantidad;
        return true;
    }

    public String getCodigo() {
        return codigo;
    }

    public String getNombre() {
        return nombre;
    }

    public int getCantidad() {
        return cantidad;
    }

    public List<String> getHistorialUbicaciones() {
        return historialDeUbicacion;
    }

    public List<String> getHistorialMovimientos() {
        return historialDeMovimiento;
    }

    //Mostrar historial de movimientos
    public void mostrarHistorialUbicaciones() {
        System.out.println("Historial de ubicaciones de " + nombre + ":");
        for (String ubicacion : historialDeUbicacion) {
            System.out.println(ubicacion);
        }
    }

    public void mostrarHistorialMovimientos() {
        System.out.println("Historial de movimientos de " + nombre + ":");
        for (String movimiento : historialDeMovimiento) { // Lista corregida
            System.out.println(movimiento);
        }
    }
}
