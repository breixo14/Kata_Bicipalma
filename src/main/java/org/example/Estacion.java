package org.example;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class Estacion {
    private int id;
    private String direccion ;
    private int numeroAnclajes ;
    private List<Integer> anclajes ;
    private boolean anclajeOcupado ;

    public Estacion(int id, String direccion, int numeroAnclajes){
        this.id= id;
        this.direccion = direccion;
        this.numeroAnclajes = numeroAnclajes;
        this.anclajes = new ArrayList<>();
        for (int i = 0; i < numeroAnclajes; i++) {
            this.anclajes.add(0);
        }
        this.anclajeOcupado = anclajeOcupado;
    }

    public void consultarEstacion() {
        System.out.println(String.format("Estacion: %s, Direccion: %s, Numero Anclajes: %d", direccion, numeroAnclajes, id));
    }


    public Integer anclajesLibres(){
        return Collections.frequency(anclajes,0);
    }


    public Integer generarAnclaje(){
        return (int) (Math.random() * numeroAnclajes) + 1;
    }


    public void anclarBicicleta(Bicicleta bicicleta){
            for (int i = 0; i < numeroAnclajes; i++) {
                if (anclajes.get(i) == 0){
                    this.anclajes.set(i, bicicleta.getId());
                    System.out.println(String.format("Bicicleta:%d Anclada en el anclaje:%d",bicicleta.getId(),i+1));
                    return;
                }
            }
    }
    public void consultarAnclajes(){
        for (int i = 0; i < numeroAnclajes; i++) {
            if (anclajes.get(i) != 0){
                System.out.println(String.format("Anclaje %d %d",i+1,anclajes.get(i)));

            }
            else {
                System.out.println(String.format("Anclaje %d %s",i+1,"libre"));

            }
        }
    };

    public void retirarBicicleta(TarjetaUsuario tarjetaUsuario) {
        for (int i = 0; i  TarjetaUsuario.getId(tarjetaUsuario); i++) {
            if (anclajes.get(i) == 0){
                this.anclajes.set(i, TarjetaUsuario tarjetaUsuario.id());
                System.out.println(String.format("Bicicleta:%d Anclada en el anclaje:%d",bicicleta.getId(),i+1));
                return;
            }
        }
    }
}


