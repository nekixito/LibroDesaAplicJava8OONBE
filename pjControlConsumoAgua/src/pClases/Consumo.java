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
public class Consumo {
    private double consumo;

    public double getConsumo() {
        return consumo;
    }

    public void setConsumo(double consumo) {
        this.consumo = consumo;
    }
    
    //Métodos de la clase 
    public double calculaTotalConsumo(){
        double consumoTotal = consumo;
        if(consumo < 100){
            consumoTotal *= 0.15;
        }if(consumo >= 100 && consumo < 500){
            consumoTotal *= 0.20;
        }if(consumo >= 500 && consumo < 1000){
            consumoTotal *= 0.35;
        }if(consumo >= 1000){
            consumoTotal *= 0.80;
        }
        
        return consumoTotal;
    }
    
    public double calculaImpuesto(){
        double impuesto = 0;
        if(calculaTotalConsumo() > 600){
            impuesto = calculaTotalConsumo() * 0.025;
        }
        return impuesto;
    }
    
    public double calculaMontoNeto(){
        return calculaTotalConsumo() + calculaImpuesto();
    }
}
