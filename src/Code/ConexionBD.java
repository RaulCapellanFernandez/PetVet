package Code;
//Conecta la base de datos con el programa

import java.sql.Connection;
import java.sql.DriverManager;

public class ConexionBD {
    private String dataBaseURL; 
    private String driverName; 
    private String user;
    private String pass;
    private Connection conexion;
    //Getters y setters de la clase
    public String getDataBaseURL() {
        return dataBaseURL;
    }

    public String getDriverName() {
        return driverName;
    }

    public String getUser() {
        return user;
    }

    public String getPass() {
        return pass;
    }

    public void setDataBaseURL(String dataBaseURL) {
        this.dataBaseURL = dataBaseURL;
    }

    public void setDriverName(String driverName) {
        this.driverName = driverName;
    }

    public void setUser(String user) {
        this.user = user;
    }

    public void setPass(String pass) {
        this.pass = pass;
    }
    //Fin Getters y Setters
    public ConexionBD(){//HAY QUE MODIFICAR TODO ESTO CON LOS DATOS DE NUESTRA BASE DE DATOS-------------------------
        this.dataBaseURL = "jdbc:mysql://localhost:3306/instituto?autoReconnect=true&useSSL=true"; 
        this.driverName = "com.mysql.jdbc.Driver";
        this.user = "softwareI";
        this.pass = "softwareI";
    }
    public void abrirConexion() throws Exception{
        if ((dataBaseURL=="") || (user=="") || (pass=="") || (driverName=="")){
            System.out.println("Error al crear la conexión (¿están inicializados?) con estos valores:"); 
            this.mostrarValoresConexion();
        } else {
            try{
                Class.forName(this.driverName);
                this.conexion = DriverManager.getConnection(this.dataBaseURL, this.user, this.pass);
            }
            catch (Exception e){
                throw new Exception("Al abrir la base de datos " + e.getMessage()); }
            } 
    } 
    public void cerrarConexion() throws Exception { 
        try {
            this.conexion.close();
            System.out.println ("Cierre correcto de la conexión con la base de datos"); }
        catch (Exception e){
        throw new Exception("Al cerrar la conexión de la base de datos. " + e.getMessage());
        } }

    private void mostrarValoresConexion() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
}
