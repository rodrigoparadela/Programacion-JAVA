import java.awt.*;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        /*Diseñar un código que pide por pantalla dos datos numéricos, de máximo tres cifras y positivos.
        Se pide elegir entre:+,-,*,/,%
        Si se elige +, se calcula la suma
        Si se elige -, se calcula la resta
        Si se elige *, se calcula la multiplicación
        Si se elige /, se calcula la división
        Si se elige %, se calcula el módulo*/

        //definimos las variables necesarias y pedimos los números por pantalla
         int num1, num2, res;
         String operacion;
        Scanner datosp = new Scanner(System.in);
        System.out.println("Dime dos números mayores que 0 y que tengan hasta 3 cifras");
        num1=datosp.nextInt();
        num2=datosp.nextInt();
        //pedimos el numero de 1 a 3 cifras y positivos mediante una condición

        if (num1>0&&num2>0&&num1<1000&&num2<1000){
            //si se cumple que sean mayores que 0 y que tengan hasta 3 cifras se hace el switch
            System.out.println("Dime la operación que quieras ejecutar (+, -, *, / o %)");
            operacion = datosp.next();
            switch (operacion){
                case "+":
                    res=num1+num2;
                    System.out.println("El resultado es: " + res);
                    break;
                case "-":
                    res=num1-num2;
                    System.out.println("El resultado es: " + res);
                    break;
                case "*":
                    res=num1*num2;
                    System.out.println("El resultado es: " + res);
                    break;
                case "/":
                    res=num1/num2;
                    System.out.println("El resultado es: " + res);
                    break;
                case "%":
                    res=num1%num2;
                    System.out.println("El resultado es: " + res);
                    break;

            }



        }
        else{
            System.out.println("Los números pedidos no son correctos");
        }
    }
}