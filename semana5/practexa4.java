/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package com.mycompany.semana5;
import java.util.Scanner;

public class practexa4 {
    public static void main(String[] args) {
        String turno = "X";
        String[][] tablero = {{"-", "-", "-"}, {"-", "-", "-"}, {"-", "-", "-"}};

        while (true) {
            System.out.println("Turno del jugador " + turno);

            int fila = leerInt("Introduce la fila: ", 0, 2);
            int columna = leerInt("Introduce la columna: ", 0, 2);

            if (tablero[fila][columna].equals("-")) {
                tablero[fila][columna] = turno;
            } else {
                System.out.println("La casilla ya está ocupada.");
                continue;
            }

            mostrarTablero(tablero);

            if (comprobarGanador(tablero, turno)) {
                System.out.println("El jugador " + turno + " ha ganado!");
                break;
            }

            if (turno.equals("X")) {
                turno = "O";
            } else {
                turno = "X";
            }
        }
    }

    public static void mostrarTablero(String[][] tablero) {
        for (String[] fila : tablero) {
            for (String posicion : fila) {
                System.out.print(posicion + " ");
            }
            System.out.println();
        }
    }

    public static int leerInt(String mensaje, int min, int max) {
        Scanner sc = new Scanner(System.in);
        System.out.println(mensaje);
        int numero = sc.nextInt();
        while (numero < min || numero > max) {
            System.out.println("El número debe estar entre " + min + " y " + max);
            numero = sc.nextInt();
        }
        return numero;
    }

    public static boolean comprobarGanador(String[][] tablero, String turno) {
        // Comprobar filas
        for (int i = 0; i < 3; i++) {
            if (tablero[i][0].equals(turno) && tablero[i][1].equals(turno) && tablero[i][2].equals(turno)) {
                return true;
            }
        }

        // Comprobar columnas
        for (int j = 0; j < 3; j++) {
            if (tablero[0][j].equals(turno) && tablero[1][j].equals(turno) && tablero[2][j].equals(turno)) {
                return true;
            }
        }

        // Comprobar diagonales
        if (tablero[0][0].equals(turno) && tablero[1][1].equals(turno) && tablero[2][2].equals(turno)) {
            return true;
        }

        if (tablero[0][2].equals(turno) && tablero[1][1].equals(turno) && tablero[2][0].equals(turno)) {
            return true;
        }

        return false;
    }
}

