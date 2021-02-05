/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pilas;

import Gestor.cita;

public class Nodo {
    private cita valor;
    private Nodo siguiente;
    public void Nodo(){
       this.valor= new cita();
       this.siguiente=null;
    }

    public cita getValor() {
        return valor;
    }

    public void setValor(cita valor) {
        this.valor = valor;
    }

    public Nodo getSiguiente() {
        return siguiente;
    }

    public void setSiguiente(Nodo siguiente) {
        this.siguiente = siguiente;
    }
    
    
}
