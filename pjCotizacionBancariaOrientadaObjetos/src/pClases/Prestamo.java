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
public class Prestamo {
    private String moneda;
    private String bien;
    private int meses;
    private double tasaInteres;
    private double inicial;
    private double valor;

    //Setters y getters
    public String getMoneda() {
        return moneda.equals("PESOS")? "$" : "USD $";
    }

    public void setMoneda(String moneda) {
        this.moneda = moneda;
    }

    public String getBien() {
        return bien;
    }

    public void setBien(String bien) {
        this.bien = bien;
    }

    public int getMeses() {
        return meses;
    }

    public void setMeses(int meses) {
        this.meses = meses;
    }

    public double getTasaInteres() {
        return tasaInteres;
    }

    public void setTasaInteres(double tasaInteres) {
        this.tasaInteres = tasaInteres;
    }

    public double getInicial() {
        return inicial;
    }

    public void setInicial(double inicial) {
        this.inicial = inicial;
    }

    public double getValor() {
        return valor;
    }

    public void setValor(double valor) {
        this.valor = valor;
    }
    
    //Metodos calculadores
    public double calculaCuotaInicial(){
        return valor * 0.2;
    }
    
    public double calculaRiesgo(){
        return valor-calculaCuotaInicial();
    }
    
    public double calculaCuotaMensual(){
        return (calculaRiesgo() * 1.12) / meses;
    }
    
    
    
    
}
