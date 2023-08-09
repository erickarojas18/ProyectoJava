/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
//Ericka Nicolle Rojas Borge
package com.mycompany.ejerciosemana2;
import java.util.*;

public class notasLaboratorio1 {
    public static Scanner leer = new Scanner(System.in);
    public static void main(String[] args) {
        String[] nombres = {"María", "Julieta", "Luis", "Enrique", "Carlos", "Monique", "Gerardo", "Pedro", "Ana", "Sofía"};
        int[] valores = {87, 68, 94, 100, 83, 78, 85, 91, 76, 87};
        
         int opcion = 0;

        while (opcion != 5) {
            System.out.println("********MENÚ********");
            System.out.println("1. Consultar registro");
            System.out.println("2. Graficar Retistro");
            System.out.println("3. Estadìstica de Registro");
            System.out.println("4. Salir");   
            System.out.println("********************");
            System.out.print("Ingrese una opción: ");
            
            Scanner scanner = new Scanner(System.in);
            opcion = scanner.nextInt();

            switch (opcion) {
                case 1 -> {
                    consultarRegis(nombres, valores);

                }
                case 2 ->{
                    graficarRegistro(valores);
                }
                case 3 -> {
                    calcularEstadisticas(valores);
                }
                case 4 ->{
                    System.out.println("¡Saliendo!");
                    System.exit(0);
                }

                default->
                    System.out.println("Opción inválida. Intente nuevamente.");
            }
        }
    }
        
       // muestra el registro con el ciclo for 
    public static void consultarRegis(String[] nombres, int[] valores){
         System.out.println("********************");
         System.out.println("Registro de calificaciones: ");
         for (int i = 0; i < nombres.length; i++) {
            System.out.println("Alumno: " + nombres[i] + ", Calificación: " + valores[i]);
         }
        
       
    }
    public static void graficarRegistro(int [] valores){
        System.out.println();
        int [] rangos = new int [11];
        
        for (int valor : valores){ 
             int rango = valor / 10;
             rangos[rango]++;
        }
        System.out.println("Grafico de notas: ");
        System.out.println();
        for ( int i = 0; i < rangos.length; i++){
            int inicio = i * 10;
            int fin = inicio + 9;
            String barra = "*".repeat(rangos[i]);

            System.out.println(inicio + " - " + fin + ": " + barra);
        }
        
    }
    
    public static void calcularEstadisticas(int[] valores) {
        int max = valores[0];
        int min = valores[0];
        int suma = valores[0];
        
        for (int i = 1; i < valores.length; i++) {
            if (valores[i] > max) {
                max = valores[i];
            }
            if (valores[i] < min) {
                min = valores[i];
            }
            suma += valores[i];
        }
        
        double promedio = (double) suma / valores.length;
        
        System.out.println("Nota más alta: " + max);
        System.out.println("Nota más baja: " + min);
        System.out.println("Promedio general de notas: " + promedio);
    }
}

       
