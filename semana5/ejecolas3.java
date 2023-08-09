/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package com.mycompany.semana5;
import java.util.LinkedList;
import java.util.Queue;
import java.util.Random;

public class ejecolas3 {

    public static void main(String[] args) {
        Queue<Integer> cola = generarCola();
        Queue<Integer> cNumeros = new LinkedList<>();

        pasarNumerosDeLaSuerte(cola, cNumeros);

        System.out.println("Cola con valores iniciales: " + cola);
        System.out.println("Cola con números de la suerte: " + cNumeros);
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

    public static void pasarNumerosDeLaSuerte(Queue<Integer> cola, Queue<Integer> cNumeros) {
        int contador = 1;
        while (!cola.isEmpty()) {
            int valor = cola.poll();

            if (contador == 5) {
                cNumeros.add(valor);
                System.out.println("Número de la suerte extraído: " + valor);
            }

            contador++;

            // Reiniciar el contador después de cada 5 elementos
            if (contador > 5) {
                contador = 1;
            }
        }
    }
}


