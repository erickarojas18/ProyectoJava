
package com.mycompany.poo;

public class persona {
    //ABTRACCION--Definimos los atributos
    
    private String cedula;
    private String nombre;
    private int edad;
    private String direccion;
    
    //metodo constructor por parametro
    public persona(String ced,String nom, int ed, String dir){
        this.cedula=ced;
        this.nombre=nom;
        this.edad=ed;
        this.direccion=dir;
        
    }
    //metodos de la clase
    public String getimprime(){
        return "Cedula = "+cedula+
                " \nNombre= "+nombre+
                 "\nEdad= "+edad+
                "\nDireccion "+direccion;
        
    }
    
    
    
    
    
    
    
    
}
