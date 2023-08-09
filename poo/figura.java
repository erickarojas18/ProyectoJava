
package com.mycompany.poo;

public class figura {
    //Definicion de atributos
    private double base;
    private double altura;
    private double area;
    
    //metodo constructor solo recibe 2 parametros
    public figura(double b, double a){
    this.base=b;
    this.altura=a;
    this.area=0.0;
    }
    
    //metodos de clase
    private double calcula(){
        return this.area=(base*altura)/2;
    }
    
    public String getImprime(){
        this.area=calcula();
        return "Informacion de la figura"+"\nBase= "+base+
                "\nAltura = "+altura+"\nArea ="+area;
    }
}
