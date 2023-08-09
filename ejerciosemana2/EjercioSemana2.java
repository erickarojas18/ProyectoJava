/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.ejerciosemana2;
import java.util.Scanner;
public class EjercioSemana2 {
    
    public static Scanner leer = new Scanner(System.in);
    public static void main(String[] args) {
        //definicion1
        int [] num;
        num= new int [4];
        //definicion2(mas usada)
        int [] valores=new int [4];
        
        //definicon 3
        int [] val={120,25,45,900};
        
       num=llenar(num);
        System.out.println("El arreglo es..");
        imprimir(val);
        int resultado =sumar(val);
        System.out.println("El resultado es :"+resultado);
        valores=copiar(val,valores);
        System.arraycopy(val,0,valores,0,4);
        System.out.println("Arreglo copia ...");
        imprimir(valores);
    }
    static int []llenar(int []anumeros){
        for (int i=0; i<=anumeros.length-1;i++){
            System.out.println("Digite un valor..");
            anumeros[i]=leer.nextInt();
                    
        }
        return anumeros;
    }
    static void imprimir(int []anumeros){
        for (int i=0; i<=anumeros.length-1;i++){
            System.out.print(anumeros[i]+" ");
     
        }
    }  //fin imprimir 
    static int sumar(int []numeros){
        int resp=0;
        for (int i=0; i<=numeros.length-1;i++){
            resp=resp+numeros[i];
        }
        return resp;
    }
    static int [] copiar(int[]numeros, int []copia){
        for ( int i=0;i<=numeros.length-1;i++){
           copia[i]=numeros[i];
        }
        return copia;
    }
}    

