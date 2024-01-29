package PracticaPOO1;

import java.util.Scanner;

public class Libreria {
    Scanner datosp=new Scanner(System.in);
    int ISBN;
    String titulo;
    String autor;
    int numPaginas;

    public Libreria(int ISBN,String titulo,String autor,int numPaginas){
        this.ISBN=ISBN;
        this.autor=autor;
        this.titulo=titulo;
        this.numPaginas=numPaginas;
    }

    public String toString(){
        return "El libro con "+ISBN+" creado por el autor "+autor+" con título "+titulo+" tiene "+numPaginas+" páginas.";
    }
}
