/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package com.mycompany.semana3;
import java.util.*;

public class array10Posiciones {
        
    public static Scanner leer = new Scanner(System.in);
    public static void main(String[] args) {
        int opc=0, res=0;
        int[] arreglo1 = new int[10];
        int[] arreglo2 = new int[10];
        while (opc<5){
            opc=menu();
            switch (opc){
                case 1:{
                    arreglo1=llenar(arreglo1);
                    arreglo2=llenar(arreglo2);
                    break;
                }
                case 2:{
                    arreglo2=(arreglo2);
                    System.out.println("imprimiendo arreglo3");
                    imprimir(arreglo2);
                    break;
                }
                
            }//fin switch   
        }//fin while
    }//fin main 
    public static int menu() {
                int opc = 0;
                System.out.println("1-Llenar arreglo  ");
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
    
}
