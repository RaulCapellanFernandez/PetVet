
package Code;

/*
Esta clase es la encargada de hacer referencia a los atributos de la base de datos 
de la tabla Empleados.
*/

public class Empleado{
    
    public static enum TipoDeUsuario{auxiliar, veterinario};
    
    //Declaracion de Variables
    private int dni;
    private String name;
    private String apellido;
    private String numTelf;
    private String contrasena;
    private TipoDeUsuario tipo;

    public Empleado(int dni, String name, String apellido, String numTelf, String contrasena, TipoDeUsuario tipo) {
        this.dni = dni;
        this.name = name;
        this.apellido = apellido;
        this.numTelf = numTelf;
        this.contrasena = contrasena;
        this.tipo = tipo;
    }
    
   
    //Getters y Setters
    public void setContrasena(String contrasena) {
        this.contrasena = contrasena;
    }

    public int getDni() {
        return dni;
    }

    public String getName() {
        return name;
    }

    public String getApellido() {
        return apellido;
    }

    public String getNumTelf() {
        return numTelf;
    }

    public String getContrasena() {
        return contrasena;
    }
     public void setDni(int dni) {
        this.dni = dni;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setApellido(String apellido) {
        this.apellido = apellido;
    }

    public void setNumTelf(String numTelf) {
        this.numTelf = numTelf;
    }
    public TipoDeUsuario getTipo(){
        return tipo;
    }
    public void setTipo(TipoDeUsuario tipo){
        this.tipo = tipo;
    }


    
}