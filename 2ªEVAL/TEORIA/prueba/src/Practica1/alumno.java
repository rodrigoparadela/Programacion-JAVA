package Practica1;

public class alumno {

    //Creamos las propiedades de la clase
    String nombre;
    String apellidos;
    int edad;
    String domicilio;
    String email;

    //crear una función constructora
    public alumno(String nombre, String apellidos, int edad, String domicilio, String email){
        //ahora asociamos el valor que recibe el constructor a la propiedad en cuestión
        this.nombre=nombre;
        this.apellidos=apellidos;
        this.edad= edad;
        this.domicilio=domicilio;
        this.email=email;

    }
    public void imprimir(){
        System.out.println("El nombre es: "+ nombre);
        System.out.println("Apellidos: " + apellidos);
        System.out.println("Edad: " + edad);
        System.out.println("Domicilio: " + domicilio);
        System.out.println("Email: " + email);
    }

}
