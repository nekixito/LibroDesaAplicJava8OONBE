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
    private String empleado;
    private int horas;
    private double pagoHora;

    public Pago(String empleado, int horas, double pagoHora) {
        this.empleado = empleado;
        this.horas = horas;
        this.pagoHora = pagoHora;
    }
    
    

    public String getEmpleado() {
        return empleado;
    }

    public void setEmpleado(String empleado) {
        this.empleado = empleado;
    }

    public int getHoras() {
        return horas;
    }

    public void setHoras(int horas) {
        this.horas = horas;
    }

    public double getPagoHora() {
        return pagoHora;
    }

    public void setPagoHoras(double pagoHoras) {
        this.pagoHora = pagoHoras;
    }
    
    //Métodos propios de la aplicación
    public int determinaExtras(){
        int extras = 0;
        if(horas > 40){
            extras = horas-40;
        }
        return extras;
    }
    
    public int determinaExcesoExtras(){
        int excede = 0;
        int extras = determinaExtras();
        if(extras > 8){
            excede = extras -8;
        }
        return excede;
    }
    
    public double calculaMonto(){
        return ((horas - determinaExtras())*pagoHora) + ((determinaExtras()-determinaExcesoExtras())*pagoHora*2)
                + (determinaExcesoExtras()*pagoHora*3);
    }
    
    
    
}
