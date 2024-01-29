package PracticaPOO1;

public class Raices {
    double a;
    double b;
    double c;
    public Raices(double a,double b,double c){
        this.a=a;
        this.b=b;
        this.c=c;
    }
    public void obtenerRaices(){
        double discriminante,solucion1,solucion2;
        discriminante=getDiscriminante();
        solucion1=(-b + Math.sqrt(discriminante)/(2*a));
        solucion2=(-b - Math.sqrt(discriminante)/(2*a));
        System.out.println("La solución 1 es: "+solucion1);
        System.out.println("La solución 2 es: "+solucion2);
    }
    public void obtenerRaiz(){
        double discriminante,solucion;
        discriminante=getDiscriminante();
        solucion=-b/(2*a);
        System.out.println("La única solución es: "+solucion);
    }
    public double getDiscriminante(){
        double discriminante;
        discriminante=(b*b)-(4*a*c);
        return discriminante;
    }
    public boolean tieneRaices(){
        double discriminante;
        discriminante=getDiscriminante();
        if (discriminante>=0){
            return true;
        }
        else {
            return false;
        }
    }
    public boolean tieneRaiz(){
        double discriminante;
        discriminante=getDiscriminante();
        if (discriminante==0){
            return true;
        }
        else{
            return false;
        }
    }
    public void calcular(){
        if (tieneRaices()){
            obtenerRaices();
        } else if (tieneRaiz()) {
            obtenerRaiz();
        }
        else{
            System.out.println("No existen soluciones reales para la ecuación.");
        }
    }
}
