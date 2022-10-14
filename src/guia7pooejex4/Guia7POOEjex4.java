/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package guia7pooejex4;

import Entidades.NIF;
import Servicios.nifServicio;

/**
 *
 * @author A288808
 */
public class Guia7POOEjex4 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        
        nifServicio ns = new nifServicio();
        
        NIF p1 = new NIF();
        
        ns.crearDni(p1);
        
        ns.mostrarNif(p1);
    }
    
}
