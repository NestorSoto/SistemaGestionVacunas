/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pilas;

import Gestor.cita;

/**
 *
 * @author User
 */
public class cola {

    private static final int MAXTAM = 10;
    private int frente;
    public int ultimo;
    public cita[] citas;

    public cola() {
        frente = 0;
        ultimo = -1;
        citas = new cita[MAXTAM];
    }

    public boolean colaLLena() {
        return ultimo == MAXTAM - 1;
    }

    public boolean colaVacia() {
        return frente > ultimo;
    }

    public void encolar(cita c) throws Exception {
        if (!colaLLena()) {
            citas[++ultimo] = c;
        } else {
            throw new Exception("cola llena");
        }
    }

    public cita eliminarQ() throws Exception {
        if (!colaVacia()) {
            return citas[frente++];
        } else {
            throw new Exception("Cola vacia");
        }
    }

    public int getFrente() {
        return frente;
    }

    public int getUltimo() {
        return ultimo;
    }

    public cita[] getCitas() {
        return citas;
    }
    
    /*

    public static void main(String[] args) throws Exception {
        cola c = new cola();
        cita c2 = new cita(75465212, "fecha", 12);
        c.encolar(c2);
        c.encolar(c2);
        c.encolar(c2);
        cita ci= new cita();
        ci=c.eliminarQ();
        ci=c.eliminarQ();
        ci=c.eliminarQ();
        
        
        for (int i = c.getFrente(); i <= c.ultimo; i++) {
            System.out.println(c.citas[i].toString());
        }

    }*/
}
