/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package com.mycompany.semana3;
import java.util.Scanner;

public class practicaMatriz {

    public static Scanner leer = new Scanner(System.in);
    public static void main(String[] args) {
        int matriz [] [] = new int [5] [5];
        //definir matriz
        int matriz1 [] [] = {
            {20,33,10,5,16},
            {8,13,71,44,25},
            {11,75,22,2,18},
            {100,65,1,42,90},
            {19,0,17,31,6}
        };
        
    imprimir (matriz1);
    int res= suma (matriz1);
     System.out.println("La suma de la diagonal 1 es " + res);
     
    int res2 = suma2(matriz1);
    System.out.println("La suma de la segunda diagonal es "+res2);
      
    }//fin main
    static void imprimir (int [][] mat){
         for (int i =0; i <=mat.length-1;i++){
            for ( int j=0; j <=mat[i].length-1;j++){
                System.out.print(mat [i] [j]+ " ");
            }// fin for columnas
             System.out.println(" ");
        }// fin for filas
    }
         
    static int suma( int [][]mat1){
        int suma = 0, j=0;
        System.out.println("Imprime diagonal 1 ....");
        for (int i = 0; i < mat1.length;i++) {
            System.out.println(mat1[i][j]+" ");
            suma += mat1[i][j];
            j=j+1;
        }
        return suma;
    }
           
      
    public static int suma2( int [][]mat1 ){
        int sum =0, j= 4;
        System.out.println("Imprime diagonal 2...");
        for (int i =0; i<mat1.length;i++){
            System.out.println(mat1[i][j]+" ");
            sum =sum+mat1[i][j];
            j=j-1;
        }
        return sum;
    }
}
    

