
package com.mycompany.figuras_geometricas;


public class pruebaFiguras {
    public static void main(String args[]) {
        circulo figura1 = new circulo();
        rectangulo figura2 = new rectangulo();
        cuadrado figura3 = new cuadrado();
        trianguloRectangulo figura4 = new trianguloRectangulo();
        
        System.out.println("El área del círculo es = " + figura1.setArea(2));
        System.out.println("El perímetro del círculo es = " + figura1.setPerimetro(2));
        System.out.println();
        
        System.out.println("El área del rectángulo es = " + figura2.area(1, 2));
        System.out.println("El perímetro del rectángulo es = " + figura2.perimetro(1, 2));
        System.out.println();
        
        System.out.println("El área del cuadrado es = " + figura3.area(3));
        System.out.println("El perímetro del cuadrado es = " + figura3.perimetro(3));
        System.out.println();
        
        System.out.println("El área del triángulo es = " + figura4.area(3, 5));
        System.out.println("El perímetro del triángulo es = " + figura4.perimetro(3, 5));
        figura4.determinarTipoTriandulo(3, 5);
} 
}
