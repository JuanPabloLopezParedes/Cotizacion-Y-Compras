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

public class EntradaAlmacen {
    private String fecha;
    private String numeroDeEntrada;
    private String proveedor;
    private List<ItemSolicitud> itemsRecibidos;
    private double valorTotal;
    
    public EntradaAlmacen(String fecha, String numeroEntrada, String proovedor, List <ItemSolicitud> itemsrecibidos){
        this.fecha = fecha;
        this.numeroDeEntrada = numeroEntrada;
        this.proveedor = proovedor;
        this.itemsRecibidos = itemsrecibidos;
        this.valorTotal = calcularValorTotal();
    }
    
    public String getNumeroEntrada() {
        return numeroDeEntrada;
    }

    public String getFecha() {
        return fecha;
    }

    public String getProveedor() {
        return proveedor;
    }

    public List<ItemSolicitud> getItemsRecibidos() {
        return itemsRecibidos;
    }

    public double getValorTotal() {
        return valorTotal;
    }

    private double calcularValorTotal() {
        double total = 0;
        for (ItemSolicitud item : itemsRecibidos) {
            total += item.calcularTotal();
        }
        return total;
    }

    public void registrarEntrada() {
        System.out.println("Entrada registrada: " + numeroDeEntrada + " - Proveedor: " + proveedor);
        for (ItemSolicitud item : itemsRecibidos) {
            System.out.println("- " + item.getBien().getNombre() + " - " + item.getCantidad() + " unidades.");
            item.getBien().sumarStock(item.getCantidad());
        }
        System.out.println("Valor total de la entrada: $" + valorTotal);
    }
    
}
