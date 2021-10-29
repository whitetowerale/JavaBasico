package com.sesion2;

public class EjercicioSesion2 {
    /*
        Para este ejercicio tendreis que crear una función que reciba
        un precio y devuelva el precio con el IVA incluido
     */

    private static float PrecioConIva (float precio){
        float precioConIva = 0.0f;
        precioConIva = precio * 1.21f;
        return precioConIva;
    }

    public static void main(String[] args) {
        float precio = 15.25f;
        float precioConIva = 0f;
        precioConIva = PrecioConIva(precio);
        System.out.println("El precio con iva de " + precio + " es: " + precioConIva);
    }

}
