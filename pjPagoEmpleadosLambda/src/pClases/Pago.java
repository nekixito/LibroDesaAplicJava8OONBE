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
    
    public interface OperacionesCadena{
        double calcular(String cadena);
    }
    
    public interface OperacionesParametro{
        double calcular(double decimal);
    }
    
    public interface OperacionesDosParametros{
        double calcular(double decimal1, double decimal2);
    }
    
    //Método que calcula el costo por hora
    public OperacionesCadena calculaCosto = (categoria) -> {
        if(categoria.equals("Jefe")){
            return 50;
        } else if(categoria.equals("Administrativo")){
            return 30;
        }else if(categoria.equals("Operario")){
            return 20;
        }else {
            return 10;
        }
    };
    
    //Método que calcula el salario
    public OperacionesDosParametros calculaSalario = (horas, costo) -> horas*costo;
    
    //Método que calcula el descuento
    public OperacionesParametro calculaDescuento = (salario) -> {
        if(salario <= 750){
            return 0.07*salario;
        } else if(salario > 750 && salario <=1250){
            return 0.12*salario;
        } else if(salario > 1250 && salario <= 2500){
            return 0.15*salario;
        } else {
            return 0.17*salario;
        } 
    };
    
    //Metodo que calcula el neto
    public OperacionesDosParametros calculaNeto = (salario, descuento) -> salario - descuento;
    
    
}
