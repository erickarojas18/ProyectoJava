
package com.mycompany.semana3;
import java.util.Scanner;

public class matriz {
    
    public static Scanner leer = new Scanner(System.in);
    public static void main(String[] args) {
       
        int matriz [] []= new int [3] [3]; // primer corchete son fila y el segundo columnas
        
       //definir una matriz
       int matriz1 [] []= {{12,13,14},{15,16,17}};
       //invocar metodos
       matriz = llenar(matriz);
       imprimir (matriz1);
       int resultado =suma(matriz1);
        System.out.println("La suma de la matriz es " +resultado);
        
    }
    //metodos para matrices o arreglos de arreglos
    static int  [][] llenar(int [] []mat){
        for (int i =0; i <=mat.length-1;i++){
            for ( int j=0; j <=mat[i].length-1;j++){
                System.out.println("Digite un valor..");
                mat[i][j]= leer.nextInt();
            }//fin columnas
        }//fin filas
        return mat;
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
                suma =suma+mat1[i] [j];
            }//fin for columnas
             System.out.println("El total de la fila " +i+" es " +suma);
             tot=tot+suma;
         }// fin filas     
        return tot;
    }
}
