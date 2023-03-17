
package com.mycompany.figuras_geometricas;

public class circulo {
    int num1;
    double area, perimetro;
    
    public circulo(){
    }
    public double setArea(int radio){
        this.num1 = radio;
        this.area = (Math.PI * (Math.pow(num1,2)));
        return area;
    }
    public double setPerimetro(int radio){
        this.num1 = radio;
        this.perimetro = 2*Math.PI*num1;
        return perimetro;
    }
}
