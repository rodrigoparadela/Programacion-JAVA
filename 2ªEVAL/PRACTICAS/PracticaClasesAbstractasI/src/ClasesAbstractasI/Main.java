package ClasesAbstractasI;

public class Main {
    public static void main(String[] args) {
        //Me creo un objeto de la clase planta
        Planta miPlanta = new Planta("Manzano",60);
        //Mostramos las propiedades
        System.out.println("Nombre: "+miPlanta.getNombre());
        System.out.println("Altura: "+miPlanta.getAltura());
        //utilizamos el metodo sistema de riego
        System.out.println("Riego: "+miPlanta.sistemaDeRiego("exterior"));


    }
}