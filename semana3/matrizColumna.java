/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package com.mycompany.semana3;

import java.util.Scanner;

public class matrizColumna {

    public static Scanner leer = new Scanner(System.in);
    public static void main(String[] args) {
        //definir matriz
        int matriz1 [][] = {{20,33,10,5,16},{8,13,71,44,25},{11,75,22,2,18},{100,65,1,42,90},{19,0,17,31,6}};
        
        imprimir (matriz1);
        int res= suma (matriz1);
       
        
    }
    
    static void imprimir (int [][] mat){
         for (int i =0; i <=mat.length-1;i++){
            for ( int j=0; j <=mat[i].length-1;j++){
                System.out.print(mat [i] [j]+" ");
            }// fin for columnas
             System.out.println(" ");
        }// fin for filas
    }
         
    static int suma( int [][]mat1){
        int tot =0;
         for (int i =0; i <=mat1.length-1;i++){
             int suma =0;
            for ( int j=0; j <=mat1[i].length-1;j++){
                suma =suma+mat1[j] [i];
            }//fin for columnas
             System.out.println("El total de la fila " +i+" es " +suma);
             tot=tot+suma;
        } 
         return tot;
    }
}
    

