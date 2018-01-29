/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Code;

import java.sql.Array;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.ArrayList;
import java.util.List;
/**
 *
 * @author Mark
 */
public class ConcentracionDAO extends ConexionBD{
    public ArrayList<Concentracion> listaConcentraciones = new <Concentracion>ArrayList(); 
     public ConcentracionDAO()throws Exception{
         listar();
     }
    
        
    public ArrayList<Concentracion> listar() throws Exception{    
        try{
            this.abrirConexion();
            //Cambiar esto segun la BBDD
            PreparedStatement st = this.getConexion().prepareStatement("SELECT * from concentraciones");
            ResultSet rs = st.executeQuery();
            while(rs.next()){
                Concentracion concentracion = new Concentracion(); 
                
                concentracion.setConcentracionPorUnidad(rs.getFloat("concentracionPorUnidad"));
                concentracion.setDosisPorKilo(rs.getFloat("dosisPorKilo"));
                concentracion.setIdConc(rs.getInt("idConc"));
                concentracion.setNombreMedicamento(rs.getString("nombreMedicamento"));
                concentracion.setNombrePrincipio(rs.getString("nombrePrincipio"));
                
                listaConcentraciones.add(concentracion);
            }
            this.cerrarConexion(); 

        }catch (Exception e){
            throw new Exception("Listar medicamentos " + e.getMessage());
        }

        return listaConcentraciones;
    }
}
