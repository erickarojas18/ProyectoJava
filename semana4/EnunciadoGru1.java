/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package com.mycompany.semana4;
import java.util.ArrayList;
import java.util.Scanner;

public class EnunciadoGru1 {

 
    public static void main(String[] args) {
        ArrayList<String> nombres = new ArrayList<>();
        Scanner scanner = new Scanner(System.in);

        nombres.add("Juan");
        nombres.add("María");
        nombres.add("Pedro");
        nombres.add("Nikol");
        nombres.add("Luis");
        nombres.add("Ana");
        nombres.add("Ali");
        nombres.add("Paula");
        nombres.add("Ericka");
        nombres.add("Alba");

        int opcion = 0;
        while (opcion != 3) {
            System.out.println("Menú");
            System.out.println("1. Posición del Nombre");
            System.out.println("2. Última vez que aparece el nombre");
            System.out.println("3. Salir");
            System.out.print("Ingrese una opción: ");
            opcion = scanner.nextInt();
            scanner.nextLine();
            switch (opcion) {
                case 1:
                    System.out.print("Ingrese el nombre a buscar: ");
                    String nombreBuscado = scanner.nextLine();
                    int primeraPosicion = nombres.indexOf(nombreBuscado);
                    if (primeraPosicion != -1) {
                        System.out.println("La primera posición de " + nombreBuscado + " es: " + primeraPosicion);
                    } else {
                        System.out.println(nombreBuscado + " no se encuentra en la lista.");
                    }
                    break;
                case 2:
                    System.out.print("Ingrese el nombre a buscar: ");
                    String nombreBuscado2 = scanner.nextLine();
                    int ultimaPosicion = nombres.lastIndexOf(nombreBuscado2);
                    if (ultimaPosicion != -1) {
                        System.out.println("La última posición de " + nombreBuscado2 + " es: " + ultimaPosicion);
                    } else {
                        System.out.println(nombreBuscado2 + " no se encuentra en la lista.");
                    }
                    break;
                case 3:
                    System.out.println("Saliendo del programa...");
                    break;
                default:
                    System.out.println("Opción inválida. Por favor, ingrese una opción válida.");
                    break;
            }
        }
        scanner.close();
    }
}

    
 
