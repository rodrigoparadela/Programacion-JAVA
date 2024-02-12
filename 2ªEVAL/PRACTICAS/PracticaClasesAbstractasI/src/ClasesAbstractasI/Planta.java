package ClasesAbstractasI;

public  class Planta {
    protected String nombre;
    protected int altura;

    //constructores, getters y setters
    public Planta(){
    }
    public Planta(String nombre,int altura){
        this.nombre=nombre;
        this.altura=altura;
    }
    public void setNombre(String nombre){
        this.nombre=nombre;
    }
    public void setAltura(int altura){
        this.altura=altura;
    }
    public String getNombre(){
        return nombre;
    }
    public int getAltura(){
        return altura;
    }
    public String sistemaDeRiego(String intExtFrut){
        if (intExtFrut.equals("interior")){
            return "Sistema de riego por goteo.";
        } else if (intExtFrut.equals("exterior")) {
            return "Sistema de riego por goteo.";
        }else {
            return "Sistema de riego permanente.";
        }
    }
}
