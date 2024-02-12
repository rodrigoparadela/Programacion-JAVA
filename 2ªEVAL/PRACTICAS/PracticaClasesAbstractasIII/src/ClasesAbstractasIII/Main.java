package ClasesAbstractasIII;

public class Main {
    public static void main(String[] args) {
        //Creamos un objeto animal
        Animal miAnimal=new Animal("Chewie", "Perro", 2019,"Rodrigo");
        //Calculamos la edad con el método edad
        miAnimal.edad();
        //Mostramos los datos
        miAnimal.datosAnimal();
    }
}