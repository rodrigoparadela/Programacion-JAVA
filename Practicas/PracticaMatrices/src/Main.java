public class Main {
    public static void main(String[] args) {
        /*1. Dada la siguiente matriz, crear un bloque de código que aparezca de la siguiente forma:
            {3 4 5 7 8 }
            {0 0 0 0 }
            {1 1 1 1}
            {6 6 6 -1}

            El array bidimensional es el siguiente:
            Int[][]números=new int[][]{3,4,5,78},
            {0,0,0,0}
            {1,1,1,1}
            {6,6,6,-1}};

            Consideraciones:
                 Mostrar cual es el mayor valor de todos los que tiene la matriz
                 Mostrar cual es el menor valor de todos los que tiene la matriz
                 Imprime solamente los valores de la primera y la última fila de la matriz*/

        //Definimos la matriz
        int[][] numeros = new int[][] {
                {3, 4, 5, 7, 8},
                {0, 0, 0, 0},
                {1, 1, 1, 1},
                {6, 6, 6, -1}
        };

        //Guardamos el mayor y el menor número en dos variables int
        int min=0, max=0;
        for (int cont=0;cont<numeros.length;cont++){
            for (int cont2=0;cont2<numeros[cont].length;cont2++){
                if (min >= numeros[cont][cont2]){
                    min=numeros[cont][cont2];
                }
                if (max<= numeros[cont][cont2]){
                    max=numeros[cont][cont2];
                }
            }

        }
        //Mostramos los valores por pantalla
        System.out.println("El menor de la matriz es: " + min);
        System.out.println("El mayor de la matriz es: " + max);

        //Imprimimos la primera y la última fila de la matriz
        System.out.println("La primera fila de la matriz es: ");
        for (int cont=0;cont<(numeros[0].length-1);cont++){
            System.out.print(numeros[0][cont]+" - ");
        }
        System.out.println(numeros[0][numeros[0].length-1]);

        System.out.println("La última fila de la matriz es: ");
        for (int cont=0;cont<(numeros[3].length-1);cont++){
            System.out.print(numeros[3][cont]+" - ");
        }
        System.out.println(numeros[3][numeros[3].length-1]);

    }
}