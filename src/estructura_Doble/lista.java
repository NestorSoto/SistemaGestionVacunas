/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package estructura_Doble;

import newpackage.Paciente;

public class lista {

    Nodo first, last;
    int size=0;

    public void insertar(Paciente p) {
        if (first == null) {
            first = new Nodo(p);
            last = first;
        } else {
            Nodo temp = new Nodo(p);
            last.siguiente = temp;
            temp.anterior = last;
            last = temp;

        }
        size++;
    }
    public Paciente eliminarDNI(int dni){
        Paciente p=new Paciente();
        boolean eliminado=false;
        Nodo aux= first;
        
        while(first!=null){
            if(first.info.getDNI()==dni){
                p=first.info;
                first.anterior.siguiente=first.siguiente;
                first.anterior.anterior=first.anterior;
                
            }
            first=first.siguiente;
        }
        first=aux;
        size--;
        if(eliminado==true){
            return p;
        }else{
            return null;
        }
    }

    public Paciente BuscarDNI(int dni) {
        Paciente p = new Paciente();
        Nodo aux = first;
        boolean encontro = false;
        try {
            while (aux != null || !encontro) {
                if (aux.info.getDNI() == dni) {
                    encontro = true;
                    p = aux.info;
                }
                aux = aux.siguiente;
            }

        } catch (Exception e) {

        }

        if (encontro == true) {
            return p;
        } else {
            return null;
        }
    }

    public void mostrarDelante() {
        Nodo aux = first;
        while (aux != null) {
            System.out.println(aux.info.toString());
            aux = aux.siguiente;
        }
    }

    public int size() {
        return size;
    }

    public Nodo first() {
        return first;
    }

    public Nodo last() {
        return last;
    }
    
    
}