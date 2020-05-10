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
public class Pago {
    private int algodon;
    private int maiz;

    public int getAlgodon() {
        return algodon;
    }

    public void setAlgodon(int algodon) {
        this.algodon = algodon;
    }

    public int getMaiz() {
        return maiz;
    }

    public void setMaiz(int maiz) {
        this.maiz = maiz;
    }
    
    //Métodos propios de la clase
    public double calcularCostoAlgodon(){
        return algodon * 3;
    }
    
    public double calcularCostoMaiz(){
        return maiz * 5;
    }
    
    public String determinaProductoMasAlto(){
        if(calcularCostoAlgodon() > calcularCostoMaiz()){
            return "Algodón";
        }else{
            return "Maíz";
        }
    }
    
    public double determinarCostoMasAlto(){
        if(calcularCostoAlgodon() > calcularCostoMaiz()){
            return calcularCostoAlgodon();
        }else{
            return calcularCostoMaiz();
        }
    }
    
    
    
}
