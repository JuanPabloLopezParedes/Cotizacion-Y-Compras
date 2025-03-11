/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Educando;

/**
 *
 * @author juanp
 */
public class CentroCosto {
    
    private String codigo;
    private String nombre;
    
      // Constructor
    public CentroCosto(String codigo, String nombre) {
        this.codigo = codigo;
        this.nombre = nombre;
    }

    // Métodos getters y setters
    public String getCodigo() {
        return codigo;
    }

    public void setCodigo(String codigo) {
        this.codigo = codigo;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    @Override
    public String toString() {
        return "CentroCosto [codigo=" + codigo + ", nombre=" + nombre + "]";
    }
    
}
