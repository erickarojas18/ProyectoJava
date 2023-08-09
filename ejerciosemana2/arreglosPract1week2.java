/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package com.mycompany.ejerciosemana2;
import java.util.*;

public class arreglosPract1week2 {
    public static Scanner leer = new Scanner(System.in);
    public static void main(String[] args) {
       int opc=0, res=0;
        int[] arreglo1 = new int[5];
        int[] arreglo2 = new int[5];
        int[] arreglo3 = new int[5];
        int[] Valores = {7,5,10,15,12};
        while (opc<5){
            opc=menu();
            switch (opc){
                case 1:{
                    arreglo1=llenar(arreglo1);
                    arreglo2=llenar(arreglo2);
                    break;
                }
                case 2:{
                    arreglo3=sumar(arreglo1,arreglo2,arreglo3);
                    System.out.println("imprimiendo arreglo3");
                    imprimir(arreglo3);
                    break;
                }
                case 3:{
                    System.out.println("Arreglo1");
                    imprimir(arreglo1);
                    System.out.println("Arreglo2");
                    imprimir(arreglo2);
                    intercambia(arreglo1,arreglo2);
                    break;
                }
                case 4:{
                   arreglo3=fiboArreglo(Valores,arreglo3);
                    System.out.println("Arreglo con valores en fibonnaci...");
                   imprimir(arreglo3);
                   break;
                }
                default:{
                    System.out.println("Gracias por utilizar el sistema...");
                    break;
                }
            }             
        }//fin while
    }// fin main      
    public static int menu() {
                int opc = 0;
                System.out.println("1-Llenar arreglo  ");
                System.out.println("2- Sumar arreglo ");
                System.out.println("3- Intercambiar arreglos ");
                System.out.println("4- Salir");
                System.out.println("Elija una opcion ");
                opc = leer.nextInt();
                return opc;
    }
    
 static int[]llenar(int [] anumeros){
        for (int i=0;i<=anumeros.length-1;i++){
            System.out.println("Digite un número...");
            anumeros[i]=leer.nextInt();
        } 
        System.out.println("Imprimiendo arreglo...");
        imprimir(anumeros);
        System.out.println("\n");
        return anumeros;
    }
    
    static void imprimir(int []anumeros){
        for (int i=0;i<=anumeros.length-1;i++){
            System.out.print(anumeros[i]+",");
        }
        System.out.println("\n");
    }
    
    static int []sumar(int []arr1, int[]arr2, int []arr3){
        int j=arr2.length-1;
        for (int i=0;i<=arr1.length-1;i++){
            arr3[i]=arr1[i]+arr2[j];
            j=j-1;
        }
        return arr3;
    }
    
    static void intercambia(int []arr1, int[]arr2){
        int j=0;
        int temp=0;
       
        for (int i=0;i<=arr1.length-1;i++){
            temp=arr1[i];
            arr1[i]=arr2[i];
            arr2[i]=temp;
            System.out.println("Intercambio en la posición "+i);
            System.out.println("Arreglo 1: "+arr1[i]);
            System.out.println("Arreglo 2: "+arr2[i]);
        }
    }
    static int [] fiboArreglo(int []val, int[]arr3){
        System.arraycopy(val, 0, arr3, 0, 5);
        System.out.println("Copia de arreglo en arreglo 3:");
        imprimir(arr3);
        System.out.println("\n");
        int num=0;
        for (int i=0;i<=arr3.length-1;i++){
            num=arr3[i];
            System.out.println(num+" en posición "+i);
            int nfib=fibonnaci(num);
            arr3[i]=nfib;
        }
        return arr3;
    }
    static int fibonnaci(int valor){
        int fib=0,a=0,b=1;
        System.out.print(a+" "+b+" ");
        while (valor>1){
            fib=a+b;
            a=b;
            b=fib;
            System.out.print(fib+" ");
            valor=valor-1;
        }
        System.out.println("\n");
        return fib;
    }
}

    

