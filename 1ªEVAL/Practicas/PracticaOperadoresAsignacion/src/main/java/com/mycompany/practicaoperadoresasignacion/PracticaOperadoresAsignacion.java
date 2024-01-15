package com.mycompany.practicaoperadoresasignacion;

public class PracticaOperadoresAsignacion {

    public static void main(String[] args) {
        
        double saldo;
        saldo=100.50;
        System.out.println("El valor del saldo es: "+ saldo);
        saldo+=27.5;
        saldo*=2; //promoción bancaria
        saldo/=2; //avería en casa
        saldo+=250.38; //Recibo un ingreso 
        saldo-=55.37; //compra sábado
        saldo+=1200.96; //nómina
        System.out.println("El valor del saldo es: "+saldo);
        saldo-=85.23; //cena de ayer
        System.out.println("El valor del saldo es: "+saldo);
        
        
    }
}
