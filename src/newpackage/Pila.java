/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package newpackage;

public class Pila {
    int cima;
    NodoPila cabeza;

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

    public int getCima() {
        return cima;
    }

    public void setCima(int cima) {
        this.cima = cima;
    }

    public NodoPila getCabeza() {
        return cabeza;
    }

    public void setCabeza(NodoPila cabeza) {
        this.cabeza = cabeza;
    }
    
    public void empilar(vacuna v){
        NodoPila n=new NodoPila();
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
    public NodoPila desempilar(){
        if(cima==0){
            return null;
        }else{
            NodoPila n= new NodoPila();
            n=cabeza;
            cabeza=cabeza.siguiente;
           return n;
        }

    }
    public void mostrarPila(){
        if(cima==0){
            System.out.println("pila vacia");
        }else{
            NodoPila n=new NodoPila();
            n=cabeza;
            while(n.siguiente!=null){
                System.out.println(n.valor.toString());;
                n=n.siguiente;
            }
            System.out.println(n.valor);
            
        }
    }
    /*
    public static void main(String[] args) {
        Pila p=new Pila();
        Paciente pa =new Paciente(); 
        vacuna v= new vacuna();
        v.setP(pa);
        v.setDescrpcion("paciente 1");
        
        
        p.empilar(v);
        p.empilar(v);
        p.empilar(v);
        p.empilar(v);
        p.desempilar();
        p.mostrarPila();
        
    }
*/

}
