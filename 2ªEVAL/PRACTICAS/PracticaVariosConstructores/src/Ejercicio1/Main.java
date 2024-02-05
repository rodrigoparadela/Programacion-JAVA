package Ejercicio1;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        String nombre,DNI,sexo;
        int edad;
        double peso,altura;
        Scanner datosp=new Scanner(System.in);
        boolean esMayorEdad;

        System.out.print("Dime tu nombre: ");
        nombre=datosp.nextLine();
        System.out.print("Dime tu edad: ");
        edad=datosp.nextInt();
        datosp.nextLine();
        System.out.print("Dime tu sexo(H/M): ");
        sexo=datosp.nextLine();
        System.out.print("Dime tu peso: ");
        peso=datosp.nextDouble();
        System.out.print("Dime tu altura: ");
        altura=datosp.nextDouble();

        //Creamos el primer objeto persona con el constructor que tiene todos los parámetros
        Persona persona1 = new Persona(nombre,edad,sexo,peso,altura);
        //Creamos el segundo objeto persona al que le damos los valores menos el peso y la altura
        Persona persona2 = new Persona(nombre,sexo,edad);
        //Creamos el tercer objeto persona con los valores por defecto
        Persona persona3 = new Persona();

        //Mostramos el IMC de la primera persona ya que de las otras dos no podemos. Esto es porque los valores por defecto de peso
        // y altura son 0 y no se puede dividir entre 0.
        System.out.println("El IMC de la persona 1 es: "+persona1.calcularIMC());

        //Mostramos si son mayores o no de edad. La tercera persona tiene edad=0 asique saldrá que es menor de edad.
        esMayorEdad=persona1.esMayorEdad();
        System.out.println("La primera persona es mayor de edad: "+esMayorEdad);
        esMayorEdad=persona2.esMayorEdad();
        System.out.println("La segunda persona es mayor de edad: "+esMayorEdad);
        esMayorEdad=persona3.esMayorEdad();
        System.out.println("La tercera persona es mayor de edad: "+esMayorEdad);

        //Comprobamos si el sexo está bien asignado
        persona1.comprobarSexo(sexo);
        persona2.comprobarSexo(sexo);
        persona3.comprobarSexo(sexo);

        //Mostramos los valores de cada persona por pantalla
        System.out.println(persona1.toString());

        System.out.println(persona2.toString());
        System.out.println(persona3.toString());

    }
}