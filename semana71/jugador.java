
package com.mycompany.semana71;
import java.util.Random;

public class jugador {
    private String nombre;
    private String estado;
    private int energia;
    private int fuerza;
    
    public jugador(String nom,int fuer){
        this.nombre = nom;
        this.estado = "En guardia";
        this.energia = 1000;
        this.fuerza = fuer;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getEstado() {
        return estado;
    }

    public void setEstado(String estado) {
        this.estado = estado;
    }

    public int getEnergia() {
        return energia;
    }

    public void setEnergia(int energia) {
        this.energia = energia;
    }

    public int getFuerza() {
        return fuerza;
    }

    public void setFuerza(int fuerza) {
        this.fuerza = fuerza;
    }
    
    public void atacar(jugador oponente){
        Random rand = new Random();
        int fuerzaAtaq = rand.nextInt(51);
        oponente.recibirDaño(fuerzaAtaq);
        System.out.println(nombre+" atacó a "+oponente.getNombre()+" y el daño fue de: "+fuerzaAtaq +"!");
    }
    public void recibirDaño(int daño){
        energia -=daño;
        if (energia <=0){
            estado = "Derrotado";
        }
    }
}
