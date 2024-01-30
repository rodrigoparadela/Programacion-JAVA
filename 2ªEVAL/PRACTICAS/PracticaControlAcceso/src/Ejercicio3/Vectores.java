package Ejercicio3;

public class Vectores {
    int vectorA;
    int vectorB;

    public Vectores(){
    }
    public int generarVectores(){
        vectorA=(int) (Math.random()*20)-1;
        return vectorA;
    }
    public int calcularC(int vectorA,int vectorB){
        return vectorA+vectorB;
    }
    public void mostrarVectores(int[] vector){
        for (int cont=0;cont<vector.length-1;cont++){
            System.out.print(vector[cont]+" - ");
        }
        System.out.println(vector[vector.length-1]);
    }
    


}
