/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pClases;

import java.util.ArrayList;

/**
 *
 * @author Multi
 */
public class ArregloProducto {
    
    public interface Operacion{
        int determinar();
    }
    
    ArrayList<Producto> prod;
    
    public ArregloProducto(){
        prod = new ArrayList<Producto>();
    }
    
    public Operacion totalProductos = () -> prod.size();
    
    public void agregaProducto(Producto objP){
        prod.add(objP);
    }
    
    public Producto obtener(int pos){
        return prod.get(pos);
    }
    
    public Producto buscarProducto(int cod){
        for(Producto p: prod){
            if(p.getCodigo() == cod)
                return p;
        }
        return null;
    }
    
    public void eliminarProducto(Producto objP){
        prod.remove(objP);
    }
}
