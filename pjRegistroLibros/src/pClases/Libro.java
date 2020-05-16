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
public class Libro {
    private String nombre;
    private String editorial;
    private String clase;
    private int anio;
    private int paginas;
    private double costo;
    
    private static int tAnalisisB;
    private static String edicionMasReciente = "";
    private static int anioMasReciente = 0;
    private static String editorialMenorPaginas = "";
    private static int menorNumeroPaginas = 0;
    private static String libroMayorCosto = "";
    private static double mayorCosto = 0.0;
   

    //Constructor
    public Libro(String nombre, String editorial, String clase, int anio, int paginas, double costo) {
        this.nombre = nombre;
        this.editorial = editorial;
        this.clase = clase;
        this.anio = anio;
        this.paginas = paginas;
        this.costo = costo;
        
        conteos();
    }
    
    //Getters y Setters

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getEditorial() {
        return editorial;
    }

    public void setEditorial(String editorial) {
        this.editorial = editorial;
    }

    public String getClase() {
        return clase;
    }

    public void setClase(String clase) {
        this.clase = clase;
    }

    public int getAnio() {
        return anio;
    }

    public void setAño(int año) {
        this.anio = año;
    }

    public int getPaginas() {
        return paginas;
    }

    public void setPaginas(int paginas) {
        this.paginas = paginas;
    }

    public double getCosto() {
        return costo;
    }

    public void setCosto(double costo) {
        this.costo = costo;
    }
    
    public static void limpiarEstaticos(){
        tAnalisisB = 0;
        edicionMasReciente = "";
        anioMasReciente = 0;
        editorialMenorPaginas = "";
        menorNumeroPaginas = 0;
        libroMayorCosto = "";
        mayorCosto = 0.0;
    
    }

    public static int gettAnalisisB() {
        return tAnalisisB;
    }

    public static String getEdicionMasReciente() {
        if(edicionMasReciente.equals("")){
            edicionMasReciente = "No hay edición mas reciente";
        }
        
        return edicionMasReciente;
    }

    public static int getAnioMasReciente() {
        
        return anioMasReciente;
    }

    public static String getEditorialMenorPaginas() {
        if(editorialMenorPaginas.equals("")){
            editorialMenorPaginas = "No hay editorial";
        }
        return editorialMenorPaginas;
    }

    public static int getMenorNumeroPaginas() {
        return menorNumeroPaginas;
    }

    public static String getLibroMayorCosto() {
        if(libroMayorCosto.equals("")){
            libroMayorCosto = "No hay libro";
        }
        return libroMayorCosto;
    }

    public static double getMayorCosto() {
        return mayorCosto;
    }
    
    
    
    
    
    void conteos(){
        if (getClase().equals("Análisis") && getEditorial().equals("B")){
            tAnalisisB++;
        }
    }
    
    public void masReciente(){
        if(!(edicionMasReciente.equals(""))){
            if( this.getAnio() > anioMasReciente){
                anioMasReciente = this.getAnio();
                edicionMasReciente = this.getNombre();
            }
        }else{
            anioMasReciente = this.getAnio();
            edicionMasReciente = this.getNombre();
        }
    }
        
    public void menorPaginas(){
        if(!(editorialMenorPaginas.equals(""))){
            if( this.getPaginas()< menorNumeroPaginas){
                menorNumeroPaginas = this.getPaginas();
                editorialMenorPaginas = this.getEditorial();
            }
        }else{
            menorNumeroPaginas = this.getPaginas();
            editorialMenorPaginas = this.getEditorial();
        }
    }
    
    public void mayorCosto(){
        if(!(this.getNombre().equals(""))){
            if( this.getCosto()> mayorCosto){
                mayorCosto = this.getCosto();
                libroMayorCosto = this.getNombre();
            }
        }else{
            mayorCosto = this.getCosto();
            libroMayorCosto = this.getNombre();
        }
    }
    
    
}
