/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package newpackage;

public class Pila {
    int cima;
    nodo cabeza;

    public Pila() {
        this.cima =0;
        this.cabeza = null;
    }
    boolean vacio(){
        if(cima==0){
            return true;
        }else{
            return false;
        }
    }
    public void empilar(String v){
        nodo n=new nodo();
        n.valor=v;
        n.siguiente=null;
        if(vacio()){
            cima++;
            cabeza=n;
        }else{
            n.siguiente=cabeza;
            cabeza=n;
        }
        
    }
    public nodo desempilar(){
        if(cima==0){
            return null;
        }else{
            nodo n= new nodo();
            n=cabeza;
            cabeza=cabeza.siguiente;
           return n;
        }

    }
    public void mostrarPila(){
        if(cima==0){
            System.out.println("pila vacia");
        }else{
            nodo n=new nodo();
            n=cabeza;
            while(n.siguiente!=null){
                System.out.println(n.valor);;
                n=n.siguiente;
            }
            System.out.println(n.valor);
            
        }
    }
    /*
    public static void main(String[] args) {
        Pila p=new Pila();
        p.empilar("text1");
        p.empilar("text2");
        p.empilar("text3");
        p.empilar("text4");
        p.desempilar();
        p.mostrarPila();
        
    }
*/
}
