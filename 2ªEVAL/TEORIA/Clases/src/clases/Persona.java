package clases;

public class Persona {
    String nombre;
    String apellidos;
    int edad;
    String email;

    //No tiene constructor, creamos una función para mostrarlo
    public void imprimir_datos(){
        System.out.println("Nombre: "+nombre);
        System.out.println("Apellidos: "+apellidos);
        System.out.println("Edad: "+edad);
    }

}
