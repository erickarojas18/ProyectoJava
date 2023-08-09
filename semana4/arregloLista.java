/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package com.mycompany.semana4;
//import java.util.*;

import java.util.ArrayList;
import java.util.Scanner;

public class arregloLista {
    
    public static Scanner leer = new Scanner(System.in);
    public static void main(String[] args) {
        ArrayList<String>personas= new ArrayList<String>();
        personas=llena(personas);
        System.out.println(personas);
        imprime(personas);
    
    }// fin main
     static String pideValor(String mensaje){
        System.out.println(mensaje);
        return leer.next();
    }
     static ArrayList<String>llena(ArrayList<String>pers){
         int total=5;
         for(int i =0;i <total;i++){
            String nom=pideValor("Digiteun nombre....");
            pers.add(nom);
         }
         
         return pers;
     }
     static void imprime(ArrayList<String>pers){
         for ( int i =0;i<=pers.size()-1;i++){
             System.out.println(i+"-->"+pers.get(i));
         }
     }
    
}
