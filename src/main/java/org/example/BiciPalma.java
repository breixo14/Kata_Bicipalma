package org.example;


import org.example.Estacion;
import org.example.Bicicleta;
import org.example.TarjetaUsuario;

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


        for ( int id: bicicletas ){
            Bicicleta bicicleta = new Bicicleta(id);
            estacion.anclarBicicleta(bicicleta);
        }

        System.out.println("anclajesLibres tras generar "+ bicicletas.length + " bicis: " + estacion.anclajesLibres());


        /* caso TEST consultar bicicletas ancladas */

        System.out.println("\n **** caso TEST consultar bicicletas ancladas **** \n");
        estacion.consultarAnclajes();

        /* caso TEST retirar bicicleta */

        System.out.println("\n **** caso TEST retirar bicicleta **** \n");

        TarjetaUsuario tarjetaUsuario = new TarjetaUsuario("000456789", true);

        System.out.println("¿tarjeta de usuario activada? (true/false): " + TarjetaUsuario.leerTarjetaUsuario(tarjetaUsuario) );

        Bicicleta bici = new Bicicleta(bicicletas[0]);
        estacion.retirarBicicleta(bici);

        estacion.consultarAnclajes();

        System.out.println("anclajesLibres: " + estacion.anclajesLibres());

}
}
