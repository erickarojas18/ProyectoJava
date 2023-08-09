/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package com.mycompany.semana5;
 
 import java.util.LinkedList;
import java.util.Queue;
import java.util.Random;

public class eje2colas {


    public static void main(String[] args) {
        Queue<Integer> cola = generarCola();
        Queue<Integer> colaPar = new LinkedList<>();
        Queue<Integer> colaImpar = new LinkedList<>();
        
        separarParesImpares(cola, colaPar, colaImpar);
        
        System.out.println("Cola con valores iniciales: " + cola);
        System.out.println("Cola con valores pares: " + colaPar);
        System.out.println("Cola con valores impares: " + colaImpar);
    }
    
    public static Queue<Integer> generarCola() {
        Queue<Integer> cola = new LinkedList<>();
        
        Random random = new Random();
        int tamano = random.nextInt(20) + 1; // Generar un tamaño aleatorio entre 1 y 20
        
        for (int i = 0; i < tamano; i++) {
            int valor = random.nextInt(Integer.MAX_VALUE) + 1; // Generar un valor aleatorio mayor que 0
            cola.add(valor);
        }
        
        return cola;
    }
    
    public static void separarParesImpares(Queue<Integer> cola, Queue<Integer> colaPar, Queue<Integer> colaImpar) {
        while (!cola.isEmpty()) {
            int valor = cola.poll();
            
            if (valor % 2 == 0) {
                colaPar.add(valor);
            } else {
                colaImpar.add(valor);
            }
        }
    }
}

