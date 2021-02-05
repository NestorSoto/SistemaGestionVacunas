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

    private nodo cab, ult;
    int size = 0;

    public Lista() {
        cab = null;
        ult = null;

    }

    public boolean vacio() {
        if (cab == null) {
            return true;
        } else {
            return false;
        }
    }

    public void adiciona(Paciente val) {
        nodo nuevo = new nodo();
        nuevo.valor = val;
        nuevo.setSiguiente(null);
        if (cab == null) {
            cab = nuevo;
        } else {
            ult.setSiguiente(nuevo);
        }
        ult = nuevo;
        size++;
    }

    public void recorre() {
        nodo n;
        n = cab;
        while (n != null) {
            System.out.println(n.getValor());
            n = n.getSiguiente();
        }
    }

    public nodo BuscaVal(Paciente val) {
        nodo n;
        n = cab;
        boolean encontro = false;
        while (n != null && !encontro) {
            if (n.getValor().getDNI() == val.getDNI()) {
                encontro = true;
            } else {
                n = n.getSiguiente();
            }
        }
        return n;
    }

    public Paciente BuscaValDNI(int dni) {
        nodo n;
        n = cab;
        boolean encontro = false;
        while (n != null && !encontro) {
            if (n.getValor().getDNI() == dni) {
                encontro = true;
            } else {
                n = n.getSiguiente();
            }
        }
        if (encontro = true) {
            Paciente p = new Paciente();
            p = n.getValor();
            return p;
        } else {
            return null;
        }
    }

    public boolean eliminarElemento(Paciente p) {
        boolean eliminar = false;
        nodo n = cab;
       
        nodo ant = cab;
        if (vacio()) {

        } else {

            while (n != null && !eliminar) {
                if (n.valor.getDNI() == p.getDNI()) {
                    eliminar = true;
                    ant.siguiente = n.siguiente;

                } else {
                    ant = n;
                    n = n.siguiente;
                }

            }
            /*
            if(n==null){
                eliminar= false;
            }else{
                ant.siguiente=n.siguiente;
            }
             */
        }

        size--;
        return eliminar;

    }

    public boolean existe(Paciente p) {
        boolean encontro = false;
        nodo n = cab;
        while (n != null && !encontro) {
            if (p.getDNI() == n.getValor().getDNI()) {
                encontro = true;
            }
        }
        return encontro;
    }

    public nodo BusValRec(nodo n, int val) {
        if (n == null) {
            return null;
        } else {
            if (n.getValor().getDNI() == val) {
                return n;
            } else {
                if (n.getValor().getDNI() == val) {
                    return n;
                } else {
                    return BusValRec(n.getSiguiente(), val);
                }
            }
        }
    }

    /*
    public static void main(String[] args) {
    
        Lista l=new Lista();
        Paciente p= new Paciente("nombre1","apellido1","123","11/09/97");
        Paciente p2= new Paciente("nombre2","apellido2","1231","11/09/97");
        Paciente p3= new Paciente("nombre3","apellido3","1232","11/09/97");
        Paciente p4= new Paciente("nombre4","apellido4","1233","11/09/97");
        Paciente p5= new Paciente("nombre5","apellido5","1234","11/09/97");
        l.adiciona(p);
        l.adiciona(p2);
        l.adiciona(p3);
        l.adiciona(p4);
        l.adiciona(p5);
        l.eliminarElemento(p);
        l.recorre();
    }
     */
    public int getSize() {
        return size;
    }

    public void setSize(int size) {
        this.size = size;
    }

    public nodo getCab() {
        return cab;
    }

    public void setCab(nodo cab) {
        this.cab = cab;
    }

    public nodo getUlt() {
        return ult;
    }

    public void setUlt(nodo ult) {
        this.ult = ult;
    }

}
