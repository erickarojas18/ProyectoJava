/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package com.mycompany.semana3;

import java.util.*;
import java.util.Random;
import java.util.Scanner;

public class arrrayAleatorios{
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Ingrese numeros entre 0 y 9 : ");
        int tamaño = scanner.nextInt();

        int[] array = new int[tamaño];
        llenarArray(array);
        mostrarArray(array);
    }

    public static void llenarArray(int[] array) {
        Random random = new Random();
        for (int i = 0; i < array.length; i++) {
            int numero = generarNumeroAleatorio(random);
            array[i] = numero;
        }
    }

    public static int generarNumeroAleatorio(Random random) {
        return random.nextInt(10); 
    }

    public static void mostrarArray(int[] array) {
        int suma;
        for (int i = 0; i < array.length; i++) {
            suma = array[i] + i;
            System.out.println("Posición " + i + ": " + array[i] + " - Suma: " + suma);
        }
    }
}


    
