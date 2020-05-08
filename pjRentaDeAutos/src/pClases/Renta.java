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
public class Renta {
    private String tipo;
    private int dias;
    private double kilometros;

    public String getTipo() {
        return tipo;
    }

    public void setTipo(String tipo) {
        this.tipo = tipo;
    }

    public int getDias() {
        return dias;
    }

    public void setDias(int dias) {
        this.dias = dias;
    }

    public double getKilometros() {
        return kilometros;
    }

    public void setKilometros(double kilometros) {
        this.kilometros = kilometros;
    }

    
    
    
    
    //Metodos propios de la aplicación
    public double determinaTarifa(){
        double tarifa = 0.0;
        if(tipo.equals("Pequeño")){
            tarifa = 15;
        }else if(tipo.equals("Mediano")){
            tarifa = 20;
        }else if(tipo.equals("Grande")){
            tarifa = 30;
        }else{
            tarifa = 0;
        }
        return tarifa;    
    }
    
    public double calculaCostoKilometros(){
        if(tipo.equals("Pequeño")){
            return 0.2 * kilometros;
        }else if(tipo.equals("Mediano")){
            return 0.3 * kilometros;
        }else if(tipo.equals("Grande")){
            return 0.4 * kilometros;
        }else{
            return 0;
        }
    }
    
    public double calculaMonto(){
        double monto = (determinaTarifa()*dias) + calculaCostoKilometros();
        double aumento = 0;
        if(kilometros > 10){
            aumento = monto * (25/100.0);
        }
        
        monto = monto + aumento;
        
        return monto;
    }
    
    
    

    
}
