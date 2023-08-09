/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package com.mycompany.semana4;
import java.util.ArrayList;
import java.util.Scanner;

public class enugrup2eje2{
    public static void main(String[] args) {
        ArrayList<String> nombres = new ArrayList<>();
        Scanner scanner = new Scanner(System.in);

        // Pedir nombres al usuario y agregarlos a la lista
        for (int i = 0; i < 5; i++) {
            System.out.print("Ingrese un nombre: ");
            String nombre = scanner.nextLine();
            nombres.add(nombre);
        }

        // Imprimir la posición de cada nombre en la lista
        System.out.println("Posición de cada nombre en la lista:");
        for (int i = 0; i < nombres.size(); i++) {
            String nombre = nombres.get(i);
            System.out.println(nombre + " -> Posición: " + i);
        }

        // Verificar si cada posición de la lista está llena
        boolean todasLlenas = true;
        for (String nombre : nombres) {
            if (nombre.isEmpty()) {
                todasLlenas = false;
                break;
            }
        }

        // Imprimir el resultado de verificar si cada posición está llena
        System.out.println("Todas las posiciones están llenas: " + todasLlenas);

        scanner.close();
    }
}
