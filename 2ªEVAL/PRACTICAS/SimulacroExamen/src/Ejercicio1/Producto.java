package Ejercicio1;

public class Producto {
    private String ID;
    private String nombre;
    private double precio;
    private String proveedor;
    private String descripcion;

    //Método constructor
    public Producto(String ID, String nombre, double precio, String proveedor, String descripción){
        this.ID=ID;
        this.nombre=nombre;
        this.precio=precio;
        this.proveedor=proveedor;
        this.descripcion=descripción;
    }
    public Producto(){
    }
    //Métodos get y set
    public String getID(){return ID;}
    public String getNombre(){return nombre;}
    public double getPrecio(){return precio;}
    public String getProveedor(){return proveedor;}
    public String getDescripcion(){return descripcion;}

    public void setID(String ID){this.ID=ID;}
    public void setNombre(String nombre){this.nombre=nombre;}
    public void setPrecio(double precio){this.precio=precio;}
    public void setProveedor(String proveedor){this.proveedor=proveedor;}
    public void setDescripcion(String descripcion){this.descripcion=descripcion;}



}
