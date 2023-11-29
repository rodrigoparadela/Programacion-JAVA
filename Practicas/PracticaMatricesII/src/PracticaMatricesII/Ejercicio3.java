package PracticaMatricesII;

import java.util.Scanner;

public class Ejercicio3 {
    public static void main(String[] args){
        /*3. Nos piden crear una matriz de 4×4 de números enteros que inicialmente esta vacía, nos
             piden hacer un menú con estas opciones:

              Rellenar TODA la matriz de números, debes pedírselo al usuario.
              Suma de una fila que se pedirá al usuario (controlar que elija una correcta)
              Suma de una columna que se pedirá al usuario (controlar que elija una correcta)
              Sumar la diagonal principal (ver ejemplo)
              Sumar la diagonal inversa (ver ejemplo)
              La media de todos los valores de la matriz

             IMPORTANTE: hasta que no se haga la primera opción, el resto de opciones no se deberán de
             ejecutar, simplemente mostrar un mensaje donde diga que debes rellenar la matriz.*/

        //Creamos la matriz de 4x4
        int[][] numeros=new int[4][4];
        int opcion,num,fila_columna;
        double media;
        boolean primeraOpcion=false;
        Scanner datosp=new Scanner(System.in);
        //Realizamos el menú
        do{
            num=0;
            System.out.println("Seleccione una opción: ");
            System.out.println("1.Rellenar la Matriz");
            System.out.println("2.Suma de una fila");
            System.out.println("3.Suma de una columna");
            System.out.println("4.Sumar la diagonal principal");
            System.out.println("5.Sumar la diagonal inversa");
            System.out.println("6.Media de todos los valores");
            System.out.println("7.Mostrar la matriz");
            System.out.println("8.Salir.");
            opcion=datosp.nextInt();

            //Realizamos un switch para cada opcion.
            switch (opcion){
                case 1:
                    primeraOpcion=true;
                    for (int i=0;i<numeros.length;i++){
                        for (int j=0;j<numeros[i].length;j++){
                            System.out.print("Añada valor: ");
                            num=datosp.nextInt();
                            numeros[i][j]=num;
                        }
                    }
                    break;
                case 2:
                    if (primeraOpcion){
                        System.out.print("Dime la fila que quieras sumar: ");
                        fila_columna=datosp.nextInt()-1;
                        for (int cont=0; cont<numeros[fila_columna].length;cont++){
                            num=num+numeros[fila_columna][cont];
                        }
                        System.out.println("La suma de la fila entera es: "+num);
                    }
                    else{
                        System.out.println("Debes rellenar la matriz.");
                    }
                    break;
                case 3:
                    if (primeraOpcion){
                        System.out.print("Dime la columna que quieras sumar: ");
                        fila_columna=datosp.nextInt()-1;
                        for (int cont=0;cont<numeros.length;cont++){
                            num=num+numeros[cont][fila_columna];
                        }
                        System.out.println("La suma de la columna es: "+num);

                    }
                    else {
                        System.out.println("Debes rellenar la matriz.");
                    }
                    break;
                case 4:
                    if (primeraOpcion){
                        for (int i=0;i<numeros.length;i++){
                            for (int j=0;j<numeros[i].length;j++){
                                if (j==i){
                                    num=num+numeros[i][j];
                                }
                            }
                        }
                        System.out.println("La suma de la diagonal principal es: "+num);
                    }
                    else{
                        System.out.println("Debes rellenar la matriz.");
                    }
                    break;
                case 5:
                    if (primeraOpcion){

                        for (int i=0;i<numeros.length;i++){
                           num=num+numeros[i][numeros.length-1-i];
                        }
                        System.out.println("La suma de la diagonal inversa es: "+num);
                    }
                    else{
                        System.out.println("Debes rellenar la matriz.");
                    }
                    break;
                case 6:
                    if (primeraOpcion){
                        for (int i=0;i<numeros.length;i++){
                            for (int j=0;j<numeros[i].length;j++){
                                num=num+numeros[i][j];
                            }
                        }
                        media=(double) num / (4*4);
                        System.out.println("La media es: "+media);
                    }
                    else {
                        System.out.println("Debes rellenar la matriz.");
                    }
                    break;
                case 7:
                    if (primeraOpcion){
                        System.out.println("La matriz es: ");
                        for (int i=0;i<numeros.length;i++){
                            for (int j = 0; j<numeros[i].length;j++){
                                System.out.print(numeros[i][j]+" ");
                            }
                            System.out.println();
                        }
                    }
                    else {
                        System.out.println("Debes rellenar la matriz");
                    }
                    break;
                case 8:
                    System.out.println("Apagando el programa...");
                    break;
                default:
                    System.out.println("Opción no válida. ");

            }
        }while (opcion!=8);






    }
}
