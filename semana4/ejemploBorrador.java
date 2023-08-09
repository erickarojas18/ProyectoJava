/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package com.mycompany.semana4;

/**
 *
 * @author erick
 */
public class ejemploBorrador {

    public static void main(String[] args) {
        String str1 = "Hola";
        String str2 = "Hola ";
        String str3 = "hola";
        
        // equals()
        boolean equals = str1.equals(str2);
        System.out.println("str1 equals str2: " + equals);
        
        // equalsIgnoreCase()
        boolean equalsIgnoreCase = str1.equalsIgnoreCase(str3);
        System.out.println("str1 equalsIgnoreCase str3: " + equalsIgnoreCase);
        
        // compareTo()
        int compareTo = str1.compareTo(str2);
        System.out.println("str1 compareTo str2: " + compareTo);
        
        // trim()
        String trimmedStr = str2.trim();
        System.out.println("Trimmed str2: " + trimmedStr);
        
        // toLowerCase()
        String lowercaseStr = str1.toLowerCase();
        System.out.println("Lowercase str1: " + lowercaseStr);
        
        // toUpperCase()
        String uppercaseStr = str3.toUpperCase();
        System.out.println("Uppercase str3: " + uppercaseStr);
    }
}

      
    
    

