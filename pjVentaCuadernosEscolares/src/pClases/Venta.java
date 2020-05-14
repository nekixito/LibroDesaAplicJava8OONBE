/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pClases;

/**
 *
 * @author Multi
 */
public class Venta {
    //Atributos
    private int codigo;
    private String descripcion;
    private int cantidad;

    public int getCodigo() {
        return codigo;
    }

    public void setCodigo(int codigo) {
        this.codigo = codigo;
    }

    public String getDescripcion() {
        return descripcion;
    }

    public void setDescripcion(String descripcion) {
        this.descripcion = descripcion;
    }

    public int getCantidad() {
        return cantidad;
    }

    public void setCantidad(int cantidad) {
        this.cantidad = cantidad;
    }
    
    //Métodos propios
    public double asignaPrecio(){
        switch(codigo){
            case 0:
                return 1.5;
            case 1:
                return 1.9;
            case 2:
                return 3.5;
            case 3:
                return 2.5;
            case 4:
                return 3.0;
            default:
                return 4.5;
        }
    }
    
    public double calculaSubtotal(){
        return asignaPrecio() * cantidad;
    }
    
}
