package clases;

public class Animal {

    String nombre;
    String tipo;
    String raza;
    String peso;
    String nacimiento;

    //Función constructora
    public Animal(String nombre,String tipo,String raza,String peso,String nacimiento){
        this.nombre=nombre;
        this.tipo=tipo;
        this.raza=raza;
        this.peso=peso;
        this.nacimiento=nacimiento;

        System.out.println("La clase se ha creado correctamente");
    }
}
