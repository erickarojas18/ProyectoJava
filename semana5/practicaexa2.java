/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package com.mycompany.semana5;
import java.util.Scanner;
        


public class practicaexa2 {
    
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Introduce el tamaño del array: ");
        int n = sc.nextInt();

        int[] array = new int[n];

        // Llena el array con números aleatorios entre 1 y 300
        for (int i = 0; i < n; i++) {
            array[i] = (int) (Math.random() * 300 + 1);
        }

        System.out.println("Introduce el dígito para filtrar: ");
        int digit = sc.nextInt();

        int[] resultado = new int[n];
        int j = 0;

        // Filtra los números que terminan en el dígito
        for (int i = 0; i < n; i++) {
            if (array[i] % 10 == digit) {
                resultado[j] = array[i];
                j++;
            }
        }

        // Imprime el array resultado
        System.out.print("Los números que terminan en " + digit + ": ");
        for (int i = 0; i < j; i++) {
            System.out.print(resultado[i] + " ");
        }
    }
}







  
