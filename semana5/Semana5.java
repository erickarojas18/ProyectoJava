
package com.mycompany.semana5;
import java.util.Scanner;
import java.util.Stack;
public class Semana5 {
    //ejemplo pilas
    
    public static Scanner leer = new Scanner(System.in);
    public static void main(String[] args) {
     //DENIFIR LA ESTRUCTURA PILA
     
     Stack<String> pila= new Stack<String>();
     pila=llenar2(pila);
        System.out.println(pila);
        System.out.println("invocando el metodo por segunda vez...");
        pila= llenar2(pila);
        System.out.println(pila);
       // mostrar(pila);
       //System.out.println(pila);
        //pila= extraer(pila);
       // System.out.println(pila);
    }
    //metodos
    static String pideValor( String mensaje){
        String palabra = "";
        System.out.println(mensaje);
        return palabra = leer.nextLine();
    }
    static Stack<String>llenar(Stack<String> p){
        String pal="";
        System.out.println("Indique la cantidad de valores a guardar...");
        int cant=leer.nextInt();
        leer.nextLine();
        for(int i =0; i<cant;i++){
            pal =pideValor("Digite una palabra...");
            p.push(pal);
        }
        
        return p;
    }
    static void mostrar (Stack<String> p){
        System.out.println("ESTE METODO MUESTRA EL CONTENIDO SIN EXTRAER LOS VALORES ");
        String valor= p.peek();
        System.out.println(" El valor es "+valor);
        
    }
     static Stack<String> extraer(Stack<String> p){
        System.out.println("ESTE METODO MUESTRA EL CONTENIDO EXTRAYRNDO LOS VALORES ");
        String valor= p.pop();
        System.out.println(" El valor es "+valor);
        return p;
     }
    static Stack<String>llenar2(Stack<String> p){
        String pal="";
        System.out.println("Indique la cantidad de valores a guardar...");
        int cant=leer.nextInt();
        leer.nextLine();
        if (p.empty()){
            System.out.println("PILA VACIA...llenando pila");
            for(int i =0; i<cant;i++){
             pal =pideValor("Digite una palabra...");
             p.push(pal);
             
            }
        }else{
            pal=pideValor("Digite la nueva palabra..");
            p.push(pal);
        }
            
        return p;
    }
}
