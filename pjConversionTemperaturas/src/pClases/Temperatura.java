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
public class Temperatura {
    private double celsius;

    public double getCelsius() {
        return celsius;
    }

    public void setCelsius(double celsius) {
        this.celsius = celsius;
    }
    
    public double determinaFarenheit(){
        return (9*celsius)/5 + 32;
    }
    
    public double determinaRankine(){
        return celsius + 460;
    }
    
    public double determinaKelvin(){
            return determinaRankine()-187;
    }
}
