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
public class arregloNumeros {
    
    //Atrubutos
    private int a[];
    
    //Método constructor
    public arregloNumeros(){
        a = new int[6];
        a[0] = 10;
        a[1] = 20;
        a[2] = 70;
        a[3] = 30;
        a[4] = 80;
        a[5] = 15;
    }
    
    public int tamanio(){
        return a.length;
    }
    
    public void ordenaAscendente(){
        int temp;
        for(int i = 0; i < tamanio(); i++){
            for(int j = 0; j < tamanio(); j++){
                if(a[i] < a[j]){
                    temp = a[i];
                    a[i]=a[j];
                    a[j] = temp;
                }
            }
        }
    }
    
    public int determinaMayor(){
        int mayor = Integer.MIN_VALUE;
        for(int i = 0; i < tamanio(); i++){
            if(a[i] > mayor){
                mayor = a[i];
            }
        }
        return mayor;
    }
    
    public double calcularPromedio(int suma){
        return (suma*1.0 / a.length);
    }
    
    public int calculaSuma(){
        int s = 0;
        for(int i=0;i < a.length; i++){
            s+=a[i];
        }
        return s;
    }
    
    public int devuelveValor(int pos){
        return a[pos];
    }
    
    
}
