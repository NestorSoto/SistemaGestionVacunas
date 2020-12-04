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
public class Cola {
    static nodo frente;
    static nodo Final;

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
    public String encolar(String v){
        nodo n= new nodo();
        n.valor=v;
        if(vacio()){
            frente=n;
        }else{
            Final.siguiente=n;
        }
        Final=n;
        return "dato guardado";
    }
    public String Desencolar(){
        if(vacio()){
            return"cola vacia";
        }else{
            String dato;
            dato =frente.valor;
            if(Final==frente){
                Final=null;
                frente=null;
            }else{
                frente=frente.siguiente;
            }
            return "valor decolado"+ dato;
        }
    }
    public String DobleCola(String dato, int lugar){
        nodo n=new nodo();
        n.valor=dato;
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
    public void mostrarCola(){
        if(vacio()){
            System.out.println("cola vacia");
        }else{
            nodo n= new nodo();
            n=frente;
            while(n.siguiente!=Final){
                System.out.println(n.valor);
                n=n.siguiente;
            }
        }
    }
    
}
