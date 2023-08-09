/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package com.mycompany.semana5;
 import java.util.LinkedList;
import java.util.Queue;
public class ejecolas {
  

    public static void main(String[] args) {
        Queue<Integer> colaInicial = new LinkedList<>();
        colaInicial.add(5);
        colaInicial.add(-2);
        colaInicial.add(10);
        colaInicial.add(-7);
        colaInicial.add(3);
        colaInicial.add(-9);
        
        Queue<Integer> colaPositivos = new LinkedList<>();
        Queue<Integer> colaNegativos = new LinkedList<>();
        
        separarValores(colaInicial, colaPositivos, colaNegativos);
        
        System.out.println("Cola con valores iniciales: " + colaInicial);
        System.out.println("Cola con valores positivos: " + colaPositivos);
        System.out.println("Cola con valores negativos: " + colaNegativos);
    }
    
    public static void separarValores(Queue<Integer> colaInicial, Queue<Integer> colaPositivos, Queue<Integer> colaNegativos) {
        while (!colaInicial.isEmpty()) {
            int valor = colaInicial.poll();
            
            if (valor >= 0) {
                colaPositivos.add(valor);
            } else {
                colaNegativos.add(valor);
            }
        }
    }
}

 
