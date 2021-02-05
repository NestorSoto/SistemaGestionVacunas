/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package newpackage;

import Gestor.cita;

public class Cola {
    public nodoCita frente;
    public nodoCita Final;

    public Cola() {
        this.frente = null;
        this.Final = null;
    }
    public boolean vacio(){
        if(frente==null){
            return true;
        }else{
            return false;
        }
    }
    public void encolar(cita v){
        nodoCita n= new nodoCita();
        n.valor=v;
        n.siguiente=null;
        
        if(vacio()){
            frente=n;
        }else{
            Final.siguiente=n;
        }
        Final=n;
        
    }
    public cita Desencolar(){
        if(vacio()){
            return null;
        }else{
            cita dato;
            dato =frente.valor;
            if(Final==frente){
                Final=null;
                frente=null;
            }else{
                frente=frente.siguiente;
            }
            return dato;
        }
    }
    
    public boolean buscarenCola(Paciente p){
        boolean encontro=false;
        if(vacio()){
            
        }else{
            nodoCita n= new nodoCita();
            n =frente;
            while(n.siguiente!=Final&&!encontro){
                if(n.valor.dni==p.getDNI()){
                    encontro=true;
                }
            }
        }
        
        return encontro;
    }
    /*
    public String DobleCola(String dato, int lugar){
        nodo n=new nodo();
        //n.valor=dato;
        if(lugar==1){//entrada por delante
            n.siguiente=frente;
            frente=n;
            return "Dato guardardado al frente";
        }else{
            Final.siguiente=n;
            Final=n;
            return"Dato guardado al final";
        }
    }
    */
    public void mostrarCola(){
        if(vacio()){
            System.out.println("cola vacia");
        }else{
            nodoCita n= new nodoCita();
            n=frente;
            while(n.siguiente!=null){
                System.out.println(n.valor);
                n=n.siguiente;
            }
        }
    }


    public nodoCita getFrente() {
        return frente;
    }

    public void setFrente(nodoCita frente) {
        this.frente = frente;
    }

    public nodoCita getFinal() {
        return Final;
    }

    public void setFinal(nodoCita Final) {
        this.Final = Final;
    }
    /*
    public static void main(String[] args) {
        Cola c= new Cola();
        cita ci= new cita();
        ci.setDni(75465212);
        ci.setFecha("fecha");
        ci.setHora(12);
        c.encolar(ci);
        c.mostrarCola();
    }
*/

 
    
}
