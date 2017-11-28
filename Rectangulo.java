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
public class Rectangulo extends Figura {
    private double altura;
    private double base;

    public Rectangulo(double altura, double base) {
        this.altura = altura;
        this.base = base;
    }

  public double area(){
       double a= (base*altura);
       
       return a; 
    }
    public double perimetro(){
        double perimetro= (2*base)+(2*altura); 
        return perimetro; 
    }
    
    
    
}
