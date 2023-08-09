/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package com.mycompany.semana3;
import java.util.Scanner;

public class matrizU {
    public static Scanner leer = new Scanner(System.in);
    public static void main(String[] args) {
        int[][] matriz = {
            {20, 33, 10, 5, 16},
            {8, 13, 71, 44, 25},
            {11, 75, 22, 2, 18},
            {100, 65, 1, 42, 90},
            {19, 0, 17, 31, 6}
        };

        System.out.println("Matriz completa:");
        imprimirMatriz(matriz);

        System.out.println("En U:");
        imprimirEnU(matriz);
    }

    static void imprimirMatriz(int[][] matriz) {
        for (int[] fila : matriz) {
            for (int elemento : fila) {
                System.out.print(elemento + " ");
            }
            System.out.println();
        }
    }

    static void imprimirEnU(int[][] matriz) {
        for (int i = 0; i < matriz.length; i++) {
            for (int j = 0; j < matriz[i].length; j++) {
                if ((i == 0 || i == 4) && (j == 0 || j == 4)) {
                    System.out.print(matriz[i][j] + " ");
                } else if ((i == 1 || i == 2 || i == 3) && (j == 0 || j == matriz[i].length - 1)) {
                    System.out.print(matriz[i][j] + " ");
                } else if (i == 4 && (j >= 1 && j <= 3)) {
                    System.out.print(matriz[i][j] + " ");
                } else {
                    System.out.print("  ");
                }
            }
            System.out.println();
        }
    
}
}

    