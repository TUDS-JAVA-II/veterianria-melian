/*
 *Clase Usuario para Veterinaria Melian - Merlo, San Luis.
 *Fecha de inicio del proyecto: 14/2/2023
 */
package clases;

public class Usuario {
protected String nombreUsuario;
protected long dni;
protected long numCelular;
protected long numFijo;
protected String direccion;
protected Mascota mascota;

    public String getNombreUsuario() {
        return nombreUsuario;
    }
    public void setNombreUsuario(String nombreUsuario) {
        this.nombreUsuario = nombreUsuario;
    }
    public long getDni() {
        return dni;
    }
    public void setDni(long dni) {
        this.dni = dni;
    }
    public long getNumCelular() {
        return numCelular;
    }
    public void setNumCelular(long numCelular) {
        this.numCelular = numCelular;
    }
    public long getNumFijo() {
        return numFijo;
    }
    public void setNumFijo(long numFijo) {
        this.numFijo = numFijo;
    }
    public String getDireccion() {
        return direccion;
    }
    public void setDireccion(String direccion) {
        this.direccion = direccion;
    }
    public Mascota getMascota() {
        return mascota;
    }
    public void setMascota(Mascota mascota) {
        this.mascota = mascota;
    }

    


    
}
