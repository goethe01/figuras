
package com.mycompany.figuras_geometricas;

public class cuadrado {
    int num1;
    double area, perimetro;
    public cuadrado(){
    }
    public double area(int lado){
        this.num1 = lado;
        
        this.area = num1*num1;
        return area;
    }
    public double perimetro(int lado){
        this.num1 = lado;
        
        this.perimetro = 4*num1;
        return perimetro;
    }
}
