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
    
    public void asignaSoles(double s){
        soles = s;
    }
    
    public void asignaDolares(double d){
        dolares = d;
    }
    
    public void asignaMarcos(double m){
        marcos = m;
    }
    
    
    public double calculaMontoEuros(){
        return (soles/3.51 + marcos/2.12 + dolares) * 1.09;
    }
    
}
