/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package com.mycompany.semana5;
import java.util.Arrays;

public class parcticaexa1 {

    public static void main(String[] args) {
        int[] arreglo1 = {20, 2, 10, 5, 12};
        int[] arreglo2 = new int[5];
        int[] arreglo3 = new int[5];

        separarNumeros(arreglo1, arreglo2, arreglo3);
        ordenarArreglos(arreglo1, arreglo2, arreglo3);
        imprimirArreglos(arreglo1, arreglo2, arreglo3);
    }

    public static void separarNumeros(int[] arreglo1, int[] arreglo2, int[] arreglo3) {
        for (int i = 0; i < arreglo1.length; i++) {
            int numero = arreglo1[i];
            int mitad = numero / 2;
            if (mitad % 2 == 0) {
                arreglo2[i] = numero;
            } else {
                arreglo3[i] = numero;
            }
        }
    }

    public static void ordenarArreglos(int[] arreglo1, int[] arreglo2, int[] arreglo3) {
        Arrays.sort(arreglo1);
        Arrays.sort(arreglo2);
        Arrays.sort(arreglo3);
    }

    public static void imprimirArreglos(int[] arreglo1, int[] arreglo2, int[] arreglo3) {
        System.out.println("Arreglo 1\tArreglo 2\tArreglo 3");
        for (int i = 0; i < arreglo1.length; i++) {
            System.out.printf("%d\t\t%s\t\t%s%n", arreglo1[i], formatArrayElement(arreglo2[i]), formatArrayElement(arreglo3[i]));
        }
    }

    public static String formatArrayElement(int value) {
        return value == 0 ? "[0]" : Integer.toString(value);
    }
}
