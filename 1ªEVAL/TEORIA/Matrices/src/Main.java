
public class Main {
    public static void main(String[] args){
        //crear una matriz de 2 filas por 3 columnas. Rango 2x3.

        int [] []matriz1=new int[][]{{1,2,3},{4,5,6}};
        //imprimimos los datos
        for (int fila=0;fila< matriz1.length;fila++) {
            //imprimimos datos
            for (int columna = 0; columna < matriz1.length; columna++) {
                System.out.println(matriz1[fila][columna]);

            }
            System.out.println("--------------------------------------------------------");
        }

    }
}