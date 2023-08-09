
package com.mycompany.poo;

public class mascota {
    //atributos
    private String tipo;
    private String nombre;
    private int edad;
    
    //CONSTRUCTOR SOBRE CARGADO(tiene mas de 1)
    mascota(){
        this.tipo="";
        this.nombre="";
        this.edad=0;
    }
     mascota(String tipo,String nom, int ed){
        this.tipo=tipo;
        this.nombre=nom;
        this.edad=ed;
    }
     //metodos de la clase
     //Getter(optiene el valor) y Setter (no devuelve nada pero actualiza la variable)

    public String getTipo() {
        return tipo;
    }

    public void setTipo(String tipo) {
        this.tipo = tipo;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public int getEdad() {
        return edad;
    }

    public void setEdad(int edad) {
        this.edad = edad;
    }
     //Metodos personalizados
    private double calculaEdad(){
        double nuevaEdad=this.edad/12;
        return nuevaEdad;
    }
    protected String imprimeMascota(){
        double nuevaEdad=calculaEdad();
        if (nuevaEdad<1){
            nuevaEdad=0;
            
        }
        return " Tipo de mascota = "+tipo+
                "\nNombre mascota = "+nombre+
                "\nEdad en meses = "+edad+
                "\nEdad en años = "+nuevaEdad;
            
        
    }
    
}
