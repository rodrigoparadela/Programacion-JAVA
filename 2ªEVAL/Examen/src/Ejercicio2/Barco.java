package Ejercicio2;

public class Barco extends Vehiculo{
    private String nombre;
    private int mEslora;

    public Barco(){
    }
    public Barco(String matricula, String color, int nSerie, String nombre, int mEslora){
        super(matricula,color,nSerie);
        this.nombre=nombre;
        this.mEslora=mEslora;
    }

    @Override
    public void mostrarDatos() {
        super.mostrarDatos();
        System.out.println("Nombre: "+nombre);
        System.out.println("Metros de eslora: "+mEslora);
        System.out.println();
    }
}
