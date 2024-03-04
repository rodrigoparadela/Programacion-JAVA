package Ejercicio2;

public class Avion extends Vehiculo{
    private String compañia;
    private String modelo;

    public Avion(){
    }
    public Avion(String matricula, String color, int nSerie, String compañia, String modelo){
        super(matricula,color,nSerie);
        this.compañia=compañia;
        this.modelo=modelo;
    }

    @Override
    public void mostrarDatos() {
        super.mostrarDatos();
        System.out.println("Compañia: "+compañia);
        System.out.println("Modelo: "+modelo);
        System.out.println();
    }
}
