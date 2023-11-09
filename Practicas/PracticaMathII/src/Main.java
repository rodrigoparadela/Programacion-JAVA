import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        /*Supón que un partido de fútbol tiene una duración de 90 minutos. El minuto 1 se
          considera que abarca desde los 0 segundos hasta los 59. El minuto 2 desde los 60
          hasta los 119 segundos. Asi sucesivamente hasta el último minuto, qeu es el minuto 90
          y abarca desde los 5340 segundos hasta los 5400.
          Crea un programa que pida al usuario el número de segundos transcurridos y mediante
          el uso de alguna función de redondeo (floor, ceil o round) de la clase Math muestre
          el minuto en qeu nos encontramos. El programa debe pedir valores de segundos hasta
          que el usuario decida terminar. Ejemplo de ejecución:
          - Introduzca valor de segundos: 32
          - El minuto es el 1
          - ¿Otro valor (s/n)? n*/

        //definimos variables
        String res = new String();
        res = "s";
        int seg, min ;
        seg=1;
        Scanner datosp=new Scanner(System.in);
        while(res.equals("s")){
            if (seg <=5400 ||seg>=1) {

                System.out.println("Introduzca valor de segundos:");
                seg = datosp.nextInt();
                min = seg / 60;
                min = Math.round(min) + 1;
                System.out.println("El minuto es el: " + min);
                System.out.println("¿Otro valor (s/n)? ");
                res = datosp.next();
            }
            else{
                break;
            }
        }




    }
}