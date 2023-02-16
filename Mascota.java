/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package veterinaria_rem;

import java.util.ArrayList;
import java.util.Date;

/**
 *
 * @author Gabriel
 */
public class Mascota {
                      //Atributos.
    protected String nombreMascota;
    protected String raza;
    protected String especie;
    protected Double peso;
    protected String tamanio;
    protected Date fechaNac;
    protected Date fechaIngreso;
    protected String sexo;
    protected boolean esterilizado;//Si/No
    protected Integer status;//Vivo/Muerto/Mudado/Dejo de ser paciente.
    protected ArrayList<String> motivoConsulta;
    protected Integer chip;
    
    //Metodos.
    
    public String getNombreMascota() {
        return nombreMascota;
    }

    public void setNombreMascota(String nombreMascota) {
        this.nombreMascota = nombreMascota;
    }

    public String getRaza() {
        return raza;
    }

    public void setRaza(String raza) {
        this.raza = raza;
    }

    public String getEspecie() {
        return especie;
    }

    public void setEspecie(String especie) {
        this.especie = especie;
    }

    public Double getPeso() {
        return peso;
    }

    public void setPeso(Double peso) {
        this.peso = peso;
    }

    public String getTamanio() {
        return tamanio;
    }

    public void setTamanio(String tamanio) {
        this.tamanio = tamanio;
    }

    public Date getFechaNac() {
        return fechaNac;
    }

    public void setFechaNac(Date fechaNac) {
        this.fechaNac = fechaNac;
    }

    public Date getFechaIngreso() {
        return fechaIngreso;
    }

    public void setFechaIngreso(Date fechaIngreso) {
        this.fechaIngreso = fechaIngreso;
    }

    public String getSexo() {
        return sexo;
    }

    public void setSexo(String sexo) {
        this.sexo = sexo;
    }

    public boolean isEsterilizado() {
        return esterilizado;
    }

    public void setEsterilizado(boolean esterilizado) {
        this.esterilizado = esterilizado;
    }

    public Integer getStatus() {
        return status;
    }

    public void setStatus(Integer status) {
        this.status = status;
    }

    public ArrayList<String> getMotivoConsulta() {
        return motivoConsulta;
    }

    public void setMotivoConsulta(ArrayList<String> motivoConsulta) {
        this.motivoConsulta = motivoConsulta;
    }
    
    public Integer getChip() {
        return chip;
    }

    public void setChip(Integer chip) {
        this.chip = chip;
    }
    
    
}
