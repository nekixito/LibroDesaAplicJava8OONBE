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
public class ArregloBiNumeros {
    private int filas, columnas;
    private int n[][];
    
    public ArregloBiNumeros(int filas, int columnas){
        this.filas = filas;
        this.columnas = columnas;
        n = new int[filas][columnas];
        generar();
    }

    public int getFilas() {
        return filas;
    }

    public int getColumnas() {
        return columnas;
    }
    
    public int obtener(int posF,int posC){
        return n[posF][posC];
    }
    
    private void generar(){
        for (int i = 0; i < filas; i++) {
            for(int j=0; j < columnas; j++){
                n[i][j] = (int)((99-10+1)*Math.random()+10);
            }
        }
    }
    
    public int sumaFila(int fil){
        int sum = 0;
        int i = fil - 1;
        for(int j = 0; j < columnas; j++)
            sum += n[i][j];
        return sum;
    }
    
    public int sumaColumna(int col){
        int sum = 0;
        int j = col - 1;
        for(int i = 0; i < filas; i++)
            sum += n[i][j];
        return sum;
    }
    
}
