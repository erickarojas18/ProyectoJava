/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package com.mycompany.semana5;
import java.util.Scanner;

public class practcaexa3 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Introduzca el tamaño de la pila: ");
        int n = sc.nextInt();

        int pila[] = new int[n];

        System.out.println("Introduzca los elementos de la pila: ");

        for (int i = 0; i < n; i++) {
            pila[i] = sc.nextInt();
        }

        System.out.println("El elemento en la posición 1 es: " + pila[1]);

        int extraido = pila[1];

        for (int i = 0; i < n - 1; i++) {
            pila[i] = pila[i + 1];
        }

        pila[n - 1] = 0;

        System.out.println("La pila antes de extraer el elemento: ");
        mostrarPila(pila);

        System.out.println("El elemento extraído es: " + extraido);

        System.out.println("La pila después de extraer el elemento: ");
        mostrarPila(pila);
    }

    public static void mostrarPila(int[] pila) {
        for (int i = 0; i < pila.length; i++) {
            System.out.print(pila[i] + " ");
        }
        System.out.println();
    }
}




    

