/*
Clase para insertar un usuario en la base de datos y para comprobar si el usuario existe y
poder iniciar sesion.
 */
package modelo;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;
public class SqlCliente extends Conectar{
     
         /**
     *METODO PARA AGREGAR UN NUEVO CLIENTE A LA BD
     * @param cliente - ES EL CLIENTE PASADO POR PARAMETRO CON TODOS SUS ATRIBUTOS
     * @return
     */
    public boolean AgregarCliente(Cliente cliente) {
        PreparedStatement ps = null;
        Connection conn = getConexion();
        //sentencia preparada en java con valores posicionales
        String sql = "INSERT INTO personas (dni,apellido,nombres,domicilio,celular,email) VALUES (?,?,?,?,?,?)";
        try {
            ps = conn.prepareStatement(sql);
            ps.setString(1, cliente.getDni());
            ps.setString(2, cliente.getApellidoCliente());
            ps.setString(3, cliente.getNombreCliente());
            ps.setString(4, cliente.getDomicilio());
            ps.setString(5, cliente.getNumCelular());
            ps.setString(6, cliente.getEmail());
            ps.executeUpdate();
            conn.close();
            return true;
            // JOptionPane.showMessageDialog(null, "SE AGREGÓ CON EXITO AL USUARIO");
        } catch (SQLException e) {
            System.out.println("ERROR DE REGISTRO: " + e.getMessage());
            return false;
        }
    }
}
