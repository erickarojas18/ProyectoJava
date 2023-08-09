/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package com.mycompany.semana71;
 import java.util.Scanner;
public class borrador2 {

    public static void main(String[] args) {
        int vendedores = 5; // Número de vendedores
        int maxDias = 7; // Máximo de días de la semana
        int maxHorasSemana = 54; // Límite de horas semanales
        int maxHorasDia = 12; // Límite de horas diarias

        int[][] horasTrabajadas = new int[vendedores][maxDias];
        

        Scanner scanner = new Scanner(System.in);

        for (int i = 0; i < vendedores; i++) {
            System.out.println("Vendedor " + (i + 1) + ":");
            String[] diasSemana = {"Lunes", "Martes", "Miércoles", "Jueves", "Viernes", "Sábado", "Domingo"};
            int totalHorasSemana = 0;
            boolean error = false;

            for (int j = 0; j < diasSemana.length; j++) {
                System.out.print("Ingrese las horas trabajadas para el " + diasSemana[j] + ": ");
                int horas = scanner.nextInt();
                if (horas > maxHorasDia) {
                    error = true;
                    break;
                }
                totalHorasSemana += horas;
                horasTrabajadas[i][j] = horas;
            }

            if (error || totalHorasSemana > maxHorasSemana) {
                System.out.println("Error: Las horas trabajadas por el vendedor " + (i + 1) + " exceden el límite permitido.");
                if (error) {
                    System.out.println("El vendedor no puede trabajar más de " + maxHorasDia + " horas en un día.");
                }
                if (totalHorasSemana > maxHorasSemana) {
                    System.out.println("El vendedor no puede trabajar más de " + maxHorasSemana + " horas en una semana.");
                }
            } else {
                System.out.println("Las horas trabajadas por el vendedor " + (i + 1) + " están dentro de los límites permitidos.");
            }
        }
    }
}
