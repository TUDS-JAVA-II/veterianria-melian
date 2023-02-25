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
        String sql = "INSERT INTO personas (dni,apellido,nombres,domicilio,tel_movil,email) VALUES (?,?,?,?,?,?)";
        try {
            ps = conn.prepareStatement(sql);
            ps.setString(1, cliente.getDni());
            ps.setString(2, cliente.getApellidoCliente());
            ps.setString(3, cliente.getNombreCliente());
            ps.setString(4, cliente.getDomicilio());
            ps.setString(5, cliente.getNumCelular());
            ps.setString(6, cliente.getEmail());
            ps.execute();
            return true;
            // JOptionPane.showMessageDialog(null, "SE AGREGÓ CON EXITO AL USUARIO");
        } catch (SQLException e) {
            System.out.println("ERROR DE REGISTRO: " + e.getMessage());
            return false;
        }

    }
      
//    public int comprobarUsuario(String usuario){
//        PreparedStatement ps = null;
//        ResultSet rs;
//        
//        String sql = "SELECT count(usuario) FROM usuario WHERE usuario = ?";
//        try {
//            ps = conn.prepareStatement(sql);
//            ps.setString(1, usuario);
//      
//           rs= ps.executeQuery();
//            if (rs.next()) {
//                return rs.getInt(1);
//            }
//            return 1;
//        } catch (SQLException e) {
//           
//            return 1;
//        }
//    }
//  public boolean login(Cliente cliente){
//        PreparedStatement ps = null;
//        ResultSet rs;
//        
//        /**
//         * En la consulta multi tabla lo que se busca es relacionar 2 tablas partiendo de un mismo dato, en este caso el usuario
//         * y se busca traer el tipo de usuario desde otra tabla, para validar que tipo de usuario es. 1 para admin / 2 para usuario
//         * con esos datos, lo que se busca es darle privilegios de administrador y tener roles de usuarios.
//         */
//        String sql = "SELECT u.id, u.usuario, u.pass, u.tipousuario, t.nombre FROM usuario " //consulta multitabla de mysql
//                + "AS u INNER JOIN tipousuario AS t ON u.tipousuario=t.id WHERE usuario = ?"; // se esta relacionando el tipo de usuario con el id de la tambla tipo usuario
//        try {
//            ps = conn.prepareStatement(sql);
//            ps.setString(1, cliente.getNombreCliente());
//      
//           rs= ps.executeQuery();
//            if (rs.next()) {
//                if (cliente.getMascotas().equals(rs.getString(3))) {
//                   
//                    return true;
//                }else{
//                    return false;
//                }
//            } return false;
//         
//        } catch (SQLException e) {
//           
//            return false;
//        }
//    }

}
