package org.example;

import java.util.ArrayList;
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
    }

    public String consultarEstacion() {
        return String.format("Estacion: %s, Direccion: %d, Numero Anclajes: %d", direccion, numeroAnclajes, id);
    }
}
