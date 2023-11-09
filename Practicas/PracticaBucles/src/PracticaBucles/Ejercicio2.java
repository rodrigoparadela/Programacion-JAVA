package PracticaBucles;

public class Ejercicio2 {
    public static void main(String[] args){
        /*2.Calcular los n, los 10 primeros números de la serie de fibonnaci.*/

        //Definimos las variables necesarias.
        int num1 = 0;
        int num2= 1;
        int num3;
        //La serie de fibonacci empieza por 0 y 1 asique tenemos que imprimirlos por pantalla primeramente para después empezar el bucle sumando los dos números anteriores
        System.out.println(num1);
        System.out.println(num2);

        //Hacemos un bucle para que el contador vaya del 3er numero hasta el 10o.
        for (int cont=2;cont<10;cont++){
            System.out.println(num3 = num1+num2);
            num1=num2;
            num2 = num3;

        }


    }



}
