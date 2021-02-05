/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package estructura_Doble;

import newpackage.nodoDoble;
import newpackage.Paciente;

/**
 *
 * @author User
 */
public class listaDoble {
    private nodoDoble primero, ultimo;
    public listaDoble(){
        primero=null;
        ultimo=null;
        
    }
    void insertar(Paciente p){
      if(primero==null){
          primero= new nodoDoble(p);
          ultimo=primero;
      }else{
          nodoDoble aux=new nodoDoble(p);
          ultimo.siguiente=aux;
          aux.anterior=ultimo;
          ultimo=aux;

      }  
    }
    public void mostrarDelante(){
        nodoDoble aux=primero;
        while(aux!=null){
            System.out.println(aux.valor.toString());
            aux=aux.siguiente;
        }
    }
    public void mostrasDetras(){
        nodoDoble aux=ultimo;
        while(aux.anterior!=null){
            System.out.println(aux.valor.toString());
            aux=aux.anterior;
        }
    }/**
    public void insertarEnOrden(Paciente p){
        if(primero==ultimo){
            primero=new nodoDoble(p);
            ultimo=primero;
        }else{
            nodoDoble aux= new nodoDoble(p);
            if(aux.valor.getApellidos()<primero.valor.getApellidos()){
                
            }else{
                
            }
        }
    }
    * */

    /**
     * public void insertarEnOrden(Paciente p){
        if(primero==ultimo){
            primero=new nodoDoble(p);
            ultimo=primero;
        }else{
            nodoDoble aux= new nodoDoble(p);
            if(aux.valor.getApellidos()<primero.valor.getApellidos()){
                
            }else{
                
            }
        }
    }
     * @param DNI
     */
    public Paciente buscarDNI(int DNI){
        Paciente p=null;
        boolean encontro=false;
        nodoDoble aux= primero;
        while(aux!=null||!encontro){
            if(aux.valor.getDNI()==DNI){
                encontro=true;
                p=aux.valor;
            }
            aux=aux.siguiente;
        }
        return p;
    }
    /*
    public static void main(String[] args) {
        listaDoble l= new listaDoble();
        Paciente p=new Paciente("nombre","apellido",75465212,"fecha","direccion");
        Paciente p2=new Paciente("nombre2","apellido2",75465213,"fecha2","direccion2");
        l.insertar(p);
        l.insertar(p2);
        l.mostrasDetras();
        //System.out.println(l.buscarDNI(5));
       
    }
*/
}
