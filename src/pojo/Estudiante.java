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
public class Estudiante  extends Persona {
    // atributos
    private int curso;
    
    // constructores
    public Estudiante(String nombre, String pape, int curso){
        super(nombre, pape);
        this.curso = curso;
    }
    
    // métodos

    /**
     * @return the curso
     */
    public int getCurso() {
        return curso;
    }

    /**
     * @param curso the curso to set
     */
    public void setCurso(int curso) {
        this.curso = curso;
    }
    
}
