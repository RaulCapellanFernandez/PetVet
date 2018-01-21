/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Code;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author cp
 */
public class MedicamentoDAO extends ConexionBD {
     ArrayList<Medicamento> listaMedicamentos = new <Medicamento>ArrayList(); 

    public List<Medicamento> listar() throws Exception{
        
        
        try{
            this.abrirConexion();
            //Cambiar esto segun la BBDD
            PreparedStatement st = this.getConexion().prepareStatement("SELECT * from medicamentos");
            ResultSet rs = st.executeQuery();
            while(rs.next()){
                Medicamento medicamento = new Medicamento(); 
                
                medicamento.setCodigoMedicamento(rs.getInt("codigo")); 
                medicamento.setNombreTecnico(rs.getString("nombre")); 
                medicamento.setCantidadMedicamento(rs.getInt("cantidad")); 
                ArrayList<String> listaPrincipiosActivos=new <String>ArrayList();
                String stringPrincipiosActivos=rs.getString("principiosActivos");
                String[] splitStringPrincipiosActivos=stringPrincipiosActivos.split(",");
                for(int i=0;i<splitStringPrincipiosActivos.length;i++){
                    listaPrincipiosActivos.add(splitStringPrincipiosActivos[i]);
                }
                medicamento.setPrincipiosActivos(listaPrincipiosActivos);
                
                
                listaMedicamentos.add(medicamento);
            }
            this.cerrarConexion(); 

        }catch (Exception e){
            throw new Exception("Listar medicamentos " + e.getMessage());
        }

        return(listaMedicamentos);
    }
    
    public void eliminar(Medicamento medicamento) throws Exception {
        try{
            this.abrirConexion();
            PreparedStatement st = this.getConexion().prepareStatement("DELETE FROM medicamento WHERE codigo==?");
            st.setInt(1, medicamento.getCodigoMedicamento()); st.executeUpdate();
        }
        catch (Exception e){
            throw new Exception("Metodo Eliminar un Medicamento " + e.getMessage()); 
        }finally{ 
            try{
                this.cerrarConexion(); 
            }catch (Exception e){
                throw new Exception("Cerrar conexion Eliminar un Medicamento " + e.getMessage());
            } 
        }   
    }
    
    public void registrar(Medicamento medicamento) throws Exception{ 
        
        try {
            Connection cn;
            this.abrirConexion();
            cn=this.getConexion();
            
            PreparedStatement st = this.getConexion().prepareStatement("INSERT INTO medicamento (codigo, nombre, cantidad, principiosActivos) VALUES (?,?,?,?)");
            st.setInt(1, medicamento.getCodigoMedicamento());
            st.setString(2, medicamento.getNombreTecnico()); 
            st.setInt(3, medicamento.getCantidadMedicamento());
            List<String> listaMedicamentos=medicamento.getPrincipiosActivos();
            String stringListaMedicamentos="";
            for (String medicamentoAux : listaMedicamentos) {
                stringListaMedicamentos=stringListaMedicamentos+medicamentoAux+",";
            }
            st.setString(4,stringListaMedicamentos);
            
            st.executeUpdate();
            
        }catch(Exception e){
            throw new Exception("Insertar un medicamento " + e.getMessage());
        }
        finally{
            try{
                
                this.cerrarConexion();
            }catch (Exception e){
                throw new Exception("Cerrar conexión insertar medicamento " + e.getMessage()); 
            }
        }
    }
}
