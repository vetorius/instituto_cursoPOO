/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pojo;

/**
 *
 * @author cpr1
 */
public class Persona {
    // atributos
    private String nombre;
    private String pape;
    
    // constructores
    public Persona (String nombre, String pape){
        this.nombre = nombre;
        this.pape = pape;
    }
    
    // métodos
    public String saludar(){
        return this.nombre+" "+this.pape;
    }
    /**
     * @return the nombre
     */
    public String getNombre() {
        return nombre;
    }

    /**
     * @param nombre the nombre to set
     */
    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    /**
     * @return the pape
     */
    public String getPape() {
        return pape;
    }

    /**
     * @param pape the pape to set
     */
    public void setPape(String pape) {
        this.pape = pape;
    }
    
    
}
