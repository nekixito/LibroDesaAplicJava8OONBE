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
public class Casa {
    private double soles;
    private double dolares;
    private double marcos;
    
    
    
    
    

    public double getSoles() {
        return soles;
    }

    public void setSoles(double soles) {
        this.soles = soles;
    }

    public double getDolares() {
        return dolares;
    }

    public void setDolares(double dolares) {
        this.dolares = dolares;
    }

    public double getMarcos() {
        return marcos;
    }

    public void setMarcos(double marcos) {
        this.marcos = marcos;
    }
    
    public double calculaMontoEuros(){
        return (getSoles()/3.51 + getMarcos()/2.12 + getDolares()) * 1.09;
    }
    
}
