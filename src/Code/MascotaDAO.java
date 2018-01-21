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
public class MascotaDAO extends ConexionBD {
    
    public List<Mascota> listar() throws Exception{
        ArrayList<Mascota> listaMascotas =new <Mascota>ArrayList();
        try{
            this.abrirConexion();
            //Cambiar esto segun la BBDD
            PreparedStatement st = this.getConexion().prepareStatement("Select * from mascotas");
            ResultSet rs=st.executeQuery();
            while(rs.next()){
                Mascota mascota=new Mascota();
                mascota.setDniCliente(rs.getString("dniCliente"));
                mascota.setNombre(rs.getString("nombre"));
                mascota.setNumChip(rs.getInt("chip"));
                mascota.setPeso(rs.getFloat("peso"));
                mascota.setRaza(rs.getString("raza"));
                mascota.setTipo(Mascota.TipoDeMascota.valueOf(rs.getString("tipo")));
                
            }
            this.cerrarConexion();
            
        }catch(Exception e){
            throw new Exception("Listar mascotas "+e.getMessage());
        }
        return(listaMascotas);
    }
    
    public void eliminar(Mascota mascota) throws Exception{
        try{
            this.abrirConexion();
            PreparedStatement st=this.getConexion().prepareStatement("DElETE FROM mascotas WHERE chip==?");
            st.setInt(1,mascota.getNumChip());st.executeUpdate();
            
        }
        catch(Exception e){
             throw new Exception("Metodo Eliminar una Mascota " + e.getMessage()); 
        }finally{ 
            try{
                this.cerrarConexion(); 
            }catch (Exception e){
                throw new Exception("Cerrar conexion Eliminar una Mascota " + e.getMessage());
            } 
        }   
    }
    
    public void registrar(Mascota mascota) throws Exception{
        
        try{
            Connection cn;
            this.abrirConexion();
            cn=this.getConexion();
            
            PreparedStatement st=this.getConexion().prepareStatement(
                    "INSERT INTO mascotas (dniCliente, numChip, nombre, raza, tipo, peso) VALUES (?,?,?,?,?,?)");
            st.setString(1, mascota.getDniCliente());
            st.setInt(2, mascota.getNumChip()); 
            st.setString(3, mascota.getNombre());
            st.setString(4, mascota.getRaza());
            st.setString(5, String.valueOf(mascota.getTipo()));
            st.setFloat(6, mascota.getPeso()); 
            st.executeUpdate();
        }catch(Exception e){
            throw new Exception("Insertar una mascota "+e.getMessage());
            
        }
        finally{
            try{
                this.cerrarConexion();
                
            }catch(Exception e){
                throw new Exception("Cerrar conexion insertar una mascota "+e.getMessage());
            }
        }
    }
    
}
    

