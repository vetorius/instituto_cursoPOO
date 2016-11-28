/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package lanzador;

import pojo.Estudiante;
import pojo.Docente;

/**
 *
 * @author cpr1
 */
public class LanzadorPrincipal {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Estudiante estudiante1 = new Estudiante("Pepe", "Pérez", 1);
        System.out.println("El estudiante " + estudiante1.getNombre()+ " " + estudiante1.getPape() + " está en el curso " + estudiante1.getCurso());
        
        Docente docente1 = new Docente("Juan", "Rodríguez", "Informática");
        System.out.println("El profesor " + docente1.getNombre()+ " " + docente1.getPape() + " es de la especialidad " + docente1.getEspecialidad());
        
        
    }
    
}
