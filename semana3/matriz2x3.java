/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package com.mycompany.semana3;


public class matriz2x3 {

    public static void main(String[] args) {
        // Crear matriz 1 de 2x3
        int[][] matriz1 = {
            {1, 2, 3},
            {4, 5, 6}
        };

        // Crear matriz 2 de 3x2
        int[][] matriz2 = new int[3][2];

        // Copiar valores de matriz1 a matriz2
        for (int i = 0; i < matriz1.length; i++) {
            for (int j = 0; j < matriz1[i].length; j++) {
                matriz2[j][i] = matriz1[i][j];
            }
        }

        // Imprimir matriz1
        System.out.println("Matriz 1:");
        imprimirMatriz(matriz1);

        // Imprimir matriz2
        System.out.println("Matriz 2:");
        imprimirMatriz(matriz2);
    }

    static void imprimirMatriz(int[][] matriz) {
        for (int i = 0; i < matriz.length; i++) {
            for (int j = 0; j < matriz[i].length; j++) {
                System.out.print(matriz[i][j] + " ");
            }
            System.out.println();
        }
    }
}

    
    

