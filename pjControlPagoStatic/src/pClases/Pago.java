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
    private String cargo;
    private String modalidad;
    private int horas;
    
    private static int total = 0;
    private static int tGerente = 0;
    private static int tAdministrativo = 0;
    private static int tJefe = 0;
    private static int tOperario = 0;
    
    private static int cMenos1200 = 0;
    private static int cEntre1200y2500 = 0;
    private static int cMas2500 = 0;
    
    //Constructor

    public Pago(String empleado, String cargo, String modalidad, int horas) {
        this.empleado = empleado;
        this.cargo = cargo;
        this.modalidad = modalidad;
        this.horas = horas;
        total++;
        contadorCargos();
        contadorSueldo();
    }
    
    
    
    //Métodos get y set
    public String getEmpleado() {
        return empleado;
    }

    public void setEmpleado(String empleado) {
        this.empleado = empleado;
    }

    public String getCargo() {
        return cargo;
    }

    public void setCargo(String cargo) {
        this.cargo = cargo;
    }

    public String getModalidad() {
        return modalidad;
    }

    public void setModalidad(String modalidad) {
        this.modalidad = modalidad;
    }

    public int getHoras() {
        return horas;
    }

    public void setHoras(int horas) {
        this.horas = horas;
    }

    public static int getTotal() {
        return total;
    }

    public static int gettGerente() {
        return tGerente;
    }

    public static int gettAdministrativo() {
        return tAdministrativo;
    }

    public static int gettJefe() {
        return tJefe;
    }

    public static int gettOperario() {
        return tOperario;
    }

    public static int getcMenos1200() {
        return cMenos1200;
    }

    public static int getcEntre1200y2500() {
        return cEntre1200y2500;
    }

    public static int getcMas2500() {
        return cMas2500;
    }
    
    public static void reiniciarEstaticas(){
        total = 0;
        tGerente = 0;
        tAdministrativo = 0;
        tJefe = 0;
        tOperario = 0;
    
        cMenos1200 = 0;
        cEntre1200y2500 = 0;
        cMas2500 = 0;
    }
    
    private void contadorCargos(){
        switch (cargo) {
            case "Gerente":
                tGerente++;
                break;
            case "Administrativo":
                tAdministrativo++;
                break;
            case "Jefe":
                tJefe++;
                break;
            default:
                tOperario++;
                break;
        }
    }
    
    public double asignaPagoxHora(){
        switch(cargo){
            case "Gerente":
                return 20;
            case "Administrativo":
                return 10;
            case "Jefe":
                return 8;
            default:
                return 3.5;
        
        }
    }
    
    public double calculaBruto(){
        return this.horas * asignaPagoxHora();
    }
    
    public double asignaBonificacion(double bruto){
        switch(modalidad){
            case "Tiempo completo":
                return 0.2 * bruto;
            default:
                return 0.05 * bruto;
        }
    }
    
    public double calculaSueldo(){
        return calculaBruto() + asignaBonificacion(calculaBruto());
    }
    
    private void contadorSueldo(){
        if(calculaSueldo() < 1200){
            cMenos1200++;
        }else if(calculaSueldo() <= 2500){
            cEntre1200y2500++;
        }else{
            cMas2500++;
        }
    }
    
    
    
}
