package Practica1;

// Press Shift twice to open the Search Everywhere dialog and type `show whitespaces`,
// then press Enter. You can now see whitespace characters in your code.
public class Main {
    public static void main(String[] args) {
        //creamos 3 objetos de la clase alumno
        alumno alumno1 = new alumno("Pepe" , "Gomez", 23, "Pso Castellana, 123", "pepe@hotmail.com");
        alumno1.imprimir();

        alumno alumno2 = new alumno("Lucia", "Garcia", 21, "Gran Via, 13", "lucia@gmail.com");
        alumno2.imprimir();
    }
}