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
public class ArregloEmpleados {
    private Empleado arrEmp[];
    private int indice;
    
    public ArregloEmpleados(){
        arrEmp = new Empleado[100];
        indice = 0;
    }
    
    public void adiciona(Empleado objEmp){
        arrEmp[indice] = objEmp;
        indice++;
    }
    
    public Empleado devolver(int pos){
        return arrEmp[pos];
    }
    
    public int getTamanio(){
        return indice;
    }
    
    public int buscar(int codigo){
        for (int i = 0; i < getTamanio(); i++) {
            if(codigo == arrEmp[i].getCodigo())
                return i;
        }
        return -1;
    }
    
    public void eliminar(int codigo){
        int pos = buscar(codigo);
        
        for(int i = pos; i < getTamanio()-1; i++){
            arrEmp[i] = arrEmp[i+1];
        }
        indice--;
    }
}
