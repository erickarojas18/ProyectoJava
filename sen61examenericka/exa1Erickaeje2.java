
package com.mycompany.sen61examenericka;
        
import java.util.ArrayList;
import java.util.Random;
import java.util.Scanner;

public class exa1Erickaeje2 {
    ArrayList<Integer> arrayList;

    public static void main(String[] args) {
        exa1Erickaeje2 programa = new exa1Erickaeje2();
        programa.mostrarMenu();
    }

    public exa1Erickaeje2() {
        arrayList = new ArrayList<>();
        Random random = new Random();
        for (int i = 0; i < 10; i++) {
            arrayList.add(random.nextInt(100));
        }
    }

    public void mostrarMenu() {
        Scanner scanner = new Scanner(System.in);
        int opcion = 0;

        while (opcion != 2) {
            System.out.println("\nMenú de opciones:");
            System.out.println("1. Borrar elemento del ArrayList");
            System.out.println("2. Salir");
            System.out.print("Ingrese el número de la opción deseada: ");
            opcion = scanner.nextInt();

            switch (opcion) {
                case 1:
                    borrarElemento(scanner);
                    break;
                case 2:
                    System.out.println("¡Hasta luego!");
                    break;
                default:
                    System.out.println("Opción inválida. Por favor, intente nuevamente.");
                    break;
            }
        }

        scanner.close();
    }

    public void borrarElemento(Scanner scanner) {
        System.out.println("\nArray inicial: " + arrayList.toString());

        System.out.print("Introduce el número que quieres borrar: ");
        int numeroBorrar = scanner.nextInt();

        if (!arrayList.contains(numeroBorrar)) {
            System.out.println("El valor no existe en el array.");
        } else {
            System.out.println("Elemento a borrar: " + numeroBorrar);

            for (int i = 0; i < arrayList.size(); i++) {
                if (arrayList.get(i) == numeroBorrar) {
                    arrayList.remove(i);
                    i--;
                }
            }

            System.out.println("Array final: " + arrayList.toString());
        }
    }
}


    
    

