package PracticaArrays;

import java.util.Scanner;

public class Ejercicio5 {
    public static void main(String[] args) {
        /*5.Diseñar un array con las calificaciones de 6 asignaturas de un alumno que se piden por
            pantalla. Se debe calcular su nota media final.

                 Si la media>=5, la calificación es aprobado
                 Si la media<5, la calificación es suspenso

                 Si la media>5 y <=6.5 la calificación es bien
                 Si la media >6.5 y <=8.5 la calificación es notable
                 Si la media >8.5 y >=9 la calificación es sobresaliente*/

        //Creamos el array y lo mostramos por pantalla

        Scanner datosp = new Scanner(System.in);
        double nota;
        double notas[] = new double[6];
        for (int cont = 0 ; cont < 6; cont++){
            System.out.println("Dime una nota del alumno");
            nota = datosp.nextDouble();
            notas[cont] = nota;
        }
        System.out.println("Las notas son: ");
        for (int cont=0; cont<5;cont++){
            System.out.print(notas[cont] + " - ");
        }
        System.out.println(notas[5]);

        //Calculamos la media
        double media = 0;
        for (int cont=0;cont<6;cont++){
            media = media + notas[cont];
        }
        media = media/6;
        System.out.println("La media es: "+media);
        //Con una cadena de condiciones hacemos el resto

        if (media>=5){
            System.out.println("Aprobado");
            if (media>8.5){
                System.out.println("Sobresaliente");
            }
            else{
                if (media>6.5){
                    System.out.println("Notable");
                }
                else{
                    System.out.println("Bien");
                }
            }
        }
        else{
            System.out.println("Suspenso");
        }






    }
}
