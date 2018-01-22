
package Code;

/*
Esta clase es la encargada de hacer referencia a los atributos de la base de datos 
de la tabla Empleados.
*/

public class Empleado{


  
    
    
    //Declaracion de Variables
    private String dni;
    private String name;
    private String apellido;
    private String numTelf;
    private String contrasena;
    private String tipo;
    private String cuentaBancaria;
    public Empleado(){
        //Se crea un constructor vacío, los datos se llenaran con setters
    }
    /*
    public Empleado(int dni, String name, String apellido, String numTelf, String contrasena, TipoDeUsuario tipo) {
        this.dni = dni;
        this.name = name;
        this.apellido = apellido;
        this.numTelf = numTelf;
        this.contrasena = contrasena;
        this.tipo = tipo;
    }
    */
   
    //Getters y Setters
    public void setContrasena(String contrasena) {
        this.contrasena = contrasena;
    }

    public String getDni() {
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
    public String getCuentaBancaria(){
        return cuentaBancaria;
    }
    
     public void setDni(String dni) {
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
    public String getTipo(){
        return tipo;
    }
    public void setTipo(String tipo){
        this.tipo = tipo;
    }
    public void setCuentaBancaria(String cuenta) {
        this.cuentaBancaria=cuenta;
    }


    
}