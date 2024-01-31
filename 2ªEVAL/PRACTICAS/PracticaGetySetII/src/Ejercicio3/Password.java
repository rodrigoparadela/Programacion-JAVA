package Ejercicio3;

import java.lang.reflect.Array;

public class Password {
    private int longitud;
    private String[] contraseña;

    //constructores
    public Password(){
        this.longitud=8;
    }
    public Password(int longitud){
        this.longitud=longitud;
        this.contraseña=generarContraseña(longitud);
    }
    public Password(int longitud, String[] contraseña){
        this.longitud=longitud;
        this.contraseña=contraseña;
    }
    //getters
    public String[] getContraseña(){return contraseña;}
    public int getLongitud(){return longitud;}
    //setter para longitud
    public void setLongitud(int longitud){this.longitud=longitud;}


    //Método es Fuerte
    public boolean esFuerte(String contraseña){
        int mayus=0,minus=0,numeros=0;
        for (int cont=0;cont<contraseña.length();cont++){
            if (Character.isUpperCase(contraseña.charAt(cont))){
                mayus++;
            } else if (Character.isLowerCase(contraseña.charAt(cont))) {
                minus++;
            } else if (Character.isDigit(contraseña.charAt(cont))) {
                numeros++;
            }
        }
        if (mayus>1 && minus>0 && numeros>4){
            return true;
        }else{
            return false;
        }
    }
    public String generarContraseña(int longitud){
        String contra="";
        contraseña=new String[longitud];
        int num;
        for (int cont=0;cont<longitud;cont++){
            num=(int) (Math.random()*(9-0));
            contraseña[cont]= String.valueOf(num);
            contra += num;
        }

        return contra;
    }

}
