/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package com.mycompany.ejercicoclase2;
import java.util.Scanner;
public class practica1 {

    public static void main(String[] args) {
        Scanner leer = new Scanner(System.in);
        System.out.println("Digite un numero entero de dos cifras : ");
        int numeroscifra=leer.nextInt();
        int numeroInvertido=invertirNumero(numeroscifra);
        System.out.println("El numeros invertido es : "+numeroInvertido);
        
        System.out.println("Digite un numero entero de tres cifras : ");
        int numero3=leer.nextInt();
        int numeroInvertido3=invertirNumero(numero3);
        System.out.println("El numeros invertido es : "+numeroInvertido3);

        System.out.println("Digite dos números: ");
        int a, b;
        System.out.println("Digite el valor para A: ");
        a = leer.nextInt();
        System.out.println("Digite el valor para B: ");
        b = leer.nextInt();

        int resultado = formula(a, b);
        System.out.println("El resultado de la primera formula es : " + resultado);
        
        formula2(a, b);
        System.out.println("Digite un monto: ");
        int monto=leer.nextInt();
        billetes(monto);
    }
     public static int invertirNumero(int numero) {
        String numeroStr = String.valueOf(numero);
        String numeroInvertidoStr = new StringBuilder(numeroStr).reverse().toString();
        int numeroInvertido = Integer.parseInt(numeroInvertidoStr);
        
        return numeroInvertido;
     }
           
        public static int formula(int a, int b) {
        return (a + b) * (a - b);
    }
    
    public static void formula2(int a, int b) {
        int resultadoformula2 = (a * a * b) - (a + b * b);
        System.out.println("El resultado es: " + resultadoformula2);
    }
    public static void billetes(int monto) {
        int[] denominaciones = {100, 50, 20, 10, 5, 1};
        
        System.out.println("Desglose de billetes:");
        
        for (int i = 0; i < denominaciones.length; i++) {
            int cantidad = monto / denominaciones[i];
            System.out.println("Digite los billetes");
            System.out.println("Billetes de $" + denominaciones[i] + " = " + cantidad);
             monto = monto % denominaciones[i];
        }       
    }
}



