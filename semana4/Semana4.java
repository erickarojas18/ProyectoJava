/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.semana4;
//matriz irregular

import java.util.Scanner;

public class Semana4 {
    public static Scanner leer = new Scanner(System.in);
    public static void main(String[] args) {
        // int [] [] mregular = new[3][5];
        int [] [] mat = new int [3][];
                mat [0]= new int [3];
                mat [1]= new int [2];
                mat [2] = new int [5];
        int [][] mat2={{10,12,13},{25,11},{35,45,66,19,16},{2,3,0}};
        //mat=llena(mat);
        imprime(mat2);
    }
    
    static int pideValor(String mensaje){
        System.out.println(mensaje);
        return leer.nextInt();
    }
    static int [][]llena(int [][]m){
        for (int i=0;i<=m.length-1;i++){
            System.out.println("llenando fila "+i);
            for (int j =0; j<=m[i].length-1;j++){
                m[i][j]=pideValor("Digite un numero ");
            }
        }
        return m;
    }
    static void imprime(int [][]m){
        for (int i=0;i<=m.length-1;i++){
            for (int j =0; j<=m[i].length-1;j++){
                System.out.print( m[i][j]+" ");
            }
            System.out.println(" ");
        }
    }
}
