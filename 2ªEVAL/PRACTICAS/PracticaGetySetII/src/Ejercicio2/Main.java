package Ejercicio2;

import java.util.Scanner;

public class Main {
    public static void main(String[] args){
        Scanner datosp=new Scanner(System.in);
        int opcion;
        String nombre,numcuenta;
        double tipoInteres,saldo,importe;


        do {

            System.out.print("Dime tu nombre completo: ");
            nombre=datosp.nextLine();
            System.out.print("Dime tu número de cuenta: ");
            numcuenta=datosp.nextLine();
            System.out.print("Dime tu saldo en cuenta: ");
            saldo=datosp.nextDouble();
            System.out.print("Dime tu tipo de interés: ");
            tipoInteres=datosp.nextDouble();
            Cuenta usuario1=new Cuenta(nombre,numcuenta,tipoInteres,saldo);
            do {
                System.out.println("Menú ");
                System.out.println("1. Reintegro");
                System.out.println("2. Ingreso");
                System.out.println("3. Transferencia");
                System.out.println("4. Ver tus datos");
                System.out.println("5. Salir");
                opcion=datosp.nextInt();
                switch (opcion){
                    case 1:
                        usuario1.reintegro();
                        break;
                    case 2:
                        usuario1.ingreso();
                        break;
                    case 3:
                        datosp.nextLine();
                        System.out.print("A que número de cuenta quieres realizar la transferencia: ");
                        numcuenta=datosp.nextLine();
                        Cuenta usuario2 = new Cuenta(numcuenta);
                        System.out.print("Dime el importe de la transferencia: ");
                        importe=datosp.nextDouble();
                        usuario1.transferencia(usuario2,usuario1,importe);
                        break;
                    case 4:
                        System.out.println("Tus datos son:");
                        System.out.println("Nombre: "+usuario1.getCliente());
                        System.out.println("Número de cuenta: "+usuario1.getNumCuenta());
                        System.out.println("Saldo: "+usuario1.getSaldo());
                        System.out.println("Tipo de interés: "+usuario1.getTipoInteres());
                        break;
                    case 5:
                        System.out.println("Saliendo...");
                        break;
                    default:
                        System.out.println("Opción no válida.");
                }
            }while (opcion!=5);
            System.out.println("Menú");
            System.out.println("1. Continuar con otro cliente");
            System.out.println("2. Salir.");
            opcion=datosp.nextInt();
            if (opcion==2){
                System.out.println("Saliendo...");
            } else if (opcion==1) {
                System.out.println("Cargando...");
                datosp.nextLine();
            }else{
                System.out.println("Opción no válida. Volviendo al menú principal");
                datosp.nextLine();
            }

        }while (opcion!=2);


    }
}
