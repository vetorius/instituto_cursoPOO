/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package lanzador;

import pojo.Estudiante;
/**
 *
 * @author cpr1
 */
public class LanzadorPrincipal {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Estudiante estudiante1 = new Estudiante("Pepe", "Pérez");

        estudiante1.setCurso(1);
        
        System.out.println("El estudiante " + estudiante1.getNombre()+ " " + estudiante1.getPape() + " está en el curso " + estudiante1.getCurso());
    }
    
}
