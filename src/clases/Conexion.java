/*--------- PRIMER PROYECTO REAL ----------------------------------
 Conexion a base de datos de stock de puertas de Veterinaria REM
 */
package Clases;

import java.awt.HeadlessException;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class Conexion {
    private Connection conectar;
    private final String base = "veterinaria"; //nombre de la base de datos
    private final String usuario = "root"; // usuario para acceder a la base de datos, por defecto es 'root'
    private final String pass = ""; // contraseña para acceder, por defecto el usuario root, no tiene contraseña
    private final String url = "jdbc:mysql://localhost:3306/" + base; // URL es la direccion de la conexion, por defecto en local y el puerto 3306 + el nombre de la db

    public Connection getConexion() {
        try {
            Class.forName("org.mariadb.jdbc.Driver"); 
            conectar = DriverManager.getConnection(url,usuario,pass);
           /**
            * descomentar la linea 25 y corroborar en consola que la conexion sea correcta
            */
            //System.out.println("Conectado exitosamente!");
        } catch (HeadlessException | ClassNotFoundException | SQLException e) {
            System.out.println(e.getMessage());
        }
        return conectar;
    
    }
}
