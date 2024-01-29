package Ejercicio3;

public class Vectores {
    int[] vectorA = new int[20];
    int[] vectorB = new int[20];

    public Vectores(int[] vectorA, int[] vectorB){
        this.vectorA=vectorA;
        this.vectorB=vectorB;
    }
    public int[] generarVectores(){
        int[] vector=new int[20];
        for (int cont=0;cont<vector.length;cont++){
            vector[cont]=(int) (Math.random()*20)-1;
        }
        return vector;
    }
    public int[] generarC(){
        int[] vector=new int[20];
        for (int cont=0;cont<vector.length;cont++){
            vector[cont]=vectorA[cont]-vectorB[cont];
        }
        return vector;
    }
    


}
