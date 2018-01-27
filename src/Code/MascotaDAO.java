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
    
   public ArrayList<Mascota> listaMascotas = new <Mascota>ArrayList(); 
    public MascotaDAO() throws Exception{
        listar();
    }
    
     

    public ArrayList<Mascota> listar() throws Exception{
        
        
        try{
            this.abrirConexion();
            //Cambiar esto segun la BBDD
            PreparedStatement st = this.getConexion().prepareStatement("SELECT * from mascotas");
            ResultSet rs = st.executeQuery();
            while(rs.next()){
                Mascota mascota = new Mascota(); 
                mascota.setNumChip(Integer.parseInt(rs.getString("NumeroChip"))); 
                mascota.setNombre(rs.getString("Nombre")); 
                mascota.setTipo(rs.getString("TipoMascota")); 
                mascota.setRaza(rs.getString("Raza")); 
                mascota.setDniCliente(rs.getString("DNICliente")); 
                mascota.setPeso(Integer.parseInt(rs.getString("Peso")));
                mascota.setEdad(Integer.parseInt(rs.getString("Edad"))); 
                mascota.setEspecie(rs.getString("Especie")); 

                listaMascotas.add(mascota);
            }
            this.cerrarConexion();
            

        }catch (Exception e){
            throw new Exception("Listar usuarios " + e.getMessage());
        }

        return listaMascotas;
    }
    
    public void eliminar(Mascota mascota) throws Exception{
        try{
            this.abrirConexion();
            PreparedStatement st=this.getConexion().prepareStatement("DElETE FROM mascotas WHERE NumeroChip==?");
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
                    "INSERT INTO mascotas (NumeroChip, Nombre, TipoMascota, Raza, DNICliente, Peso, Edad, Especie) VALUES (?,?,?,?,?,?,?,?)");
            st.setInt(1, mascota.getNumChip()); 
            st.setString(2, mascota.getNombre());
            st.setString(3, String.valueOf(mascota.getTipo()));
            st.setString(4, mascota.getRaza());
            st.setString(5, mascota.getDniCliente());
            st.setFloat(6, mascota.getPeso()); 
            st.setInt(7, mascota.getEdad());
            st.setString(8, mascota.getEspecie());
            
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
    

