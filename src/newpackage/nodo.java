/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package newpackage;

/**
 *
 * @author T800
 */
public class nodo{
    Paciente valor;
    nodo siguiente;

    public nodo() {
        this.valor = null;
        this.siguiente = null;
    }

    public Paciente getValor() {
        return valor;
    }

    public void setValor(Paciente valor) {
        this.valor = valor;
    }

    public nodo getSiguiente() {
        return siguiente;
    }

    public void setSiguiente(nodo siguiente) {
        this.siguiente = siguiente;
    }
    
    
}