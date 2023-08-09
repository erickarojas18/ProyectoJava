/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package com.mycompany.semana4;
import java.util.ArrayList;
import java.util.Scanner;

public class enunciadoGrup2 {

  
    public static void main(String[] args) {
 
        ArrayList<String> nombres = new ArrayList<>();
        Scanner scanner = new Scanner(System.in);

      
        for (int i = 0; i < 5; i++) {
            System.out.print("Ingrese un nombre: ");
            String nombre = scanner.nextLine();
            nombres.add(nombre);
        }

      
        System.out.println("Lista de nombres:");
        for (String nombre : nombres) {
            System.out.println(nombre);
        }

        nombres.remove(2);

      
        System.out.println("Cantidad de elementos después de eliminar: " + nombres.size());

        System.out.println("Lista vacía:");
        nombres.clear();

     
        if (nombres.isEmpty()) {
            System.out.println("La lista está vacía.");
        } else {
            System.out.println("La lista no está vacía.");
        }

        scanner.close();
    }
}

