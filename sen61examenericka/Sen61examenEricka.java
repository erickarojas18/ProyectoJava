
package com.mycompany.sen61examenericka;
import java.util.Scanner;
import java.util.Random;

public class Sen61examenEricka {
    
    public static void main(String[] args) {
        // Definir el número de vendedores y modelos de automóviles
        int NUM_VENDEDORES = 10;
        int NUM_MODELOS = 15;

        // Crear una matriz de ventas inicializada con ceros
        int[][] ventas = new int[NUM_VENDEDORES][NUM_MODELOS];

        // Registrar ventas aleatorias para cada vendedor y modelo
        Random random = new Random();
        for (int vendedor = 0; vendedor < NUM_VENDEDORES; vendedor++) {
            for (int modelo = 0; modelo < NUM_MODELOS; modelo++) {
                ventas[vendedor][modelo] = random.nextInt(100);
            }
        }

        // Imprimir el informe mensual de ventas
        System.out.println("Informe Mensual de Ventas");
        System.out.println("-------------------------");

        // Imprimir encabezados de modelos de automóviles
        System.out.print("\n");
        for (int modelo = 0; modelo < NUM_MODELOS; modelo++) {
            System.out.print("Modelo " + (modelo + 1) + "\t");
        }
        System.out.println("Total");

        // Imprimir ventas por vendedor y modelo
        int mejorVendedor = -1;
        int maxVentas = 0;
        int[] totalModelos = new int[NUM_MODELOS];

        for (int vendedor = 0; vendedor < NUM_VENDEDORES; vendedor++) {
            int totalVendedor = 0;
            System.out.print("Vendedor " + (vendedor + 1) + "\t");

            for (int modelo = 0; modelo < NUM_MODELOS; modelo++) {
                int cantidad = ventas[vendedor][modelo];
                System.out.print(cantidad + "\n\n");
                totalVendedor += cantidad;
                totalModelos[modelo] += cantidad;
            }

            System.out.println(totalVendedor);

            // Actualizar el mejor vendedor
            if (totalVendedor > maxVentas) {
                maxVentas = totalVendedor;
                mejorVendedor = vendedor + 1;
            } else if (totalVendedor == maxVentas) {
                mejorVendedor = -1; // Indicar un empate
            }
        }

        // Imprimir total de cada modelo
        System.out.println("-------------------------");
        System.out.print("Total\t\t");
        for (int total : totalModelos) {
            System.out.print(total + "\t\t");
        }
        System.out.println();

        // Imprimir el mejor vendedor
        System.out.println("-------------------------");
        if (mejorVendedor == -1) {
            System.out.println("El premio será repartido entre los dos vendedores con más ventas.");
        } else {
            System.out.println("El mejor vendedor es el Vendedor " + mejorVendedor + ".");
        }
    }
}