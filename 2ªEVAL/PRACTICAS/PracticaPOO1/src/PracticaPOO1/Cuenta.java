package PracticaPOO1;

import java.util.Scanner;

public class Cuenta {
    Scanner datosp=new Scanner(System.in);
    String titular;
    double cantidad;

    public Cuenta(String titular, double cantidad){
            this.titular=titular;
            this.cantidad=cantidad;
    }
    public double ingresar(double cantidad){
        double ingreso;
        System.out.print("Dime la cantidad que quieras ingresar: ");
        ingreso=datosp.nextDouble();
        if (ingreso>0){
            cantidad=cantidad+ingreso;
            System.out.println("Has ingresado: "+ingreso+"€");
            System.out.println("Saldo en tu cuenta: "+cantidad+"€");
            System.out.println("Usuario: "+titular+".");
        }
        else{
            System.out.println("¡No se puede ingresar negativamente!");

        }
        return cantidad;
    }
    public double retirar(double cantidad){
        double retiro;
        System.out.print("Dime la cantidad que quieras retirar: ");
        retiro=datosp.nextDouble();
        cantidad=cantidad-retiro;
        if (cantidad>=0){
            System.out.println("Has retirado: "+retiro+"€");
            System.out.println("Saldo en tu cuenta: "+cantidad+"€");
            System.out.println("Usuario: "+titular+".");
        }
        else {
            System.out.println("Has retirado: "+retiro+"€");
            System.out.println("Saldo en tu cuenta: 0€");
            System.out.println("Usuario: "+titular+".");
        }
        return cantidad;
    }
}
