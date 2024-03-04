package Ejercicio2;

public class Vehiculo {
    protected String matricula;
    protected String color;
    protected int nSerie;

    //constructores
    public Vehiculo(){
    }
    public Vehiculo(String matricula, String color, int nSerie){
        this.matricula=matricula;
        this.color=color;
        this.nSerie=nSerie;
    }

    //Método mostrar datos
    public void mostrarDatos(){
        System.out.println("Matrícula: " +matricula);
        System.out.println("Color: "+color);
        System.out.println("Número de serie: "+nSerie);
    }
}
