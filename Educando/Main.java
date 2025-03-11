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

public class Main {
    public static void main(String[] args) {
        
        

        CentroCosto centroMantenimiento = new CentroCosto("CC-001", "Area de Mantenimiento");
        CentroCosto centroFinanzas = new CentroCosto("CC-002", "Area de Finanzas");

        // Creación de Empleados
        Solicitante solicitante = new Solicitante("Jose Lopez", "123456", centroMantenimiento);
        JefeDeArea jefeCorrecto = new JefeDeArea("John Arrieta", "654321", centroMantenimiento);
        JefeDeArea jefeIncorrecto = new JefeDeArea("Marlon Rodriguez", "789123", centroFinanzas);
        DirectorFinanciero director = new DirectorFinanciero("Pablo Escobar", "456789");
        

        // Creación de Bienes
        Bien Estanteria = new Bien("UVB003", "Estanteria metalica", "Mueble", 10);
        Bien sillaErgonomica = new Bien("ELE202", "Silla ergonómica", "Inmueble", 5);
        

        // Creación de Solicitud de Compra
        SolicitudCompra solicitud = new SolicitudCompra(101, "6/03/2025", solicitante);
        solicitud.agregarItem(new ItemSolicitud(Estanteria, 4, "Unidades", 2500000));
        solicitud.agregarItem(new ItemSolicitud(sillaErgonomica, 5, "Unidades", 300000));
        
        

        //Aprobación por parte del jefe y director
        solicitud.aprobacionJefe(jefeCorrecto);  // Aprobacion del jefe de area
        solicitud.aprobacionDirector(director);  // Aprobacion del director
        
        
        

        // Creamos Almacén y Registrar Entrada
        Almacen almacen = new Almacen();
        List<ItemSolicitud> itemsRecibidos = new ArrayList<>();
        itemsRecibidos.add(new ItemSolicitud(Estanteria, 2, "Unidades", 2500000));
        itemsRecibidos.add(new ItemSolicitud(sillaErgonomica, 5, "Unidades", 300000));
        EntradaAlmacen entrada = new EntradaAlmacen("E001", "7/03/2025", "Proveedor A", itemsRecibidos);
        almacen.registroEntrada(entrada);
        
        
        

        // Creamos la Salida de Almacén
        List<ItemSolicitud> itemsEntregados = new ArrayList<>();
        itemsEntregados.add(new ItemSolicitud(Estanteria, 2, "Unidades", 2500000));
        SalidaAlmacen salida = new SalidaAlmacen("S001", "7/03/2025", "6/03/2025", jefeCorrecto, itemsEntregados);
        almacen.registroSalida(salida);
        
        
        

        // Mostramos la  Solicitud
        solicitud.mostrarSolicitud();

        // Creamos el Inventario
        Inventario inventario = new Inventario();
        
        

        // Registramos los bienes en el inventario antes de asignarles una ubicación
        inventario.agregarBien(Estanteria);
        inventario.agregarBien(sillaErgonomica);
        
        

        // Actualizar stock antes de asignar ubicación
        Estanteria.sumarStock(5);
        sillaErgonomica.sumarStock(3);
        
        

        // Mostramos la acualizacion del stock
        System.out.println("Stock actualizado de la Estanteria: " + Estanteria.getCantidad());
        System.out.println("Stock actualizado de Silla: " + sillaErgonomica.getCantidad());
        

        // Asignamos ubicación y responsable
        Estanteria.asignarUbicacion("Jose Lopez", "Oficina 301", "6/03/2025");
        sillaErgonomica.asignarUbicacion("Fernanda Alcazar", "Oficina 306", "6/03/2025");

        // Generar informe del inventario
        inventario.generarInforme();

        // Actualizar el inventario correctamente
        inventario.actualizacionInventario("UVB003", 15);
        inventario.actualizacionInventario("ELE202", -2);
        

        // Verificamos el  stock después de las actualizaciónes
        System.out.println("Stock después de actualización:");
        System.out.println("Estanteria: " + Estanteria.getCantidad());
        System.out.println("Silla: " + sillaErgonomica.getCantidad());
        
        

        // Vamos a intentar mover bienes con seguridad activada arrojar ERROR
        Estanteria.moverBien("5/03/2025", "Oficina 103", "Jose Lopez");
        sillaErgonomica.moverBien("5/03/2025", "Oficina 104", "Fernanda Alcazar");
        
        

        // Desactivamos la seguridad antes de mover los bienes
        Estanteria.desactivarSeguridad();
        sillaErgonomica.desactivarSeguridad();
        
        

        // Movemos los bienes correctamente
        Estanteria.moverBien("5/03/2025", "Oficina 105", "Jose Lopez");
        sillaErgonomica.moverBien("5/03/2025", "Oficina 106", "Fernanda Alcazar");
        
        

        // Registramos la entrada de bienes al almacén
        almacen.registrarEntrada(Estanteria, 10);
        almacen.registrarEntrada(sillaErgonomica, 5);

        // Generamos el informe final después de todas las actualizaciones
        inventario.generarInforme();
    }
}


