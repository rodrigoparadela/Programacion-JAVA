package Ejercicio2;

public class TestVehiculos {
    public static void main(String[] args){
        Coche coche1=new Coche("5863 ADG","Blanco",9783874,"Citroen","c15");
        coche1.mostrarDatos();
        Barco barco1=new Barco("45648 HGG", "Azul", 466545, "Santa Ana", 100);
        barco1.mostrarDatos();
        Avion avion1=new Avion("46545654 LKJ", "Verde", 788465, "Iberia", "Boeing 737");
        avion1.mostrarDatos();
        Tren tren1=new Tren("45454 LMN", "Negro", 9874664, "AVE", true);
        tren1.mostrarDatos();


    }
}
