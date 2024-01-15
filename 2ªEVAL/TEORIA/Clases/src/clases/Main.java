package clases;

import paquete2.Provincia;

// Press Shift twice to open the Search Everywhere dialog and type `show whitespaces`,
// then press Enter. You can now see whitespace characters in your code.
public class Main {
    public static void main(String[] args) {

        //Creamos la clase para poder usar todas sus funciones.
        Persona miclase1=new Persona();

        //No hay función constructora, asique tenemos que añadir los datos directamente.
        miclase1.nombre="Rodrigo";
        miclase1.apellidos="Paradela";
        miclase1.edad=19;
        miclase1.email="rodrigoparadela@gmail.com";

        //Llamamos a la función
        miclase1.imprimir_datos();

        //Creamos un objeto del tipo animal
        Animal mibicho=new Animal("toby", "perro", "yorksite", "1,5 kg", "2015");

        //creamos la instancia de la clase provincia
        Provincia miprovincia=new Provincia("Comunidad de Madrid","Madrid");


    }
}