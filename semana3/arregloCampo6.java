/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package com.mycompany.semana3;
 import java.util.Random;
 import java.util.*;

public class arregloCampo6 {

   
    public static void main(String[] args) {
        int[] arreglo = generarArregloAleatorio(6);
        System.out.println("Arreglo original:");
        mostrarArreglo(arreglo);

        ordenarArreglo(arreglo);
        System.out.println("Arreglo ordenado:");
        mostrarArreglo(arreglo);
    }

    public static void ordenarArreglo(int[] arreglo) {
        for (int i = 0; i < arreglo.length - 1; i++) {
            for (int j = 0; j < arreglo.length - i - 1; j++) {
                if (arreglo[j] > arreglo[j + 1]) {
                    // Intercambiar los elementos
                    int temp = arreglo[j];
                    arreglo[j] = arreglo[j + 1];
                    arreglo[j + 1] = temp;
                }
            }
        }
    }

    public static int[] generarArregloAleatorio(int tamaño) {
        Random random = new Random();
        int[] arreglo = new int[tamaño];
        for (int i = 0; i < arreglo.length; i++) {
            arreglo[i] = random.nextInt(100); 
        }
        return arreglo;
    }

    public static void mostrarArreglo(int[] arreglo) {
        for (int i = 0; i < arreglo.length; i++) {
            System.out.print(arreglo[i] + " ");
        }
        System.out.println();
    }
}

       
    
    

