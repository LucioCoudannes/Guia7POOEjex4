/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Entidades;

/**
 *
 * @author A288808
 */
public class NIF {
    
    private int DNI;
    private String Ldni;

    public NIF() {
    }

    public NIF(int DNI, String Ldni) {
        this.DNI = DNI;
        this.Ldni = Ldni;
    }

    public int getDNI() {
        return DNI;
    }

    public void setDNI(int DNI) {
        this.DNI = DNI;
    }

    public String getLdni() {
        return Ldni;
    }

    public void setLdni(String Ldni) {
        this.Ldni = Ldni;
    }

    @Override
    public String toString() {
        return "NIF{" + "DNI=" + DNI + ", Ldni=" + Ldni + '}';
    }
    
    
    
    
    
    
}
