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
public class ArregloEstudiantes {
    private ArrayList<Estudiante> arrEst;
    
    public ArregloEstudiantes(){
        arrEst = new ArrayList<Estudiante>();
        cargar();
    }
    
    public void adicionar(Estudiante e){
        arrEst.add(e);
    }
    
    public Estudiante obtener(int pos){
        return arrEst.get(pos);
    }
    
    public Estudiante buscar(int cod){
        for (int i = 0; i < arrEst.size(); i++) {
            if(cod == arrEst.get(i).getCodigo()){
                return arrEst.get(i);
            }
        }
        return null;
    }
    
    public int getTamanio(){
        return arrEst.size();
    }
    
    public void eliminar(Estudiante e){
        arrEst.remove(e);
    }
    
    public void cargar(){
        try {
            File archivo = new File("Estudiantes.txt");
            if(archivo.exists()){
                BufferedReader br = new BufferedReader(new FileReader("Estudiantes.txt"));
                String linea;
                while((linea = br.readLine()) != null){
                    StringTokenizer st = new StringTokenizer(linea,",");
                    int cod = Integer.parseInt(st.nextToken().trim());
                    String nom = st.nextToken().trim();
                    int cic = Integer.parseInt(st.nextToken().trim());
                    double pen = Double.parseDouble(st.nextToken().trim());
                    
                    Estudiante x = new Estudiante(cod,nom,cic,pen);
                    adicionar(x);
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
            PrintWriter pw = new PrintWriter(new FileWriter("Estudiantes.txt"));
            for (int i = 0; i < getTamanio(); i++) {
                pw.println(obtener(i).getCodigo() + "," + obtener(i).getNombre() + ","
                            + obtener(i).getCiclo() + "," +obtener(i).getPension() );
            }
            
            pw.close();
            JOptionPane.showMessageDialog(null, "Grabación exitosa");
        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, "Se produjo un error: " + e,"Aviso",JOptionPane.ERROR_MESSAGE);
        }
    
    }
    
}
