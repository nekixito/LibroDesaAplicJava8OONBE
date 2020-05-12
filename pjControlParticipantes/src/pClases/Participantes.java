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
public class Participantes {
    private int edad;
    private String sexo;
    private String estadoCivil;
    
    private static int total = 0;
    private static int tHombres = 0;
    private static int tMujeres = 0;
    private static int tMayores = 0;
    private static int tMenores = 0;
    private static int tSolteros = 0;
    private static int tCasados = 0;
    private static int tViudos = 0;
    private static int tDivorciados;
    
    public Participantes(){
        total++;
    }

    public int getEdad() {
        return edad;
    }

    public void setEdad(int edad) {
        this.edad = edad;
    }

    public String getSexo() {
        return sexo;
    }

    public void setSexo(String sexo) {
        this.sexo = sexo;
    }

    public String getEstadoCivil() {
        return estadoCivil;
    }

    public void setEstadoCivil(String estadoCivil) {
        this.estadoCivil = estadoCivil;
    }

    public static int getTotal() {
        return total;
    }

    public static int gettHombres() {
        return tHombres;
    }

    public static int gettMujeres() {
        return tMujeres;
    }

    public static int gettMayores() {
        return tMayores;
    }

    public static int gettMenores() {
        return tMenores;
    }

    public static int gettSolteros() {
        return tSolteros;
    }

    public static int gettCasados() {
        return tCasados;
    }

    public static int gettViudos() {
        return tViudos;
    }

    public static int gettDivorciados() {
        return tDivorciados;
    }
    
    //Métodos propios
    public void determinaSexo(){
        if(sexo.equals("Masculino")){
            tHombres++;
        }else{
            tMujeres++;
        }
    }
    
    public void determinaEdad(){
        if(edad >= 18){
            tMayores++;
        }else{
            tMenores++;
        }
    }
    
    public void determinaEstado(){
        if(estadoCivil.equals("Soltero")){
            tSolteros++;
        } else if(estadoCivil.equals("Casado")){
            tCasados++;
        } else if(estadoCivil.equals("Viudo")){
            tViudos++;
        } else {
            tDivorciados++;
        }
    
    }
    
    
}
