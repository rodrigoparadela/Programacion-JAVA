package Ejercicio1;

public class Persona {
    private String nombre="";
    private int edad=0;
    private String DNI="";
    private String sexo="M";
    private double peso=0;
    private double altura=0;

//constructores, uno por defecto, otro con el nombre sexo y edad y el resto por defecto, y uno con todos los atributos como parámetros.
    public Persona(){
    }
    public Persona(String nombre,String sexo,int edad){
        this.nombre=nombre;
        this.sexo=sexo;
        this.edad=edad;
        this.DNI=generaDNI();
    }
    public Persona(String nombre,int edad, String sexo, double peso, double altura){
        this.nombre=nombre;
        this.edad=edad;
        this.sexo=sexo;
        this.peso=peso;
        this.altura=altura;
        this.DNI=generaDNI();
    }
    //Métodos setter
    public void setNombre(String nombre){this.nombre=nombre;}
    public void setEdad(int edad){this.edad=edad;}
    public void setSexo(String sexo){this.sexo=sexo;}
    public void setPeso(double peso){this.peso=peso;}
    public void setAltura(double altura){this.altura=altura;}
    public int calcularIMC(){
        int IMC;
        IMC= (int) (peso/(altura*altura));
        if (IMC<20){
            return -1;
        } else if (IMC<26) {
            return 0;
        }else {
            return 1;
        }
    }
    public boolean esMayorEdad(){
        if (edad<18){
            return false;
        }
        else {
            return true;
        }
    }
    public boolean comprobarSexo(String sexo){
        if (sexo=="M"||sexo=="H"){
            System.out.println("Está bien asignado.");
            return true;
        }else{
            sexo="H";
            this.sexo=sexo;
            System.out.println("Estaba mal asignado. Asignado por defecto");
            return false;
        }
    }

    public String toString() {
        return ("Nombre: "+nombre+". Edad: "+edad+". DNI: "+DNI+". Sexo: "+sexo+". Peso: "+peso+". Altura: "+altura+".");
    }
    public String generaDNI(){
        int DNI;
        char letra;
        String letras="TRWAGMYFPDXBNJZSQVHLCKE";
        DNI = (int) (Math.random()*90000000)+10000000;
        int resto = (DNI % 23);
        letra=letras.charAt(resto);
        this.DNI=String.valueOf(DNI+letra);
        return this.DNI;
    }

}
