/*--------- PRIMER PROYECTO REAL ----------------------------------
 Conectar a base de datos de stock de puertas de Veterinaria REM
 */
package modelo;

import java.awt.HeadlessException;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;



public class Conectar { 
    private Connection conectar = null;
    private final String base = "veterinaria"; //nombre de la base de datos
    private final String usuario = "root"; // usuario para acceder a la base de datos, por defecto es 'root'
    private final String pass = ""; // contraseña para acceder, por defecto el usuario root, no tiene contraseña
    private final String url = "jdbc:mysql://localhost:3306/" + base; // URL es la direccion de la conexion, por defecto en local y el puerto 3306 + el nombre de la db
    private static ResultSet rs;
    private static Statement consultas;
    public Connection getConexion() {
        try {
            Class.forName("org.mariadb.jdbc.Driver"); 
            conectar = DriverManager.getConnection(url,usuario,pass);
            consultas = conectar.createStatement();
            
           /**
            * descomentar la linea 32 y corroborar en consola que la conexion sea correcta
            */
           // System.out.println("Conectado exitosamente!");
        } catch (HeadlessException | ClassNotFoundException | SQLException e) {
            System.out.println(e.getMessage());
        }
        return conectar;
    
    }

    
    /**
     * Aca voy a poner querys de SQL para poder manejar los diferentes botones
     * @param cliente
     * @return 
    **/
//    public String Consultar(){
//        String salida = "";
//        try {
//        
//        conectar=getConexion();
//       String Sql = "SELECT * FROM personas";
//        System.out.println(Sql);
//        
////            executeUpdate se usa para modificar la bd (delete,update,create son las 3 maneras de modificar una bd)
////            executeQuery se usar unicamente para hacerle una consulta a la bd
//            rs = consultas.executeQuery(Sql);
//            while (rs.next()){
//            salida += rs.getString(1)+"\t";
//            salida += rs.getString(2)+"\t";
//            salida += rs.getString(3)+"\t";
//            salida += rs.getString(4)+"\t";
//            salida += rs.getString(5)+"\t";
//            salida += rs.getString(6)+"\t\n";
//            System.out.println("linea 60, deberia traer los registros");
//            }
//                
//        } catch (Exception e) {
//            System.out.println("No se pudo consultar "+e);
//        }
//        return salida;
//}
    
}
