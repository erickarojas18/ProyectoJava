/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package com.mycompany.semana4;
import java.util.Scanner;

public class ejestringcompa {
    public static Scanner leer = new Scanner(System.in);
    public static void main(String[] args) {
    String cadena1 = "Hola";
    String cadena2 = "Adios";
    String cadena3 = "Hola";

    int resultado1 = cadena1.compareTo(cadena2);
    int resultado2 = cadena1.compareTo(cadena3);

    System.out.println(resultado1);
    System.out.println(resultado2);

    }
    
}
