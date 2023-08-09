/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package com.mycompany.semana4;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class enun5eje1 {

   
    public static void main(String[] args) {{
        List<String> nombres = new ArrayList<>();
        nombres.add("Santiago");
        nombres.add("Sebastian");
        nombres.add("Cristina");
        nombres.add("Facundo");
        nombres.add("Beatriz");
        nombres.add("Mariana");
        nombres.add("Fernando");

        // Imprimir el ArrayList utilizando Iterator
        System.out.println("ArrayList original:");
        Iterator<String> iterator = nombres.iterator();
        while (iterator.hasNext()) {
            System.out.println(iterator.next());
        }

        // Eliminar un elemento del ArrayList utilizando Iterator
        iterator = nombres.iterator();
        while (iterator.hasNext()) {
            if (iterator.next().equals("Cristina")) {
                iterator.remove();
                break;
            }
        }

        // Imprimir el ArrayList después de eliminar el elemento
        System.out.println("\nArrayList después de eliminar un elemento:");
        for (String nombre : nombres) {
            System.out.println(nombre);
        }

        // Filtrar nombres con menos de 7 letras utilizando Filter
        System.out.println("\nNombres con menos de 7 letras:");
        nombres.stream()
                .filter(nombre -> nombre.length() < 7)
                .forEach(System.out::println);

        // Filtrar nombres con 3 letras utilizando Filter
        System.out.println("\nNombres con 3 letras:");
        nombres.stream()
                .filter(nombre -> nombre.length() == 3)
                .forEach(System.out::println);
    }
}
}

