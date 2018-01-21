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
public class ClienteDAO extends ConexionBD {
     public List<Cliente> listar() throws Exception{
        
        ArrayList<Cliente> listaClientes = new <Cliente>ArrayList(); 

        try{
            this.abrirConexion();
            //Cambiar esto segun la BBDD
            PreparedStatement st = this.getConexion().prepareStatement("SELECT * from clientes");
            ResultSet rs = st.executeQuery();
            while(rs.next()){
                Cliente cliente = new Cliente(); 
                cliente.setDni(rs.getString("dni")); 
                cliente.setName(rs.getString("nombre")); 
                cliente.setApellido(rs.getString("apellido")); 
                cliente.setFechaNacimineto(rs.getString("fechaNacimiento")); 
                cliente.setNumTelf(rs.getString("numTelf")); 
                cliente.setDireccion(rs.getString("direccion")); 
                cliente.setFechaIngreso(rs.getString("fechaIngreso"));
                cliente.setFechaUltMod(rs.getString("fechaUltMod"));
                ArrayList<String> listaMascotas=new <String>ArrayList();
                String stringMascotas=rs.getString("mascotas");
                String[] splitStringMascotas=stringMascotas.split(",");
                for(int i=0;i<splitStringMascotas.length;i++){
                    listaMascotas.add(splitStringMascotas[i]);
                }
                cliente.setMascotas(listaMascotas);
                
                
                listaClientes.add(cliente);
            }
            this.cerrarConexion(); 

        }catch (Exception e){
            throw new Exception("Listar clientes " + e.getMessage());
        }

        return(listaClientes);
    }
    
    public void eliminar(Cliente cliente) throws Exception {
        try{
            this.abrirConexion();
            PreparedStatement st = this.getConexion().prepareStatement("DELETE FROM cliente WHERE DNI==?");
            st.setString(1, cliente.getDni()); st.executeUpdate();
        }
        catch (Exception e){
            throw new Exception("Metodo Eliminar un Cliente " + e.getMessage()); 
        }finally{ 
            try{
                this.cerrarConexion(); 
            }catch (Exception e){
                throw new Exception("Cerrar conexion Eliminar un Cliente " + e.getMessage());
            } 
        }   
    }
    
    public void registrar(Cliente cliente) throws Exception{ 
        
        try {
            Connection cn;
            this.abrirConexion();
            cn=this.getConexion();
            
            PreparedStatement st = this.getConexion().prepareStatement("INSERT INTO empleados (dni, nombre, apellido, fechaNacimiento, numTelef, direccion, fechaIngreso,fechaUltMod) VALUES (?,?,?,?,?,?,?,?)");
            st.setString(1, cliente.getDni());
            st.setString(2, cliente.getName()); 
            st.setString(3, cliente.getApellido());
            st.setString(4, cliente.getFechaNacimineto());
            st.setString(5, cliente.getNumTelf());
            st.setString(6, cliente.getDireccion()); 
            st.setString(7, cliente.getFechaIngreso());
            st.setString(8, cliente.getFechaUltMod()); 
            st.executeUpdate();
            
        }catch(Exception e){
            throw new Exception("Insertar un cliente " + e.getMessage());
        }
        finally{
            try{
                this.cerrarConexion();
            }catch (Exception e){
                throw new Exception("Cerrar conexión insertar cliente " + e.getMessage()); 
            }
        }
    }
}
