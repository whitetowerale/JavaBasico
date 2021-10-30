package com.S3EstructurasDeControl;

public class EjercicioSesion3 {

    public static void main(String[] args) {
        /*
            En este ejercico teneis que crear un bucle que permita
            concatenar textos e imprima el resultado por consola.

            Tened en cuenta que los textos pueden venir de un array
            tipo String.

            Por ejemplo: String = {"", "", ""}
         */
            String names[] = {"Mavi", "Luisa", "Gonzalo", "Moises", "Natalia"};
            String allnames = "";
            for (String name:names){
                allnames = allnames + name + " ";
            }
        System.out.println(allnames);

    }
}
