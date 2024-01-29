package Ejercicio2;

public class Vector {


    public void mostrarDerecho(int[] vector){
        System.out.println("El vector del derecho es: ");
        for (int cont=0;cont<vector.length-1;cont++){
            System.out.print(vector[cont]+" - ");
        }
        System.out.println(vector[vector.length-1]);
    }
    public void mostrarReves(int[] vector){
        System.out.println("El vector del revés es: ");
        for (int cont=vector.length-1;cont>0;cont--){
            System.out.print(vector[cont]+" - ");
        }
        System.out.println(vector[0]);
    }





}
