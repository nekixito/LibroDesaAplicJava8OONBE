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
public class ArregloFacturas {
    private ArrayList<Factura> fact;
    private int indice;
    
    public ArregloFacturas(){
        fact = new ArrayList<Factura>();
    }
    public int getTamanio(){
        return fact.size();
    }
    
    public void agregar(Factura f){
        fact.add(f);
    }
    
    public Factura obtener(int pos){
        return fact.get(pos);
    }
    
    public Factura buscar(int num){
        for(Factura f: fact)
            if(f.getnFactura() == num)
                return f;
        return null;
    }
    
    public void eliminar(Factura x){
        fact.remove(x);
    }
}
