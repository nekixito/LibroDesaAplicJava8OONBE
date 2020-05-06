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
public class Medidas {
    private double pulgadas;

    public double getPulgadas() {
        return pulgadas;
    }

    public void setPulgadas(double pulgadas) {
        this.pulgadas = pulgadas;
    }
    
    public double determinaPies(){
        return pulgadas/12;
    }
    
    public double determinaYardas(){
        return determinaPies()*3;
    }
    
    public double determinaCentimetros(){
        return pulgadas*2.54;
    }
    
    public double determinaMetros(){
        return determinaCentimetros()/100;
    }
}
