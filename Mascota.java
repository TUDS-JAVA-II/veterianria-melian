/*
 *Clase Mascota para Veterinaria Melian - Merlo, San Luis.
 *Fecha de inicio del proyecto: 14/2/2023
 */
package clases;

public class Mascota {
    protected String nombre;
    protected String raza;
    protected int edadMascota;
    protected String apodo; // si lo tiene
    protected String tipoDeAnimal; //conejo, gato, loro, perro, etc.
    protected String color; // opcional
    protected String tamano; // pequeño, mediano, grande
    protected float kilogramos;

    public String getNombre() {
        return nombre;
    }
    public void setNombre(String nombre) {
        this.nombre = nombre;
    }
    public String getTipoRaza() {
        return raza;
    }
    public void setTipoRaza(String tipoRaza) {
        this.raza = tipoRaza;
    }
    public int getEdadMascota() {
        return edadMascota;
    }
    public void setEdadMascota(int edadMascota) {
        this.edadMascota = edadMascota;
    }
    public String getApodo() {
        return apodo;
    }
    public void setApodo(String apodo) {
        this.apodo = apodo;
    }
    public String getTipo() {
        return tipoDeAnimal;
    }
    public void setTipo(String tipo) {
        this.tipoDeAnimal = tipo;
    }
    public String getColor() {
        return color;
    }
    public void setColor(String color) {
        this.color = color;
    }
    public String getTamano() {
        return tamano;
    }
    public void setTamano(String tamano) {
        this.tamano = tamano;
    }
    public float getKilogramos() {
        return kilogramos;
    }
    public void setKilogramos(float kilogramos) {
        this.kilogramos = kilogramos;
    }

    
    
    
}
