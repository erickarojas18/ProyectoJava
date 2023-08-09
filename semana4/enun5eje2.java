/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package com.mycompany.semana4;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class enun5eje2 {
    
    public static void main(String[] args) {
        List<Integer> numeros = Arrays.asList(5, 10, 3, 8, 15, 1, 12, 6, 4, 9);

        int valorMinimo = calcularValorMinimo(numeros);
        int valorMaximo = calcularValorMaximo(numeros);

        System.out.println("Valor mínimo: " + valorMinimo);
        System.out.println("Valor máximo: " + valorMaximo);
    }

    public static int calcularValorMinimo(List<Integer> numeros) {
        return numeros.stream()
                .reduce(Integer.MAX_VALUE, Integer::min);
    }

    public static int calcularValorMaximo(List<Integer> numeros) {
        return numeros.stream()
                .reduce(Integer.MIN_VALUE, Integer::max);
    }
}

    
    

