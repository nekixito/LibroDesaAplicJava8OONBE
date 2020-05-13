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
public class Alquiler {
    private String habitacion;
    private int dias;
    private int personas;

    //Atributos estáticos
    private static int total;
    private static int tSimple;
    private static int tDoble;
    private static int tMatrimonial;
    private static int pSimple;
    private static int pDoble;
    private static int pMatrimonial;
    private static int mSimple;
    private static int mDoble;
    private static int mMatrimonial;

    
    public Alquiler(){
        total++;
    }
    
    public String getHabitacion() {
        return habitacion;
    }

    public void setHabitacion(String habitacion) {
        this.habitacion = habitacion;
    }

    public int getDias() {
        return dias;
    }

    public void setDias(int dias) {
        this.dias = dias;
    }

    public static int getmDoble() {
        return mDoble;
    }
    
    public void setPersonas(int personas){
        this.personas = personas;
    }
    
    public int getPersonas() {
        return personas;
    }

    public static void setmDoble(int mDoble) {
        Alquiler.mDoble = mDoble;
    }

    
    

    public static int getTotal() {
        return total;
    }

    public static int gettSimple() {
        return tSimple;
    }

    public static int gettDoble() {
        return tDoble;
    }

    public static int gettMatrimonial() {
        return tMatrimonial;
    }

    public static int getpSimple() {
        return pSimple;
    }

    public static int getpDoble() {
        return pDoble;
    }
    
    public static int getpMatrimonial() {
        return pMatrimonial;
    }

    public static int getmSimple() {
        return mSimple;
    }

    public static int getmMatrimonial() {
        return mMatrimonial;
    }
    
    //Métodos propios de la aplicación
    
    public double asignaCosto(){
        switch(habitacion){
            case "Simple":
                return 20;
            case "Doble":
                return 40;
            default:
                return 100;
        }
    }
    
    public double calculaMonto(){
        return dias * asignaCosto();
    }
    
    public void conteos(){
        switch(habitacion){
            case "Simple":
                tSimple++;
                pSimple+=personas;
                mSimple+=calculaMonto();
                break;
            case "Doble":
                tDoble++;
                pDoble+=personas;
                mDoble+=calculaMonto();
                break;
            default:
                tMatrimonial++;
                pMatrimonial+=personas;
                mMatrimonial+=calculaMonto();
        }
    
    }
    
    
}
