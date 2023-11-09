package PracticaBucles;
import java.util.Scanner;
public class Ejercicio5 {
    public static void main(String[] args){
        /* 5.Se piden números mayores que cero por pantalla y se calcula su múltiplo, hasta que se teclea
             el cero. */

        //Creamos las variables necesarias y Scanner
        Scanner datosp=new Scanner(System.in);
        int num = 1;
        int res=0;
        //Se hace un bucle while para que cuando se teclee el 0 o un número menor que 0 salga del bucle.
        while(num>0){

            //Se pide el número por pantalla al usuario y se guarda en la variable num.
            System.out.println("Dime un número mayor que cero. Si tecleas un número igual o menor que 0 se acaba el juego");
            num = datosp.nextInt();

            //Una vez pedido el número, se hace una condición para el break en el else de la condición.
            if (num>0){
                //Para calcular los divisores, hay que ver si el módulo de la división es igual a 0
                //hay que hacer un bucle que vaya dividiendo números hasta el mismo número pedido y que vaya
                //imprimiendo  los números por pantalla.
                for (int cont=1; cont<=num;cont++){
                    res = num%cont;
                    if (res==0){
                        System.out.println(cont + " es un divisor de " + num);
                    }
                }


            }
            else {
                System.out.println("Se caba el juego.");
                break;
            }
        }








    }
}
