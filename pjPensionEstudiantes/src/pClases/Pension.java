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
public class Pension {
    private String estudiante;
    private String categoria;
    private double promedio;

    public String getEstudiante() {
        return estudiante;
    }

    public void setEstudiante(String estudiante) {
        this.estudiante = estudiante;
    }

    public String getCategoria() {
        return categoria;
    }

    public void setCategoria(String categoria) {
        this.categoria = categoria;
    }

    public double getPromedio() {
        return promedio;
    }

    public void setPromedio(double promedio) {
        this.promedio = promedio;
    }
    
    //Métodos específicos de la clase
    public double calculaPensionPorCategoria(){
        double montoCategoria = 0.0;
        switch(getCategoria()){
            case "A":
                montoCategoria = 550.0;
                break;
                
            case "B":
                montoCategoria = 500.0;
                break;
            case "C":
                montoCategoria = 460.0;
                break;
            case "D":
                montoCategoria = 400.0;
                break;
            default:
                montoCategoria = 0;
        }
        return montoCategoria;
    } 
    
    public double calculaDescuento(){
        double descuento = 0.0;
        if(promedio >= 18){
            descuento = calculaPensionPorCategoria() * 0.15;
        } else if(promedio >= 16 && promedio < 18){
            descuento = calculaPensionPorCategoria() * 0.12;
        } else if(promedio >= 14 && promedio < 16){
            descuento = calculaPensionPorCategoria() * 0.15;
        } else if(promedio < 14){
            descuento = 0;
        } 
        return descuento;
    }
    
    public double calculaMontoFinal(){
        return calculaPensionPorCategoria() - calculaDescuento();
    }
}
