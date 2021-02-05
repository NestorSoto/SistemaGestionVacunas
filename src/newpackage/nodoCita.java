/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package newpackage;

import Gestor.cita;

/**
 *
 * @author User
 */
public class nodoCita {
    cita valor;
    nodoCita siguiente;

    public nodoCita() {
        this.valor = null;
        this.siguiente = null;
    }

    public cita getValor() {
        return valor;
    }

    public void setValor(cita valor) {
        this.valor = valor;
    }

    public nodoCita getSiguiente() {
        return siguiente;
    }

    public void setSiguiente(nodoCita siguiente) {
        this.siguiente = siguiente;
    }

    public nodoCita(cita valor, nodoCita siguiente) {
        this.valor = valor;
        this.siguiente = siguiente;
    }
    
}
