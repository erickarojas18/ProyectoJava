
package com.mycompany.poo;
import java.util.Scanner;
import java.util.ArrayList;
        
public class principal {

    public static Scanner leer = new Scanner(System.in);
    public static ArrayList<mascota>arreglo=new ArrayList();
    
    public static void main(String[] args) {
        //CREAR OBJETO---INSTANCIAR UN OBJETO
        persona objetoPersona = new persona("203690511","Maria",26,"Pital");
        persona objetoPersona1 = new persona("50883421","Carlos ",62,"Grecia");
        figura  triangulo  = new figura(24,23);
        
         
       /* System.out.println("objeto 1 ");
        System.out.println(objetoPersona.getimprime());
        System.out.println("Objeto 2 ");
        System.out.println(objetoPersona1.getimprime());
        System.out.println("Objeto 3 ");
        System.out.println( triangulo.getImprime());*/
                
          
       /*mascota objMascota = new mascota("Perro", "Firulais",16);
        System.out.println("Que tipo de mascota tienes? ");
        System.out.println("Mi mascota es un "+objMascota.getTipo());
        System.out.println("Como se llama tu mascota ");
        System.out.println("Mi mascota se llama "+objMascota.getNombre());
        System.out.println(objMascota.imprimeMascota());*/
       
      //LLENAR EL ARREGLO
        System.out.println("Digite la cantidad a agregar....");
        int cant=leer.nextInt();
        while (cant >0){
            agregar();
            cant--;
        }
        int ob=1;
        for ( int i=0; i<arreglo.size();i++){
            System.out.println("Imprimiendo objeto "+ob);
            System.out.println(arreglo.get(i).imprimeMascota());
            ob++;
        }
        
    }
    public static void agregar(){
        mascota objetoMascota2= new mascota();
        System.out.println("Indique le tipo de mascota ");
        objetoMascota2.setTipo(leer.next());
        System.out.println("Indique el nombre de la mascota ");
        objetoMascota2.setNombre(leer.next());
        System.out.println("Indique la edad en meses ");
        objetoMascota2.setEdad(leer.nextInt());
        //agregar el valor al array list
        arreglo.add(objetoMascota2);
    }
    
}
