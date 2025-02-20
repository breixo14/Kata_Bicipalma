package org.example;
import org.example.Bicicleta;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.List;

public class Estacion {
    private int id;
    private String direccion ;
    private int numeroAnclajes ;
    private List<Integer> anclajes ;

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
    public Integer generarAnclaje(){
        return (int) (Math.random() * numeroAnclajes) + 1;
    }
    public void anclarBicleta(){
            for (int i = 0; i < numeroAnclajes; i++) {
                if (i == 0){

                }
            }
    }

    }

}
