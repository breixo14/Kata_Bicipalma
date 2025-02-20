package org.example;


import org.example.Estacion;
import org.example.Bicicleta;

public class BiciPalma {
    public static void main(String[] args) {

        Estacion estacion = new Estacion(1, "Manacor", 6);

        /* caso TEST visualizar estado de la estacion
         * muestra id, direccion, anclaje
         * */

        System.out.println("\n **** caso TEST visualizar estado de la estacion **** \n");

        estacion.consultarEstacion();


        /* caso TEST visualizar anclajes libres */
        System.out.println("\n **** caso TEST visualizar anclajes libres **** \n");

        System.out.println("anclajesLibres: " + estacion.anclajesLibres());

        /* caso TEST anclar bicicleta(s) */

        System.out.println("\n **** caso TEST anclar bicicleta(s) **** \n");

        int[] bicicletas = {291, 292, 293, 294};


		for (int i: bicicletas){
			System.out.println( estacion.generarAnclaje());
		}


        for ( int id: bicicletas ){
            Bicicleta bicicleta = new Bicicleta(id);
            estacion.anclarBicicleta(bicicleta);
        }

        System.out.println("anclajesLibres tras generar "+ bicicletas.length + " bicis: " + estacion.anclajesLibres());
}
}
