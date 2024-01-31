package Ejercicio2;

import java.util.Scanner;

public class Cuenta {
    private String cliente;
    private String numCuenta;
    private double tipoInteres;
    private double saldo;

    //constructor sin parámetros
    public Cuenta(){
    }
    //constructor con todos los parametros
    public Cuenta(String cliente,String numCuenta,double tipoInteres, double saldo){
        this.cliente=cliente;
        this.numCuenta=numCuenta;
        this.tipoInteres=tipoInteres;
        this.saldo=saldo;
    }
    //constructor solo con el parámetro numcuenta para realizar la transferencia
    public Cuenta(String numCuenta){
        this.numCuenta=numCuenta;
    }
    //Setters
    public void setCliente(String cliente){this.cliente=cliente;}
    public void setNumCuenta(String numCuenta){this.numCuenta=numCuenta;}
    public void setTipoInteres(double tipoInteres){this.tipoInteres=tipoInteres;}
    public void setSaldo(double saldo){this.saldo=saldo;}
    //Getters
    public String getCliente(){return cliente;}
    public String getNumCuenta(){return numCuenta;}
    public double getTipoInteres(){return tipoInteres;}
    public double getSaldo(){return saldo;}

    //Método ingreso
    public boolean ingreso(){
        double cantidad;
        Scanner datosp= new Scanner(System.in);
        System.out.print("Dime la cantidad a aumentar: ");
        cantidad=datosp.nextDouble();
        if (cantidad>0){
            saldo=saldo+cantidad;
            System.out.println("Ingreso realizado.");
            return true;
        }else{
            System.out.println("No se puede ingresar una cantidad negativa.");
            return false;
        }
    }
    //Método reintegro
    public boolean reintegro(){
        double cantidad;
        Scanner datosp=new Scanner(System.in);
        System.out.print("Dime la cantidad que quieras retirar: ");
        cantidad=datosp.nextDouble();
        saldo=saldo-cantidad;
        if (saldo<0){
            System.out.println("No se puede hacer esa operación. No se puede dejar el saldo negativo.");
            saldo=saldo+cantidad;
            return false;
        }else {
            System.out.println("Recoja su dinero.");
            return true;
        }
    }
    //Método transferencia
    public void transferencia(Cuenta cuentaDestino,Cuenta cuentaOrigen, double importe){
        if ((saldo-importe)<0){
            System.out.println("No se puede realizar la transferencia. No puedes dejar la cuenta con saldo menor que cero");
        }else{
            cuentaOrigen.saldo-=importe;
            cuentaDestino.saldo+=importe;
            System.out.println("Transferecia realizada con éxito.");
        }

    }


}
