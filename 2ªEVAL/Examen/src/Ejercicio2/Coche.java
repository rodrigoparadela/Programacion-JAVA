package Ejercicio2;

public class Coche extends Vehiculo{
    private String marca;
    private String modelo;

    //constructores
    public Coche(){
    }
    public Coche(String matricula, String color, int nSerie, String marca, String modelo){
        super(matricula,color,nSerie);
        this.marca=marca;
        this.modelo=modelo;
    }

    @Override
    public void mostrarDatos() {
        super.mostrarDatos();
        System.out.println("Marca: "+marca);
        System.out.println("Modelo: "+modelo);
        System.out.println();
    }
}
