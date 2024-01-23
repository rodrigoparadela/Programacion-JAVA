package Ejercicio1;

public class Biblioteca {

    //atributos de la clase:
    private String titulo;
    private String autor;
    private int nejemplares;
    private int nejemplaresP;

    //Función constructora
    public Biblioteca(String titulo,String autor,int nejemplares,int nejemplaresP){
        this.titulo=titulo;
        this.autor=autor;
        this.nejemplares=nejemplares;
        this.nejemplaresP=nejemplaresP;
    }
    //Función constructora sin valores (parámetros)
    public Biblioteca(){
    }

    //Setters
    public void setTitulo(String titulo){this.titulo=titulo;}
    public void setAutor(String autor){this.autor=autor;}
    public void setNejemplares(int nejemplares){this.nejemplares=nejemplares;}
    public void setNejemplaresP(int nejemplaresP){this.nejemplaresP=nejemplaresP;}

    //Getters
    public String getTitulo(){return titulo;}
    public String getAutor(){return autor;}
    public int getNejemplares(){return nejemplares;}
    public int getNejemplaresP(){return nejemplaresP;}

    //Método préstamo
    public boolean prestamo(){
        if (this.nejemplares==0){
            return false;
        }
        else {
            this.nejemplares--;
            this.nejemplaresP++;
            return true;
        }
    }

    //Método devolución
    public boolean devolucion(){
        if (this.nejemplaresP==0){
            return false;
        }
        else{
            nejemplaresP--;
            nejemplares++;
            return true;
        }
    }

    //Método mostrar
    public void mostrar(){
        System.out.println("Titulo: "+ titulo);
        System.out.println("Autor: " +autor);
        System.out.println("Número de ejemplares: "+nejemplares);
        System.out.println("Número de ejemplares prestados: "+nejemplaresP);
    }

}
