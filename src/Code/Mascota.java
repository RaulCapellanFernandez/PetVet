package Code;

/*
Esta clase es la encargada de hacer referencia a los atributos de la base de datos 
de la tabla Mascota.
*/

public class Mascota{
    public static enum TipoDeMascota{perro, gato};
    //Variables
    private int dniCliente;
    private int numChip;
    private String nombre;
    private String raza;
    private TipoDeMascota tipo;

    //Constructor
    public Mascota(int dniCliente, int numChip, String nombre, String raza, TipoDeMascota tipo) {
        this.dniCliente = dniCliente;
        this.numChip = numChip;
        this.nombre = nombre;
        this.raza = raza;
        this.tipo = tipo;
    }
    

    //Getters y Setters
    public int getDniCliente() {
        return dniCliente;
    }

    public int getNumChip() {
        return numChip;
    }

    public String getNombre() {
        return nombre;
    }

    public String getRaza() {
        return raza;
    }

    public TipoDeMascota getTipo() {
        return tipo;
    }

    public void setDniCliente(int dniCliente) {
        this.dniCliente = dniCliente;
    }

    public void setNumChip(int numChip) {
        this.numChip = numChip;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public void setRaza(String raza) {
        this.raza = raza;
    }

    public void setTipo(TipoDeMascota tipo) {
        this.tipo = tipo;
    }
    
    
}