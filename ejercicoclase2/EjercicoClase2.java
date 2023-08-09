/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.ejercicoclase2;

import java.util.*;
public class EjercicoClase2 {

    public static Scanner leer= new Scanner(System.in);
    public static void main(String[] args) {
        int opc=menu();
        switch (opc){
            case 1:{
                simple();
                break;
            }//fin case1
            case 2:{
                 anidado();
                 break;
            }//fin case2
            case 3:{
                String cat=categoria();
                System.out.println("El estado del estudiante es: "+cat);
                break;
            }
            default:{
                System.out.println("Numero invalido...");
            }
        }
       
       
        
    }

    
//metodos addicionales
static int pideValor(String mensaje){
    int x=0;
    System.out.println(mensaje);
    return x=leer.nextInt();
    }
    static int menu(){
        System.out.println("1Ejemplo de IF-ELSE simple ");
        System.out.println("1Ejemplo de IF-ELSE anidado ");
        System.out.println("1Ejemplo de IF-ELSE Switch-CASE ");
        int opc=pideValor("Elija una opcion....");
        return opc;
    }

//Estructuras simples IF_ELSE
static void simple(){
    int a=pideValor("Digite el primer valor: ");
    int b=pideValor("Digite el segundo  valor: "); 
    if (a%b==0){
        System.out.println("El numero" +a+ "es dividible entre"+b);
    }else{
        System.out.println("El numero"+a+"no es divisible entre"+b);
    
    }//fin else
}//fin metodo simple
//Estructura Anidada IF-ELSE
static void anidado(){
    int mayor =0;
    int a= pideValor("Digite el primer valor");
     int b= pideValor("Digite el segundo valor");
     int c= pideValor("Digite el tercer valor");
     if(a>b&a>c){
         mayor = a;
     }else{
         if (b>a&b>c){
             mayor=b;
             
         }else{
             if (c>a&c>b){
                 mayor=c;
             }//fin tercer if
         }//fin segundo else
     }//
     System.out.println("El valor mayor es "+mayor);
} //fin de metodo aniado
 
// EJEMPLO DE SWITCH-CASE

    static String categoria(){
        String cate="";
        int nota=pideValor("Dijite la nota del estudiante (entre 0 y 10");
        if (nota>10){
            System.out.println("Error... Nota no existe");
        }else{
            switch (nota){
                case 10,9:{
                    cate="Execelente";
                    break;
                }
                case 8,7:{
                    cate="Aprovado";
                    break;
                }
                case 6,5:{
                        cate="Aplazado";
                        break;
                }
                default:{
                    cate ="Suspendido";
                    break;
                }
            }
        }
       return cate;
    }
}

