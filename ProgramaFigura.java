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
public class ProgramaFigura {
    public static void main(String[] args) {
        double base =10.5;
        double altura= 6.7;
        Triangulo t=  new Triangulo(altura, base);
        
        double a = t.area();
        System.out.println("El area es:"+ a);
        
        
        double radio1= 5.25;
        Circulo c1= new Circulo(radio1);
        double cir = c1.area();
        System.out.println("El area es:"+ cir);
        
        double radio2=7.38;
        Circulo c2 =  new Circulo(radio2);
        double ci= c2.area();
        System.out.println("El area es:"+ci);
        
        double altura2 =4.32;
        double base2= 13.27;
        Rectangulo re= new Rectangulo(altura2,base2);
        double ar = re.area();
        System.out.println("El area es:"+ar);
        
        
        double aux= cir+ci+ar;
        System.out.println("La suma total es:"+aux);
        
        
        
        
    }
    
}
