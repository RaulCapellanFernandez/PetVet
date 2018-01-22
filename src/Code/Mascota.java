package Code;

/*
Esta clase es la encargada de hacer referencia a los atributos de la base de datos 
de la tabla Mascota.
*/

public class Mascota{
    public Mascota(){
        //Se crea un objeto vacío, que se llenará con los setters
    }
    public static enum TipoDeMascota{sano,tratamiento,hospitalizado};
    //Variables
    private String dniCliente;
    private int numChip;
    private String nombre;
    private String raza;
    private String especie;
    private TipoDeMascota tipo;
    private float peso;
    private int edad;

    /*Constructor
    public Mascota(String dniCliente, int numChip, String nombre, String raza, TipoDeMascota tipo) {
        this.dniCliente = dniCliente;
        this.numChip = numChip;
        this.nombre = nombre;
        this.raza = raza;
        this.tipo = tipo;
    }
    */
    

    //Getters y Setters
    public String getDniCliente() {
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
    public float getPeso() {
        return peso;
    }
    public int getEdad(){
        return edad;
    }
    public String getEspecie(){
        return especie;
    }

    public void setDniCliente(String dniCliente) {
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
    public void setPeso(float peso){
        this.peso=peso;
    }
    public void setEdad(int edad){
        this.edad=edad;
    }
    public void setEspecie(String especie){
        this.especie=especie;
    }
    
}