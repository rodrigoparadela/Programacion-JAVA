import java.util.ArrayList;

public class Main {
    public static void main(String[] args) {

        //Creamos el arraylist
        ArrayList<String>nombres=new ArrayList<String>();

        //Añadimos los nombres
        nombres.add("Pedro");
        nombres.add("Lucia");
        nombres.add("Pablo");

        System.out.println("El arraylist contiene: "+nombres);

        //1. Crear un arraylist con 5 valores de tipo integer. Calcular la media de todos los valores. Visualizar todos los valores y la media
        ArrayList<Integer>nums=new ArrayList<Integer>();
        nums.add(7);
        nums.add(9);
        nums.add(4 );
        nums.add(10);
        nums.add(5);

        System.out.println("Todos los valores del arraylist son: "+nums);

        int media = 0;

        for (int num:nums){
            media=media+num;
        }

        media=media/5;
        System.out.println("La media de los 5 números es: "+media);

    }
}