package PracticaBucles;
import java.util.Scanner;
public class Ejercicio4 {
    public static void main(String[] args) {
        /* 4.Escribir un programa que pide por pantalla un número entre el 0 y 999.Nos aparece un
            mensaje, con el número de dígitos que tiene el número que introduce. Si se teclea el valor
            cero, se acaba el juego.  */


        //Pedimos por pantalla el número al usuario. Y creamos una variable para que cuente los digitos
        Scanner datosp= new Scanner(System.in);
        String num=new String();
        System.out.println("Dime un número entre el 0 y el 999");
        num= datosp.nextLine();
        int numero= Integer.parseInt(num);
        int res=0;


        //Con una condición hacemos que si se teclea el número 0 o un número mayor a 999 se acabe el juego
        if (numero < 1 || numero>999){
            System.out.println("Se acaba el juego ");
        }
        else{
            //Para hacer que cuente los dígitos del número creamos un bucle en el que por cada dígito que tenga el número sume 1 a la variable res.
            for (int cont=0;cont<num.length();cont++){
                res = cont+1;
            }
            System.out.println("El número tiene "+(res)+" dígitos");


        }


    }
}