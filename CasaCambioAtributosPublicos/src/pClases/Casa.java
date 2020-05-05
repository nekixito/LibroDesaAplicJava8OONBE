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
    public double soles;
    public double dolares;
    public double marcos;
    
    public double calculaMontoEuros(){
        return (soles/3.51 + marcos/2.12 + dolares) * 1.09;
    }
    
}
