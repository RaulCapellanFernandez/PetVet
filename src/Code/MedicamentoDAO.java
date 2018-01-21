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
                medicamento.setContrasena(rs.getString("contraseña")); 
                empleado.setNumTelf(rs.getString("numTelf")); 
                empleado.setTipo(Empleado.TipoDeEmpleado.valueOf(rs.getString("Tipo"))); 

                listaEmpleados.add(empleado);
            }
            this.cerrarConexion(); 

        }catch (Exception e){
            throw new Exception("Listar usuarios " + e.getMessage());
        }

        return(listaEmpleados);
    }
    
    public void eliminar(Empleado empleado) throws Exception {
        try{
            this.abrirConexion();
            PreparedStatement st = this.getConexion().prepareStatement("DELETE FROM empleado WHERE DNI==?");
            st.setString(1, empleado.getDni()); st.executeUpdate();
        }
        catch (Exception e){
            throw new Exception("Metodo Eliminar un Empleado " + e.getMessage()); 
        }finally{ 
            try{
                this.cerrarConexion(); 
            }catch (Exception e){
                throw new Exception("Cerrar conexion Eliminar un Empleado " + e.getMessage());
            } 
        }   
    }
    
    public void registrar(Empleado empleado) throws Exception{ 
        
        try {
            Connection cn;
            this.abrirConexion();
            cn=this.getConexion();
            
            PreparedStatement st = this.getConexion().prepareStatement("INSERT INTO empleados (dni, nombre, apellidos, numTelf, password) VALUES (?,?,?,?,?,?)");
            st.setString(1, empleado.getDni());
            st.setString(2, empleado.getName()); 
            st.setString(3, empleado.getApellido());
            st.setString(4, empleado.getContrasena());
            st.setString(5, empleado.getNumTelf());
            st.setString(6, String.valueOf(empleado.getTipo())); 
            st.executeUpdate();
            
        }catch(Exception e){
            throw new Exception("Insertar un empleado " + e.getMessage());
        }
        finally{
            try{
                
                this.cerrarConexion();
            }catch (Exception e){
                throw new Exception("Cerrar conexión insertar empleado " + e.getMessage()); 
            }
        }
    }
}
