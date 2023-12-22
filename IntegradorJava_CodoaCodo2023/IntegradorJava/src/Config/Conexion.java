
package Config;
import java.sql.Connection;
import java.sql.DriverManager;


public class Conexion {
    
    Connection con;    //Variable de Tipo Conection
    
    public Conexion(){  //Metodo 
        try {
            Class.forName("com.mysql.cj.jdbc.Driver");            
            con=DriverManager.getConnection("jdbc:mysql://localhost:3306/voluntarios","root","240103");
        } catch (Exception e) {
        }
    } 
    public Connection getConnection(){ //Metodo Retorno de Conexión 
        return con;
    }
}
