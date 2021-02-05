/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package estructura_Doble;

import newpackage.Paciente;

/**
 *
 * @author User
 */
public class Nodo {
    public Paciente info;
    public Nodo siguiente, anterior;
    Nodo(Paciente p){
        info=p;
        siguiente= anterior=null;
    }
    public Nodo(){
        
    }
    
}
