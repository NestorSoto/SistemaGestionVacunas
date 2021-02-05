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
public class nodoDoble {
    public Paciente valor;
    public nodoDoble siguiente;
    public nodoDoble anterior;
    public nodoDoble(Paciente valor){
        this.valor=valor;
        siguiente=null;
        anterior= null;
    }
    
}
