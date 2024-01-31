package Ejercicio3;

import java.sql.Array;
import java.util.ArrayList;
import java.util.Scanner;

public class Main {
    public static void main(String[] args){
        ArrayList<String> contraseñas= new ArrayList<>();
        ArrayList<Boolean> esfuerte=new ArrayList<>();
        String contraseña;
        int numcontras,longitud,opcion;
        Scanner datosp=new Scanner(System.in);


        System.out.print("Dime cuantas contraseñas quieres crear: ");
        numcontras=datosp.nextInt();

        for (int cont=0;cont<numcontras;cont++){

            System.out.println("Como quieres generar la contraseña:");
            System.out.println("1. Manualmente");
            System.out.println("2. Aleatoriamente");
            opcion=datosp.nextInt();
            if (opcion==1){
                Password contraseña1=new Password();
                System.out.println("Dime la contraseña que quieras: ");
                contraseña=datosp.next();
                esfuerte.add(contraseña1.esFuerte(contraseña));
                contraseñas.add(contraseña);
            } else if (opcion==2) {
                System.out.print("Dime la longitud de la contraseña que quieras: ");
                longitud=datosp.nextInt();
                Password contraseña1=new Password();
                contraseña=contraseña1.generarContraseña(longitud);
                contraseñas
            }
        }

    }
}
