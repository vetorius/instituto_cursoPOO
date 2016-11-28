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
public class Docente extends Persona {
    // atributos
    private String especialidad;
    
    // constructores
    public Docente(String nombre, String pape, String especialidad){
        super(nombre, pape);
        this.especialidad = especialidad;
    }
    // métodos
    public String saludar(){
        return "Don/Doña " + super.saludar();
    }
    /**
     * @return the especialidad
     */
    public String getEspecialidad() {
        return especialidad;
    }

    /**
     * @param especialidad the especialidad to set
     */
    public void setEspecialidad(String especialidad) {
        this.especialidad = especialidad;
    }
    
}
