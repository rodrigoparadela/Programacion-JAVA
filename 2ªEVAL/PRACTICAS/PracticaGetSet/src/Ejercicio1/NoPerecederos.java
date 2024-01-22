package Ejercicio1;

public class NoPerecederos {
    private String nombre;
    private double precio;
    private String tipo;

    //Función Constructora
    public NoPerecederos(String nombre, double precio, String tipo) {
        this.nombre = nombre;
        this.precio = precio;
        this.tipo = tipo;
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
    //tipo
    public String getTipo(){
        return tipo;
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
    //tipo
    public void setTipo(String tipo){
        this.tipo=tipo;
    }

    //Función Calcular
    public double Calcular(int nProductos){
        double preciototal;
        preciototal = this.precio * nProductos;

        return preciototal;
    }


}
