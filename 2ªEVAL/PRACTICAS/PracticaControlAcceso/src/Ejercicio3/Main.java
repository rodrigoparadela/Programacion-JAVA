package Ejercicio3;

public class Main {
    public static void main(String[] args){
        //Generamos los dos primeros vectores
        int[] vectorA = new int[20];
        int[] vectorB = new int[20];
        int[] vectorC = new int[20];
        Vectores num1= new Vectores();
        int num, num2;
        //llenamos los dos primeros vectores
        for (int cont=0;cont<vectorA.length;cont++){
            vectorA[cont] = num1.generarVectores();
        }
        for (int cont=0;cont<vectorB.length;cont++){
            vectorB[cont]=num1.generarVectores();
        }
        //calculamos el vector c
        for (int cont=0;cont<vectorC.length;cont++){
            num=vectorA[cont];
            num2=vectorB[cont];
            vectorC[cont] = num1.calcularC(num,num2);
        }
        //Mostramos los vectores
        System.out.println("Vector A:");
        num1.mostrarVectores(vectorA);
        System.out.println("Vector B:");
        num1.mostrarVectores(vectorB);
        System.out.println("Vector C:");
        num1.mostrarVectores(vectorC);



    }
}
