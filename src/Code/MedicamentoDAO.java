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
 * @author cp
 */
public class MedicamentoDAO extends ConexionBD {
     public ArrayList<Medicamento> listaMedicamentos = new <Medicamento>ArrayList(); 
     public MedicamentoDAO()throws Exception{
         listar();
     }
    
        
    public  ArrayList<Medicamento> listar() throws Exception{    
        try{
            this.abrirConexion();
            //Cambiar esto segun la BBDD
            PreparedStatement st = this.getConexion().prepareStatement("SELECT * from medicamentos");
            ResultSet rs = st.executeQuery();
            while(rs.next()){
                Medicamento medicamento = new Medicamento(); 
                
                medicamento.setCodigoMedicamento(rs.getInt("CodigoMedicamento")); 
                medicamento.setNombreTecnico(rs.getString("NombreTecnico")); 
                medicamento.setCantidadMedicamento(rs.getInt("CantidadMedicamento")); 
               
                ArrayList<String> listaPrincipiosActivos=new <String>ArrayList();
                String stringPrincipiosActivos=rs.getString("PrincipiosActivos");
                String[] splitStringPrincipiosActivos=stringPrincipiosActivos.split(",");
                for(int i=0;i<splitStringPrincipiosActivos.length;i++){
                    listaPrincipiosActivos.add(splitStringPrincipiosActivos[i]);
                }
                medicamento.setPrincipiosActivos(listaPrincipiosActivos);
               // System.err.println("Añado "+medicamento.getNombreTecnico());
               // System.err.println("Añado "+medicamento.getCantidadMedicamento());
               // System.err.println("Añado "+medicamento.getPrincipiosActivos());
                
                listaMedicamentos.add(medicamento);
            }
            this.cerrarConexion(); 

        }catch (Exception e){
            throw new Exception("Listar medicamentos " + e.getMessage());
        }

        return listaMedicamentos;
    }
    
    public void eliminar(Medicamento medicamento) throws Exception {
        try{
            this.abrirConexion();
            PreparedStatement st = this.getConexion().prepareStatement("DELETE FROM medicamentos WHERE CodigoMedicamento = ?");
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
            
            PreparedStatement st = this.getConexion().prepareStatement("INSERT INTO medicamentos (CodigoMedicamento, NombreTecnico, CantidadMedicamento, PrincipiosActivos) VALUES (?,?,?,?)");
            st.setInt(1, medicamento.getCodigoMedicamento());
            st.setString(2, medicamento.getNombreTecnico()); 
            st.setInt(3, medicamento.getCantidadMedicamento());
            
            String prueba = String.join("", medicamento.getPrincipiosActivos());
            
            st.setString(4, prueba);
            
            
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
    
    public void modificar(Medicamento medicamento)throws Exception{
        try {
            Connection cn;
            this.abrirConexion();
            cn=this.getConexion();
            System.err.println("El medicamento que vamos a editar:");
            System.err.println(medicamento.getNombreTecnico());
            System.err.println(medicamento.getCodigoMedicamento());
            System.err.println(medicamento.getCantidadMedicamento());
            System.err.println(medicamento.getPrincipiosActivos());
            
            PreparedStatement st = this.getConexion().prepareStatement("UPDATE medicamentos SET CodigoMedicamento = ?, NombreTecnico = ?, CantidadMedicamento = ?, PrincipiosActivos = ? WHERE CodigoMedicamento = ?");
            System.out.println("Modificar el empleado");
            st.setInt(1, medicamento.getCodigoMedicamento());
            st.setString(2, medicamento.getNombreTecnico()); 
            st.setInt(3, medicamento.getCantidadMedicamento());
            //String prueba = String.join("", medicamento.getPrincipiosActivos());
            
            st.setString(4, medicamento.getPrincipiosActivosString());
           
            st.setInt(5, medicamento.getCodigoMedicamento());
            System.out.println(st);
            st.executeUpdate();
            
                    
        } catch (Exception e) {
            throw new Exception("modificar medicamento " + e.getMessage()); 
        }
        finally{
            try{
                
                this.cerrarConexion();
            }catch (Exception e){
                throw new Exception("Cerrar conexión modificar medicamento " + e.getMessage()); 
            }
        }
    }

}
