package Ejercicio1;

public class Calculadora {
    int num1;
    int num2;
    public Calculadora(int num1,int num2){
        this.num1=num1;
        this.num2=num2;
    }
    public int sumar(){
        int solucion;
        solucion=num1+num2;
        return solucion;
    }
    public int restar(){
        int solucion;
        solucion=num1-num2;
        return solucion;
    }
    public int multiplicar(){
        int solucion;
        solucion=num1*num2;
        return solucion;
    }
    public void dividir(){
        if (poderDividir()){
            System.out.println("La división es: "+(num1/num2));
        }
        else {
            System.out.println("No se puede dividir entre 0");
        }
    }
    public boolean poderDividir(){
        if (num2==0){
            return false;
        }
        else{
            return true;
        }
    }
}
