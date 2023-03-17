
package com.mycompany.figuras_geometricas;

public class trianguloRectangulo {
    int num1,num2;
    double area, perimetro;
    
    public trianguloRectangulo(){
    }
    public double area(int base, int altura){
        this.num1 = base;
        this.num2 = altura;
        
        this.area = (num1*num2)/2;
        return area;
    }
    public double perimetro(int base, int altura){
        this.num1 = base;
        this.num2 = altura;
        
        this.perimetro = num1 + num2 + CalcularHipotenusa(num1,num2);
        return perimetro;
    }
    public double CalcularHipotenusa(int base, int altura){
        this.num1 = base;
        this.num2= altura;
        
        return Math.pow((num1 * num1 + num2*num2),0.5);
    }
    public void determinarTipoTriandulo(int base, int altura){
        this.num1 = base;
        this.num2 = altura;
        
        if (num1 == num2 && num1 == CalcularHipotenusa(num1, num2) && num2 == CalcularHipotenusa(num1, num2)){
            System.out.println("Es un triángulo equilátero");
        }else if(num1 != num2 && num1 != CalcularHipotenusa(num1, num2) && num2 != CalcularHipotenusa(num1, num2)){
            System.out.println("Es un triángulo escaleno");
        }else{
            System.out.println("Es un triángulo isósceles");
        }
    }
}
