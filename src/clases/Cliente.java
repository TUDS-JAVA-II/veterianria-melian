/*
 *Clase Cliente para Veterinaria Melian - Merlo, San Luis.
 *Fecha de inicio del proyecto: 14/2/2023
 */
package clases;

import java.util.ArrayList;

public class Cliente {
protected String nombreUsuario;
protected long dni;
protected long numCelular;
protected String direccion;
protected ArrayList<Mascota> mascotas;

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
    public String getDireccion() {
        return direccion;
    }
    public void setDireccion(String direccion) {
        this.direccion = direccion;
    }
    public ArrayList<Mascota> getMascotas() {
        return mascotas;
    }
    public void setMascotas(ArrayList<Mascota> mascotas) {
        this.mascotas = mascotas;
    }

}
