package PracticaArrays;

public class Ejercicio4 {
    public static void main(String[] args){
        /*4.Diseña un array con los números del 1-57, se debe mostrar el número de celdas que
            contienen números pares y el número de celdas que contienen números impares*/

        //Creamos el array
        int array[]=new int[57];
        for (int cont=0; cont<57;cont++){
            array[cont]=cont+1;
        }

        //lo mostramos por pantalla

        System.out.println("El array es:");
        for (int cont=0; cont<57;cont++){
            System.out.print(array[cont]+" ");
        }
        System.out.println();

        //Mostramos la cantidad de números pares e impares

        int pares = 0;
        int impares=0;
        double res;

        for (int cont=0;cont<57;cont++){
            res = array[cont]%2;
            if (res==0){
                pares++;
            }
            else{
                impares++;
            }
        }
        System.out.println("La cantidad de números pares es: "+pares);
        System.out.println("Y la cantidad de impares es: "+impares);



    }
}
