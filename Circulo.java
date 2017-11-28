/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Area_Perimetro;

/**
 *
 * @author USER
 */
public class Circulo extends Figura{
    private double radio;

    public Circulo(double radio) {
        this.radio = radio;
    }
    
    

    public double getRadio() {
        return radio;
    }

    public void setRadio(double radio) {
        this.radio = radio;
    }
    
    
    public double area(){
        double area =Math.PI*(Math.pow(radio, 2)); 
        return area;
    }
    
    
     public double perimetro(){
        double perimetro= ((Math.PI)*2)*radio; 
        return perimetro; 
    }
    
    
    
}
