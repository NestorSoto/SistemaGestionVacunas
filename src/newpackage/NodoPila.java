/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package newpackage;

/**
 *
 * @author User
 */
public class NodoPila {
    vacuna valor;
    NodoPila siguiente;

    public NodoPila() {
        valor= new vacuna();
    }

    public NodoPila(vacuna valor, NodoPila siguiente) {
        valor= new vacuna();
        this.valor = valor;
        this.siguiente = siguiente;
    }

    public vacuna getValor() {
        return valor;
    }

    public void setValor(vacuna valor) {
        this.valor = valor;
    }

    public NodoPila getSiguiente() {
        return siguiente;
    }

    public void setSiguiente(NodoPila siguiente) {
        this.siguiente = siguiente;
    }
    
    

}
