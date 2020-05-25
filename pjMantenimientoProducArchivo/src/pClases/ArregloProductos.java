/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pClases;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.PrintWriter;
import java.util.ArrayList;
import java.util.StringTokenizer;
import javax.swing.JOptionPane;

/**
 *
 * @author Multi
 */
public class ArregloProductos {
    private ArrayList<Producto> arrProd;
    
    public ArregloProductos(){
        arrProd = new ArrayList<Producto>();
        cargar();
    }
    
    public void adicionar(Producto p){
        arrProd.add(p);
    }
    
    public Producto obtener(int pos){
        return arrProd.get(pos);
    }
    
    public Producto buscar(String cod){
        for (int i = 0; i < arrProd.size(); i++) {
            if(cod.equals(arrProd.get(i).getCodigo())){
                return arrProd.get(i);
            }
        }
        return null;
    }
    
    public int getTamanio(){
        return arrProd.size();
    }
    
    public void eliminar(Producto e){
        arrProd.remove(e);
    }
    
    public void cargar(){
        try {
            File archivo = new File("Productos.txt");
            if(archivo.exists()){
                BufferedReader br = new BufferedReader(new FileReader("Productos.txt"));
                String linea;
                while((linea = br.readLine()) != null){
                    StringTokenizer st = new StringTokenizer(linea,",");
                    String codigo = st.nextToken().trim();
                    String descripcion = st.nextToken().trim();
                    String categoria = st.nextToken().trim();
                    int stock = Integer.parseInt(st.nextToken().trim());
                    double precio = Double.parseDouble(st.nextToken().trim());
                    
                    Producto p = new Producto(codigo,descripcion,categoria,stock,precio);
                    adicionar(p);
                }
                br.close();
            }else{
                JOptionPane.showMessageDialog(null, "El archivo de texto no existe");
            }
        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, "Se produjo un error: " + e);
        }
    }
    
    public void grabar(){
        try {
            PrintWriter pw = new PrintWriter(new FileWriter("Productos.txt"));
            for (int i = 0; i < getTamanio(); i++) {
                pw.println(obtener(i).getCodigo() + "," + obtener(i).getDescripcion()+ ","
                            + obtener(i).getCategoria()+ "," +obtener(i).getStock() 
                            + "," +obtener(i).getPrecio());
            }
            
            pw.close();
            JOptionPane.showMessageDialog(null, "Grabación correcta");
        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, "Se produjo un error: " + e,"Aviso",JOptionPane.ERROR_MESSAGE);
        }
    
    }
    
    
    
}
