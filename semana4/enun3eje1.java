/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package com.mycompany.semana4;
import java.util.ArrayList;
import java.util.Scanner;
public class enun3eje1 {

    public static void main(String[] args) {
        ArrayList<String> nombres = new ArrayList<>();
        Scanner scanner = new Scanner(System.in);
        int opcion;

        do {
            System.out.println("----- Menú -----");
            System.out.println("1. Llenar lista con nombres");
            System.out.println("2. Ver lista");
            System.out.println("3. Eliminar nombre");
            System.out.println("4. Eliminar nombres sin la letra 'A'");
            System.out.println("5. Convertir de ArrayList a Array");
            System.out.println("6. Salir");
            System.out.print("Seleccione una opción: ");
            opcion = scanner.nextInt();
            scanner.nextLine(); // Consumir el salto de línea después de leer la opción

            switch (opcion) {
                case 1:
                    llenar(nombres, scanner);
                    break;
                case 2:
                    imprimir(nombres);
                    break;
                case 3:
                    eliminarNombre(nombres, scanner);
                    break;
                case 4:
                    eliminarNombresSinA(nombres);
                    break;
                case 5:
                    convertir(nombres);
                    break;
                case 6:
                    System.out.println("Saliendo del programa...");
                    break;
                default:
                    System.out.println("Opción inválida. Intente nuevamente.");
                    break;
            }

            System.out.println();
        } while (opcion != 6);
    }

    public static void llenar(ArrayList<String> nombres, Scanner scanner) {
        System.out.print("Ingrese la cantidad de nombres que desea ingresar: ");
        int cantidad = scanner.nextInt();
        scanner.nextLine(); // Consumir el salto de línea después de leer la cantidad

        for (int i = 0; i < cantidad; i++) {
            System.out.print("Ingrese un nombre: ");
            String nombre = scanner.nextLine();
            nombres.add(nombre);
        }

        System.out.println("Lista de nombres llenada correctamente.");
    }

    public static void imprimir(ArrayList<String> nombres) {
        if (nombres.isEmpty()) {
            System.out.println("La lista está vacía.");
        } else {
            System.out.println("Lista de nombres:");
            for (String nombre : nombres) {
                System.out.println(nombre);
            }
        }
    }

    public static void eliminarNombre(ArrayList<String> nombres, Scanner scanner) {
        System.out.print("Ingrese el nombre que desea eliminar: ");
        String nombre = scanner.nextLine();
        ArrayList<String> eliminar = new ArrayList<>();
        eliminar.add(nombre);
        nombres.removeAll(eliminar);
        System.out.println("Nombre eliminado correctamente.");
    }

    public static void eliminarNombresSinA(ArrayList<String> nombres) {
        nombres.removeIf(nombre -> !nombre.toLowerCase().startsWith("a"));
        System.out.println("Nombres sin la letra 'A' eliminados correctamente.");
    }

    public static void convertir(ArrayList<String> nombres) {
        String[] miArray = new String[nombres.size()];
        nombres.toArray(miArray);

        System.out.println("De arrayList a array:");
        for (String nombre : miArray) {
            System.out.println(nombre);
        }
    }
}

   
    
    

