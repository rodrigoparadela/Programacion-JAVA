package Ejercicio1;

public class Perecederos {
    private String nombre;
    private double precio;
    private int diasACadudar;
    //constructora
    public Perecederos(String nombre, double precio, int diasACadudar) {
        this.nombre = nombre;
        this.precio = precio;
        this.diasACadudar = diasACadudar;
    }
    //Getters:
    //nombre
    public String getNombre(){
        return nombre;
    }
    //precio
    public double getPrecio(){
        return precio;
    }
    //Dias a caducar
    public int getDiasACadudar(){
        return diasACadudar;
    }

    //Setters:
    //nombre
    public void setNombre(String nombre){
        this.nombre=nombre;
    }
    //precio
    public void setPrecio(double precio){
        this.precio=precio;
    }
    //Dias a caducar
    public void setDiasACadudar(int diasACadudar){
        this.diasACadudar=diasACadudar;
    }

    //Función Calcular
    public double Calcular(int nProductos){
        double preciototal;
        preciototal = this.precio * nProductos;
        if (diasACadudar==1){
            preciototal=preciototal/4;
        } else if (diasACadudar==2) {
            preciototal=preciototal/3;
        }
        else {
            preciototal=preciototal/2;
        }
        return preciototal;
    }


}
