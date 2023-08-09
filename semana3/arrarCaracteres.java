/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package com.mycompany.semana3;
import java.util.*;

public class arrarCaracteres {

    public static Scanner leer = new Scanner(System.in);
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        System.out.println("Ingrese una frase: ");
        String frase = scanner.nextLine();
        
        char[] caracteres = frase.toCharArray();
        
        System.out.println("Los caracteres de la frase anterios son: ");
        for (char c: caracteres){
            System.out.println(c);
        }
     
    }
    
}
