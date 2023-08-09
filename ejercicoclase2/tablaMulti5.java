/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package com.mycompany.ejercicoclase2;
import java.util.Scanner;
public class tablaMulti5 {
    
    public static void main(String[] args) {
        Scanner scanner=new Scanner(System.in);
        
        System.out.println("Ingrese un numero del 1 al 9 ");
        int numero = scanner.nextInt();
        
        System.out.println("Tabla de multiplicar de "+numero+":");
        
        for(int i =1; i<=10; i++){
            int resultado=numero*i;
            System.out.println(numero+"x"+i+"="+resultado);
            
        }
        
        scanner.close();
        
    }
    
}
