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
public class Lista {
    public nodo cab,ult;
    public Lista(){
        cab=null;
        ult=null;
    }
    
    public void adiciona(String val){
        nodo nuevo= new nodo();
        nuevo.valor=val;
        nuevo.setSiguiente(null);
        if(cab==null){
            cab=nuevo;
        }else{
            ult.setSiguiente(nuevo);
        }
        ult=nuevo;
    }
    public void recorre(){
        nodo n;
        n=cab;
        while(n!=null){
            System.out.println(n.getValor());
            n=n.getSiguiente();
        }
    }
    public nodo BuscaVal(String val){
        nodo n;
        n=cab;
        boolean encontro=false;
        while(n!=null&& !encontro){
            if(n.getValor().equalsIgnoreCase(val)){
                encontro=true;
            }else{
                n=n.getSiguiente();
            }
        }
        return n;
        
    }
    public nodo BusValRec(nodo n, String val){
        if(n==null){
            return null;
        }else{
            if(n.getValor().equalsIgnoreCase(val)){
                return n;
            }else{
                if(n.getValor().equalsIgnoreCase(val)){
                    return n;
                }else{
                    return BusValRec(n.getSiguiente(), val);
                }
            }
        }
    }
    public static void main(String[] args) {
        Lista l=new Lista();
        l.adiciona("text1");
        l.adiciona("text2");
        l.adiciona("text3");
        l.adiciona("text4");
        l.adiciona("text5");
        l.recorre();
    }

}
