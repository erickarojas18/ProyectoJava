/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package com.mycompany.semana4;
import java.util.Arrays;
import java.util.stream.Stream;
public class enun4eje2 {
    
    public static void main(String[] args) {
   
        Stream<String> nombresStream = Stream.of("Juan", "María", "Pedro", "Elena", "Luisa", "Carlos");

       
        String[] nombresFiltrados = nombresStream
                .filter(nombre -> nombre.toLowerCase().contains("e"))
                .toArray(String[]::new);

  
        System.out.println("Nombres con la vocal 'e':");
        for (String nombre : nombresFiltrados) {
            System.out.println(nombre);
        }
    }
}

