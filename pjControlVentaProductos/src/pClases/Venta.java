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
    private String producto;
    private int cantidad;

    public String getProducto() {
        return producto;
    }

    public void setProducto(String producto) {
        this.producto = producto;
    }

    public int getCantidad() {
        return cantidad;
    }

    public void setCantidad(int cantidad) {
        this.cantidad = cantidad;
    }
    
    //Determina el precio de los productos
    public double obtenerPrecio(){
        if(producto.equals("Visual Basic 2015")){
            return 50;
        }else if (producto.equals("Java Fundamentos")){
            return 45.50;
        }else if (producto.equals("Aplicaciones Web con PHP")){
            return 55;
        }else if (producto.equals("HTML5 Y CSS3")){
            return 35.50;
        }else{
            return 0;
        }
    }
    
    //Calcula el subtotal
    public double calculaSubtotal(){
        return getCantidad() * obtenerPrecio();
    }
    
    //Calcula el descuento según la cantidad comprada
    public double calculaDescuento(){
        if(getCantidad() <= 5){
            return 0;
        } else if(getCantidad() >= 6  && getCantidad() <= 11){
            return calculaSubtotal()*0.05;
        }else if(getCantidad() >= 11  && getCantidad() <= 20){
            return calculaSubtotal()*0.10;
        }else{
            return calculaSubtotal()*0.30;
        }
    }
    
    public double calculaNeto(){
        return calculaSubtotal()-calculaDescuento();
    }
    
}
