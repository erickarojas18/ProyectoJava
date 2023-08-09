
package com.mycompany.semana5;
import java.util.Scanner;
import java.util.LinkedList;
import java.util.Random;

public class ejemploColas {

   
    public static void main(String[] args) {
        LinkedList<Integer> cola= new   LinkedList<Integer>();
        //LLENAR COLA
        for( int i=1;i<11;i++){
            cola.offer(i);
    }
        //imprimir
        System.out.println(cola);
        //mostrar y extraer
        
        while(cola.peek() != null){
            System.out.print(cola.poll()+" - ");
        }
        System.out.println(" ");
    }
    
}
