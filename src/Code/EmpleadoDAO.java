package Code;

import Code.ConexionBD;
import Code.Empleado;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.ArrayList;
import java.util.List;

/*
Clase encargada de comunicar la base de datos con el codigo de dicha clase
*/
public class EmpleadoDAO extends ConexionBD {
    
    public List<Empleado> listar() throws Exception{
        
        ArrayList<Empleado> listaEmpleados = new <Empleado>ArrayList(); 

        try{
            this.abrirConexion();
            PreparedStatement st = this.getConexion().prepareStatement("SELECT * from empleados");
            ResultSet rs = st.executeQuery();

            while(rs.next()){
                Empleado empleado = new Empleado(); 
                empleado.setDni(rs.getInt("dni")); 
                empleado.setName(rs.getString("nombre")); 
                empleado.setApellido(rs.getString("apellido")); 
                empleado.setContrasena(rs.getString("contraseña")); 
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
            PreparedStatement st = this.getConexion().prepareStatement("DELETE FROM empleado WHEREDNI=?");
            st.setInt(1, empleado.getDni()); st.executeUpdate();
        }
        catch (Exception e){
            throw new Exception("Metodo Eliminar un Empleado " + e.getMessage()); 
            }finally{ 
                try{
                    this.cerrarConexion(); 
                }catch (Exception e){
                    throw new Exception("Metodo Eliminar un Empleado " + e.getMessage());
                } 
            }   
    }
    
    public void registrar(Empleado empleado) throws Exception{ 
        
        try {
            Connection cn;
            this.abrirConexion();
            cn=this.getConexion();
            
            PreparedStatement st = this.getConexion().prepareStatement("INSERT INTO empleados (dni, nombre, apellidos, numTelf, password) VALUES (?,?,?)");
            st.setInt(1, empleado.getDni());
            st.setString(2, empleado.getName()); 
            st.setString(3, empleado.getApellido());
            st.setString(4, empleado.getContrasena());
            st.setString(4, empleado.getNumTelf());
            st.setString(3, String.valueOf(empleado.getTipo())); 
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
