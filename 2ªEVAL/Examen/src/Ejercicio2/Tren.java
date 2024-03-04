package Ejercicio2;

public class Tren extends Vehiculo{
    private String modelo;
    private boolean altaVelocidad;

    public Tren(){
    }
    public Tren(String matricula, String color, int nSerie, String modelo, boolean altaVelocidad){
        super(matricula,color,nSerie);
        this.modelo=modelo;
        this.altaVelocidad=altaVelocidad;
    }

    @Override
    public void mostrarDatos() {
        super.mostrarDatos();
        System.out.println("Modelo: " + modelo);
        System.out.println("Alta Velocidad: "+altaVelocidad);
        System.out.println();
    }
}
