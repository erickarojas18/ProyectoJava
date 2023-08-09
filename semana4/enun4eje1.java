/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package com.mycompany.semana4;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

public class enun4eje1{
    public static void main(String[] args) {
        List<String> detalleGastos = new ArrayList<>();
        List<Integer> montoGastos = new ArrayList<>();

      
        detalleGastos.add("Agua");
        detalleGastos.add("Luz");
        detalleGastos.add("Alquiler");

    
        montoGastos.add(10560);
        montoGastos.add(18670);
        montoGastos.add(200000);

     
        int gastoMasAlto = montoGastos.stream().max(Integer::compareTo).orElse(0);
        int gastoMasBajo = montoGastos.stream().min(Integer::compareTo).orElse(0);
        int indiceGastoMasAlto = montoGastos.indexOf(gastoMasAlto);
        int indiceGastoMasBajo = montoGastos.indexOf(gastoMasBajo);
        String detalleGastoMasAlto = detalleGastos.get(indiceGastoMasAlto);
        String detalleGastoMasBajo = detalleGastos.get(indiceGastoMasBajo);
        System.out.println("Gasto más alto: " + detalleGastoMasAlto + " - Monto: " + gastoMasAlto);
        System.out.println("Gasto más bajo: " + detalleGastoMasBajo + " - Monto: " + gastoMasBajo);

     
        int montoTotal = montoGastos.stream().reduce(0, Integer::sum);
        System.out.println("Monto total de gastos: " + montoTotal);

        System.out.println("Detalle de gastos:");
        for (int i = 0; i < detalleGastos.size(); i++) {
            String detalle = detalleGastos.get(i);
            int monto = montoGastos.get(i);
            System.out.println(detalle + " - Monto: " + monto);
        }
    }
}

    

