/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Servicios;

import Entidades.NIF;
import java.util.Scanner;

/**
 *
 * @author A288808
 */
public class nifServicio {
    
    Scanner leer = new Scanner(System.in);
    String letra[]=new String[23];
    int resto =0;
    
    
    
    public void crearDni(NIF d){
        
        System.out.println("ingrese el numero del DNI");
        d.setDNI(leer.nextInt());
        
        letra[0]="T";
        letra[1]="R";
        letra[2]="W";
        letra[3]="A";
        letra[4]="G";
        letra[5]="M";
        letra[6]="Y";
        letra[7]="F";
        letra[8]="P";
        letra[9]="D";
        letra[10]="X";
        letra[11]="B";
        letra[12]="N";
        letra[13]="J";
        letra[14]="Z";
        letra[15]="S";
        letra[16]="Q";
        letra[17]="V";
        letra[18]="H";
        letra[19]="L";
        letra[20]="C";
        letra[21]="K";
        letra[22]="E";
        
        resto=d.getDNI()%23;
       
        System.out.println(resto);
        
        d.setLdni(letra[resto]);
        
        
    }
    
    public void mostrarNif(NIF m){
        
        System.out.println(m.getDNI() + "-" + m.getLdni());
        
        
        
    }
    
    
}
