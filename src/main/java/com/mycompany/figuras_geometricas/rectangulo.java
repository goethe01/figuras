
package com.mycompany.figuras_geometricas;

public class rectangulo {
    int num1,num2;
    double area, perimetro;
    
    public rectangulo(){
    }
    public double area(int base, int altura){
        this.num1 = base;
        this.num2 = altura;
        
        this.area = num1*num2;
        return area;
    }
    public double perimetro(int base, int altura){
        this.num1 = base;
        this.num2 = altura;
        
        this.perimetro = (2*num1)+(2*num2);
        return perimetro;
    }
}
