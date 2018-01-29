/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Code;

/**
 *
 * @author Mark
 */
public class Concentracion {
    private int idConc;
    private String nombrePrincipio;
    private String nombreMedicamento;
    private float concentracionPorUnidad;
    private float dosisPorKilo;
    
    public Concentracion(){
        
    }
    public int getIdConc(){
        return idConc;
    }
    public String getNombrePrincipio(){
        return nombrePrincipio;
    }
    public String getNombreMedicamento(){
        return nombreMedicamento;
    }
    public float getConcentracionPorUnidad(){
        return concentracionPorUnidad;
    }
    public float getDosisPorKilo(){
        return dosisPorKilo;
    }
    
    public void setIdConc(int a){
        this.idConc=a;
    }
    public void setNombrePrincipio(String a){
        this.nombrePrincipio=a;
    }
    public void setNombreMedicamento(String a){
        this.nombreMedicamento=a;
    }
    public void setConcentracionPorUnidad(float a){
        this.concentracionPorUnidad=a;
    }
    public void setDosisPorKilo(float a){
        this.dosisPorKilo=a;
    }
    
}
