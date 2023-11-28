package PracticaArrayListII;

import java.util.ArrayList;
import java.util.Scanner;

public class Ejercicio2 {
    public static void main(String[] args){
        /*2.Diseña un programa que almacena n números aleatorios, positivos. Se pide:

                 Imprimir todos los valores del arraylist
                 Mostrar cual es el primer valor
                 Mostrar el último valor
                 Se pide por pantalla al usuario si desea almacenar algún valor, si teclea si, se almacena
                   el valor tecleado en el arralist.*/

        //Creamos el arrayList y añadimos n valores aleatorios.
        ArrayList<Integer> numeros = new ArrayList<Integer>();
        int aleatorio, tamaño, numGuardado;
        String respuesta;
        Scanner datosp = new Scanner(System.in);

        System.out.println("Dime el tamaño del arrayList que quieras.");
        tamaño=datosp.nextInt();
        for (int cont=0;cont<tamaño;cont++){
            aleatorio = (int) (Math.random()*100);
            numeros.add(aleatorio);
        }

        //Imprimimos los valores del arrayList.
        for (int cont=0;cont<tamaño-1;cont++){
            System.out.print(numeros.get(cont)+" - ");
        }
        System.out.println(numeros.get(tamaño-1));

        //Mostramos el primer y último valor
        System.out.println("El primer valor del arrayList es: "+numeros.get(0));
        System.out.println("El último valor del arrayList es: "+numeros.get(tamaño-1));

        //Preguntamos y guardamos el valor por pantalla en caso de si.
        System.out.println("Desea guardar algún valor? (si/no)");
        respuesta=datosp.next();
        if (respuesta.equals("si")){
            System.out.println("Dime el valor que quieras guardar");
            numGuardado=datosp.nextInt();
            numeros.add(numGuardado);
        }
        else{
            System.out.println("No se guarda ningún valor");
        }


    }
}
