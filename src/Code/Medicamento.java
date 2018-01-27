package Code;

import java.util.ArrayList;

/*
Esta clase es la encargada de hacer referencia a los atributos de la base de datos 
de la tabla Medicametos.
*/

public class Medicamento{
    //Variables
    private int codigoMedicamento;
    private String nombreTecnico;
    private int cantidadMedicamento;
    private ArrayList<String> principiosActivos = new ArrayList<String>();
    public Medicamento(){
        //Constructor vacío que llenaremos con setters
    }
    /*public Medicamento(int codigoMedicamento, String nombreTecnico, int cantidadMedicamento) {
        this.codigoMedicamento = codigoMedicamento;
        this.nombreTecnico = nombreTecnico;
        this.cantidadMedicamento = cantidadMedicamento;
    }
    */
    
    //Getters y Setters
    public int getCodigoMedicamento() {
        return codigoMedicamento;
    }

    public String getNombreTecnico() {
        return nombreTecnico;
    }

    public int getCantidadMedicamento() {
        return cantidadMedicamento;
    }

    public ArrayList<String> getPrincipiosActivos() {
        return principiosActivos;
    }

    public void setCodigoMedicamento(int codigoMedicamento) {
        this.codigoMedicamento = codigoMedicamento;
    }

    public void setNombreTecnico(String nombreTecnico) {
        this.nombreTecnico = nombreTecnico;
    }

    public void setCantidadMedicamento(int cantidadMedicamento) {
        this.cantidadMedicamento = cantidadMedicamento;
    }

    public void setPrincipiosActivos(ArrayList<String> principiosActivos) {
        this.principiosActivos = principiosActivos;
    }
    
}