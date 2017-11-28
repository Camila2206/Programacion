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
public class Triangulo extends Figura{
    private double altura;
    private double base;
    private double lado1;
    private double lado2; 

    public Triangulo(double altura, double base, double lado1, double lado2) {
        this.altura = altura;
        this.base = base;
        this.lado1 = lado1;
        this.lado2 = lado2;
        System.out.println("Construyendo Triangulo");
    }

    public Triangulo(double altura, double base) {
        this.altura = altura;
        this.base = base;
    }
    
    

    public double getAltura() {
        return altura;
    }

    public void setAltura(double altura) {
        this.altura = altura;
    }

    public double getBase() {
        return base;
    }

    public void setBase(double base) {
        this.base = base;
    }
    
    
    public double area(){
       double a= (base*altura)/2;
       
       return a; 
    }
    public double perimetro(){
        double perimetro= lado1+lado2+base; 
        return perimetro; 
    }
    
    
    
    
}
