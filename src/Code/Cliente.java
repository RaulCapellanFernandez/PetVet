
package Code;

import java.util.ArrayList;
import java.util.List;

/*Esta clase es la encargada de hacer referencia a los atributos de la base de datos 
de la tabla Cliente.
*/

public class Cliente{
    public Cliente(){
        //Constructor vacío que llenaremos con setters
    }
    //Variables
    private String dni;
    private String name;
    private String apellido;
    private String fechaNacimineto;
    private String numTelf;
    private String direccion;
    private String fechaIngreso;
    private String fechaUltMod;
    private List<String> mascotas; 
    private float deuda;
    /*
    public Cliente(int dni, String name, String apellido, String fechaNacimineto, String numTelf, String direccion, String fechaIngreso, String fechaUltMod, Mascota mascotas) {
        this.dni = dni;
        this.name = name;
        this.apellido = apellido;
        this.fechaNacimineto = fechaNacimineto;
        this.numTelf = numTelf;
        this.direccion = direccion;
        this.fechaIngreso = fechaIngreso;
        this.fechaUltMod = fechaUltMod;
        this.mascotas = mascotas;
    }*/
    
    //Gettersy Setters
    public void setDni(String dni) {
        this.dni = dni;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setApellido(String apellido) {
        this.apellido = apellido;
    }

    public void setFechaNacimineto(String fechaNacimineto) {
        this.fechaNacimineto = fechaNacimineto;
    }

    public void setNumTelf(String numTelf) {
        this.numTelf = numTelf;
    }

    public void setDireccion(String direccion) {
        this.direccion = direccion;
    }

    public void setFechaIngreso(String fechaIngreso) {
        this.fechaIngreso = fechaIngreso;
    }

    public void setFechaUltMod(String fechaUltMod) {
        this.fechaUltMod = fechaUltMod;
    }

    public void setMascotas(List<String> mascotas) {
        this.mascotas = mascotas;
    }
    public void setDeuda(float deuda){
        this.deuda=deuda;
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

    public String getFechaNacimineto() {
        return fechaNacimineto;
    }

    public String getNumTelf() {
        return numTelf;
    }

    public String getDireccion() {
        return direccion;
    }

    public String getFechaIngreso() {
        return fechaIngreso;
    }

    public String getFechaUltMod() {
        return fechaUltMod;
    }

    public List<String> getMascotas() {
        return mascotas;
    }
    public float getDeuda(){
        return deuda;
    }
   
}
