package org.example;

public class TarjetaUsuario {
    private static String id;
    private boolean activo=false;
    public TarjetaUsuario(String id, boolean activo){
        this.id = id;
        this.activo = activo;
    }
    public static boolean tarjetaActiva(TarjetaUsuario tarjetaUsuario){
        return tarjetaUsuario.activo;
    }
    public static String  leerTarjetaUsuario(TarjetaUsuario tarjetaUsuario){
        if (tarjetaActiva(tarjetaUsuario)){
            return "true";
        }
        else {
            return "false";
        }
    }
    public static int getId(TarjetaUsuario tarjetaUsuario) {
        return Integer.parseInt(id);
    }

}
