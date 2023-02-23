/*
 *Clase Cliente para Veterinaria Melian - Merlo, San Luis.
 *Fecha de inicio del proyecto: 14/2/2023
 */
package clases;

import java.util.ArrayList;

public class Cliente {

    private String nombreCliente;
    private String apellidoCliente;
    private String dni;
    private String numCelular;
    private String numFIjo;
    private String email;
    private String domicilio;
    private ArrayList<Mascota> mascotas;

    public String getNombreCliente() {
        return nombreCliente;
    }

    public void setNombreCliente(String nombreCliente) {
        this.nombreCliente = nombreCliente;
    }

    public String getApellidoCliente() {
        return apellidoCliente;
    }

    public void setApellidoCliente(String apellidoCliente) {
        this.apellidoCliente = apellidoCliente;
    }

    public String getDni() {
        return dni;
    }

    public void setDni(String dni) {
        this.dni = dni;
    }

    public String getNumCelular() {
        return numCelular;
    }

    public void setNumCelular(String numCelular) {
        this.numCelular = numCelular;
    }

    public String getNumFIjo() {
        return numFIjo;
    }

    public void setNumFIjo(String numFIjo) {
        this.numFIjo = numFIjo;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getDomicilio() {
        return domicilio;
    }

    public void setDomicilio(String domicilio) {
        this.domicilio = domicilio;
    }

    public ArrayList<Mascota> getMascotas() {
        return mascotas;
    }

    public void setMascotas(ArrayList<Mascota> mascotas) {
        this.mascotas = mascotas;
    }


}