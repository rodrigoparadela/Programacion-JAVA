package PracticaArrays;

public class Ejercicio3 {
    public static void main(String[] args){
        /*3. Crear un array de caracteres, con los siguientes valores: a,e,r,t,y,u. Crea un array con datos
            enteros con valores del 1 al 6.

            Diseña un tercer array que tiene el mismo número de celdas que la suma de las celdas de los
            dos arrays anteriores. */

        //Creamos el primer array y lo mostramos por pantalla
        char array1[] = {'a','e','r','t','y','u'};
        for (int cont=0; cont<array1.length;cont++){
            System.out.print(array1[cont]+" ");
        }
        System.out.println();

        //Creamos el segundo array y lo mostramos por pantalla

        int array2[] ={1, 2, 3, 4, 5, 6};
        for (int cont=0;cont< array2.length;cont++){
            System.out.print(array2[cont]+" ");
        }
        System.out.println();

        //Creamos el tercer array con el tamaño de la suma del primer y segundo array y lo mostrmos por
        //pantalla con números del 1 para adelante.

        int tamaño3 = array1.length+array2.length;
        int array3[] = new int[tamaño3];
        for (int cont=0; cont<tamaño3;cont++){
            array3[cont]=cont+1;
        }
        for (int cont=0; cont<tamaño3;cont++){
            System.out.print(array3[cont]+" ");
        }



    }
}
