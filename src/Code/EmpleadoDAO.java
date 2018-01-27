package Code;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.ArrayList;
import java.util.List;
import java.util.logging.Level;
import java.util.logging.Logger;

/*
Clase encargada de comunicar la base de datos con el codigo de dicha clase
*/
public class EmpleadoDAO extends ConexionBD {
    public ArrayList<Empleado> listaEmpleados = new <Empleado>ArrayList(); 
    public EmpleadoDAO() throws Exception{
        listar();
    }
    
     

    public void listar() throws Exception{
        
        
        try{
            this.abrirConexion();
            //Cambiar esto segun la BBDD
            PreparedStatement st = this.getConexion().prepareStatement("SELECT * from empleados");
            ResultSet rs = st.executeQuery();
            while(rs.next()){
                Empleado empleado = new Empleado(); 
                empleado.setDni(rs.getString("DNI")); 
                empleado.setName(rs.getString("Nombre")); 
                empleado.setApellido(rs.getString("Apellidos")); 
                empleado.setNumTelf(rs.getString("Telefono")); 
                empleado.setContrasena(rs.getString("Contraseña")); 
                empleado.setCuentaBancaria(rs.getString("CuentaBancaria"));
                empleado.setTipo(rs.getString("Tipo")); 

                listaEmpleados.add(empleado);
            }
            System.out.println("Cierro la conexion");
            this.cerrarConexion(); 

        }catch (Exception e){
            throw new Exception("Listar usuarios " + e.getMessage());
        }

        return;
    }
    
    public void eliminar(Empleado empleado) throws Exception {
        try{
            this.abrirConexion();
            System.out.println("DELETE FROM empleados WHERE DNI="+empleado.getDni());
            PreparedStatement st = this.getConexion().prepareStatement("DELETE FROM empleados WHERE DNI=?");
            st.setString(1, empleado.getDni()); 
            st.executeUpdate();
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
            
            PreparedStatement st = this.getConexion().prepareStatement("INSERT INTO empleados (DNI, Nombre, Apellidos, Telefono, Contraseña, CuentaBancaria, Tipo) VALUES (?,?,?,?,?,?,?)");
            System.out.println("Vamos a registrar al empleado "+empleado.getName());
            st.setString(1, empleado.getDni());
            st.setString(2, empleado.getName()); 
            st.setString(3, empleado.getApellido());
            st.setString(4, empleado.getNumTelf());
            st.setString(5, empleado.getContrasena());
            st.setString(6, empleado.getCuentaBancaria());
            st.setString(7, empleado.getTipo()); 
            System.out.println(st);
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
    public void modificar(Empleado empleado)throws Exception{
        try {
            Connection cn;
            this.abrirConexion();
            cn=this.getConexion();
            PreparedStatement st = this.getConexion().prepareStatement("UPDATE empleados SET DNI = ?, Nombre = ?, Apellidos = ?, Telefono = ?, Contraseña = ?, CuentaBancaria = ?, Tipo = ? WHERE DNI = ?");
            System.out.println("Modificar el empleado");
            st.setString(1, empleado.getDni());
            st.setString(2, empleado.getName()); 
            st.setString(3, empleado.getApellido());
            st.setString(4, empleado.getNumTelf());
            st.setString(5, empleado.getContrasena());
            st.setString(6, empleado.getCuentaBancaria());
            st.setString(7, empleado.getTipo()); 
            st.setString(8, empleado.getDni());
            System.out.println(st);
            st.executeUpdate();
            
                    
        } catch (Exception e) {
            throw new Exception("modificar empleado " + e.getMessage()); 
        }
        finally{
            try{
                
                this.cerrarConexion();
            }catch (Exception e){
                throw new Exception("Cerrar conexión modificar empleado " + e.getMessage()); 
            }
        }
            
    }
    
}
