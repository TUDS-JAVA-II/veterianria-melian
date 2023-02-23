/*--------- PRIMER PROYECTO REAL ----------------------------------
 Conexion a base de datos de stock de puertas de Veterinaria REM
 */
package Clases;

import java.awt.HeadlessException;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

public class Conexion {
    private Statement consultas = null;
    private ResultSet resultado = null;
    private Connection conectar;
    private final String base = "veterinaria"; //nombre de la base de datos
    private final String usuario = "root"; // usuario para acceder a la base de datos, por defecto es 'root'
    private final String pass = ""; // contraseña para acceder, por defecto el usuario root, no tiene contraseña
    private final String url = "jdbc:mysql://localhost:3306/" + base; // URL es la direccion de la conexion, por defecto en local y el puerto 3306 + el nombre de la db

    public Connection getConexion() {
        try {
            Class.forName("org.mariadb.jdbc.Driver"); 
            conectar = DriverManager.getConnection(url,usuario,pass);
            consultas=conectar.createStatement();
           /**
            * descomentar la linea 25 y corroborar en consola que la conexion sea correcta
            */
            //System.out.println("Conectado exitosamente!");
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
//    public boolean addUser(Cliente cliente) {
//        String sql = "INSERT INTO personas(dni,apellido,nombres,domicilio,tel_movil,tel_fijo,email)Values(?,?,?,?,?,?,?)";
//        try {
//            consultas = conectar.prepareStatement(sql);
//            consultas.setString(1, cliente.getDni());
//            consultas.setString(2, cliente.getApellidoCliente());
//            consultas.setInt(3, cliente.getNombreCliente);
//            consultas.setInt(4, cliente.getDomicilio());
//            consultas.setInt(5, cliente.getNumCelular());
//            consultas.setInt(6, cliente.getNumFijo());
//            consultas.setInt(7, cliente.getEmail());
//            consultas.executeQuery(sql);
//            return true;
//            // JOptionPane.showMessageDialog(null, "SE AGREGÓ CON EXITO AL USUARIO");
//        } catch (SQLException e) {
//            System.out.println("ERROR DE REGISTRO: " + e.getMessage());
//            return false;
//        }
//
//    }
//    public String Consultar(){
//        String salida = "";
//        String consulta = "SELECT * FROM personas";
//        try {
//            //executeUpdate se usa para modificar la bd (delete,update,create son las 3 maneras de modificar una bd)
//            //executeQuery se usar unicamente para hacerle una consulta a la bd
//            resultado = consultas.executeQuery(consulta);
//            while (resultado.next()){
//            salida += resultado.getString(1)+"\t";
//            salida += resultado.getString(2)+"\t";
//            salida += resultado.getString(3)+"\t";
//            salida += resultado.getString(4)+"\t";
//            salida += resultado.getString(5)+"\t";
//            salida += resultado.getString(6)+"\t";
//            salida += resultado.getString(7)+"\t\n";
//            
//            }
//                
//        } catch (Exception e) {
//            System.out.println("No se pudo consultar"+e);
//        }
//        return salida;
//    }

}
