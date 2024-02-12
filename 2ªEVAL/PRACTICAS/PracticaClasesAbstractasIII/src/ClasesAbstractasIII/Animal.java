package ClasesAbstractasIII;

public class Animal {
    private String nombre;
    private String raza;
    private int anoNacimiento;
    private String nombreDueño;

    //Constructores
    public Animal(){
    }
    public Animal(String nombre, String raza, int anoNacimiento, String nombreDueño){
        this.nombre=nombre;
        this.raza=raza;
        this.anoNacimiento=anoNacimiento;
        this.nombreDueño=nombreDueño;
    }
    //Getters y setters
    public void setNombre(String nombre){this.nombre=nombre;}
    public void setRaza(String raza){this.raza=raza;}
    public void setAnoNacimiento(int anoNacimiento){this.anoNacimiento=anoNacimiento;}
    public void setNombreDueño(String nombreDueño){this.nombreDueño=nombreDueño;}
    public String getNombre(){return nombre;}
    public String getRaza(){return raza;}
    public int getAnoNacimiento(){return anoNacimiento;}
    public String getNombreDueño(){return nombreDueño;}

    //Método Mostrar datos del animal
    public void datosAnimal(){
        System.out.println("Nombre: "+nombre);
        System.out.println("Raza: "+raza);
        System.out.println("Año Nacimiento: "+anoNacimiento);
        System.out.println("Nombre Dueño: "+nombreDueño);
    }
    //Calcular edad
    public void edad(){
        int edad;
        edad=2024-anoNacimiento;
        System.out.println("Edad: "+edad+" años." +
                "");
    }
}
