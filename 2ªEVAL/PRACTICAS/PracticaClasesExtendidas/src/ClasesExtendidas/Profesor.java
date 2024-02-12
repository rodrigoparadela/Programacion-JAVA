package ClasesExtendidas;

public class Profesor extends Persona{
    private String materia;
    private String cargo;
    //constructores
    public Profesor(){
    }
    public Profesor(String materia, String cargo){
        this.materia=materia;
        this.cargo=cargo;
    }
    //getters y setters
    public void setMateria(String materia){this.materia=materia;}
    public void setCargo(String cargo){this.cargo=cargo;}
    public String getMateria(){return materia;}
    public String getCargo(){return cargo;}

}
