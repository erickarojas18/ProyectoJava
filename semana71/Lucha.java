
package com.mycompany.semana71;

import java.util.Scanner;
public class Lucha {
    //Alison Alfaro Arias y Ericka Rojas Borge.

    public static void main(String[] args) {
        
        Scanner scanner= new Scanner(System.in);

        System.out.print("Nombre del Jugador 1: ");
        String nombreJugador1 = scanner.nextLine();
        System.out.print("Nombre del Jugador 2: ");
        String nombreJugador2 = scanner.nextLine();

        System.out.print("Fuerza del Jugador 1 (1-5): ");
        int fuerzaJugador1 = scanner.nextInt();
        System.out.print("Fuerza del Jugador 2 (1-5): ");
        int fuerzaJugador2 = scanner.nextInt();
        System.out.println("--------------------------------------------------------------------------------");
        jugador jugador1 = new jugador(nombreJugador1, fuerzaJugador1);
        jugador jugador2 = new jugador(nombreJugador2, fuerzaJugador2);

        while (jugador1.getEnergia() > 0 && jugador2.getEnergia() > 0) {
            jugador1.atacar(jugador2);
            jugador2.atacar(jugador1);

            System.out.println("La energía del jugador 1 " + jugador1.getNombre() + " es " + jugador1.getEnergia());

            System.out.println("La energía del jugador 2 " + jugador2.getNombre() + " es " + jugador2.getEnergia());
            System.out.println("--------------------------------------------------------------------------------");
        }
            
        if (jugador1.getEnergia() <= 0) {
            System.out.println("¡" + jugador1.getNombre() + " ha sido derrotado!");
        } else {
            System.out.println("¡" + jugador2.getNombre() + " ha sido derrotado!");
        }

        System.out.println("Nivel de energía de " + jugador1.getNombre() + ": " + jugador1.getEnergia());
        System.out.println("Nivel de energía de " + jugador2.getNombre() + ": " + jugador2.getEnergia());
        System.out.println("--------------------------------------------------------------------------------");
        scanner.close();
    }
}

 

