/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package com.mycompany.semana4;
import java.util.ArrayList;
import java.util.Scanner;

public class enunciadoGrup1eje2 {

   
    public static void main(String[] args) {
        ArrayList<String> cedulas = new ArrayList<>();
        ArrayList<String> nombres = new ArrayList<>();
        Scanner scanner = new Scanner(System.in);

        for (int i = 0; i < 5; i++) {
            System.out.print("Ingrese la cédula #" + (i + 1) + ": ");
            String cedula = scanner.nextLine();
            System.out.print("Ingrese el nombre #" + (i + 1) + ": ");
            String nombre = scanner.nextLine();

            cedulas.add(cedula);
            nombres.add(nombre);
        }
        
        for (int i = 0; i < cedulas.size(); i++) {
            System.out.println("Ced " + (i + 1) + " -> " + nombres.get(i));
        }

     
        System.out.print("Ingrese un nombre a verificar: ");
        String nombreVerificar = scanner.nextLine();
        boolean coincide = false;
        for (int i = 0; i < nombres.size(); i++) {
            if (nombres.get(i).equals(nombreVerificar)) {
                coincide = true;
                break;
            }
        }
        if (coincide) {
            System.out.println("El nombre coincide con una cédula en la lista.");
        } else {
            System.out.println("El nombre no coincide con ninguna cédula en la lista.");
        }

        scanner.close();
    }
}

    
    

