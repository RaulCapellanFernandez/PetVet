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
 *
 */
public class ClienteDAO extends ConexionBD {
    public ArrayList<Cliente> listaClientes = new <Cliente>ArrayList(); 
    public ClienteDAO() throws Exception{
        listar();
    }
    
    public void listar() throws Exception{
        try{
            this.abrirConexion();
            //Cambiar esto segun la BBDD
            PreparedStatement st = this.getConexion().prepareStatement("SELECT * from clientes");
            ResultSet rs = st.executeQuery();
            while(rs.next()){
                Cliente cliente = new Cliente(); 
                cliente.setDni(rs.getString("DNI")); 
                cliente.setName(rs.getString("Nombre")); 
                cliente.setApellido(rs.getString("Apellidos")); 
                cliente.setNumTelf(rs.getString("Telefono")); 
                cliente.setDireccion(rs.getString("Dir")); 
                cliente.setFechaIngreso(rs.getString("FechaIngreso"));
                cliente.setFechaNacimineto(rs.getString("FechaNacimiento")); 
                cliente.setFechaUltMod(rs.getString("FechaUltimaVisita"));
                ArrayList<String> listaMascotas=new <String>ArrayList();
                String stringMascotas=rs.getString("Mascotas");
                String[] splitStringMascotas=stringMascotas.split(",");
                for(int i=0;i<splitStringMascotas.length;i++){
                    listaMascotas.add(splitStringMascotas[i]);
                }
                System.err.println("Mascotas de "+cliente.getName()+" : "+listaMascotas);
                cliente.setMascotas(listaMascotas);
                listaClientes.add(cliente);
            }
            this.cerrarConexion(); 

        }catch (Exception e){
            throw new Exception("Listar clientes " + e.getMessage());
        }

        return;
    
    }
        
    
    public void eliminar(Cliente cliente) throws Exception {
        try{
            this.abrirConexion();
            PreparedStatement st = this.getConexion().prepareStatement("DELETE FROM clientes WHERE DNI LIKE ?");
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
            
            PreparedStatement st = this.getConexion().prepareStatement("INSERT INTO clientes VALUES (?,?,?,?,?,?,?,?,?,?)");
            st.setString(1, cliente.getDni());
            st.setString(2, cliente.getName()); 
            st.setString(3, cliente.getApellido());
            st.setString(4, cliente.getNumTelf());
            st.setString(5, cliente.getDireccion()); 
            st.setString(6, cliente.getFechaIngreso());
            st.setString(7, cliente.getFechaNacimineto());
            st.setString(8, cliente.getFechaUltMod()); 
            List<String> listaMascotas=cliente.getMascotas();
            String stringListaMascotas="";
            for (String mascotaAux : listaMascotas) {
                stringListaMascotas=stringListaMascotas+mascotaAux+",";
            }
            st.setString(9,stringListaMascotas);
            st.setFloat(10,cliente.getDeuda());
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

    public void modificar(Cliente cliente, String nombreViejo) throws Exception {
        try{
            Connection cn;
            this.abrirConexion();
            cn=this.getConexion();
            PreparedStatement st = this.getConexion().prepareStatement("UPDATE clientes SET DNI = ?, Nombre = ?, Apellidos = ?, Telefono = ?, Dir = ?, FechaIngreso = ?, FechaNacimiento=?, FechaUltimaVisita=?, Mascotas=?, Deuda=? WHERE Nombre = ?");
           
            st.setString(1, cliente.getDni());
            st.setString(2, cliente.getName()); 
            st.setString(3, cliente.getApellido());
            st.setInt(4, Integer.parseInt(cliente.getNumTelf()));
            st.setString(5, cliente.getDireccion());
            st.setString(6, cliente.getFechaIngreso());
            st.setString(7, cliente.getFechaNacimineto() ); 
            st.setString(8, cliente.getFechaUltMod());
            List<String> listClient=cliente.getMascotas();
            String strListClientes="";
            for(String aux : listClient){
                strListClientes=strListClientes+aux+",";
            }
            st.setString(9, strListClientes);
            st.setInt(10,20);
            st.setString(11,nombreViejo);
            System.out.println(st);

            st.executeUpdate();


        } catch (Exception e) {
            throw new Exception("modificar cliente " + e.getMessage()); 
        }
        finally{
            try{
                
                this.cerrarConexion();
            }catch (Exception e){
                throw new Exception("Cerrar conexión modificar cliente " + e.getMessage()); 
            }
        }
            
    }
}
