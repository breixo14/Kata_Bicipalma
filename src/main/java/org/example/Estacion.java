package org.example;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.List;

public class Estacion {
    public int id;
    public String direccion ;
    public int numeroAnclajes ;
    public List<Integer> anclajes ;

    public Estacion(int id, String direccion, int numeroAnclajes){
        this.id= id;
        this.direccion = direccion;
        this.numeroAnclajes = numeroAnclajes;
        this.anclajes = new ArrayList<>();
        for (int i = 0; i < numeroAnclajes; i++) {
            this.anclajes.add(0);
        }
    }

    public void consultarEstacion() {
        System.out.println(String.format("Estacion: %s, Direccion: %d, Numero Anclajes: %d", direccion, numeroAnclajes, id));
    }
    public Integer anclajesLibres(){
        return Collections.frequency(anclajes,0);
    }


}
