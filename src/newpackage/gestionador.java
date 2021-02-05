/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package newpackage;

import Gestor.cita;
import java.io.IOException;
import java.util.Date;

/**
 *
 */
public class gestionador {

    Lista personas;
    Cola citas;
    Pila vacunados;
    actividades[][] cronograma = new actividades[4][6];

    // implementar la lógica del programa(nestor)
    // añadir metodos de ordenamiento y añadir metodos de filas secienciales(walter)
    // panles (jose harold )
    //modificas las clases exitentes (nilo)
    public gestionador() {
        personas = new Lista();
        citas = new Cola();
        vacunados = new Pila();
        //llenarCActividades();
        
    }

    // para agragar personas
    public boolean agregarPersona(String nombres, String apellidos, int DNI, String fechaNac, String direccion) {
        Paciente p = new Paciente(nombres, apellidos, DNI, fechaNac, direccion);
        //personas.adiciona(nombres);//personas.adiciona(p);
        if (personas.vacio()) {
            personas.adiciona(p);// cambiar por objeto                        
        } else {
            if (personas.existe(p)) {
                return false;
            }
        }
        return true;
    }
    //para buscar informacion
    public Paciente buscarPaciente(int dni){
        Paciente p;
        if(personas.vacio()){
            return null;
        }else{
            
            p= personas.BuscaValDNI(dni);
            return p;
        }
    }

    public boolean eliminarPersona(Paciente P) {
        boolean salida = false;
        if (personas.vacio()) {

        } else {
            salida = personas.eliminarElemento(P);
        }
        return salida;
    }

    // para citas
    public boolean programarCita(cita p) {
        boolean guardado = false;
        if (citas.vacio()) {
            citas.encolar(p);
            guardado = true;
        } else {
            if (citas.buscarenCola(personas.BuscaValDNI(p.getDni()))) {
                guardado = false;
            } else {
                citas.encolar(p);
                guardado = true;
            }
        }
        return guardado;
    }

    public Cola mostrarcitas() {
        if (citas.vacio()) {
            return null;
        } else {
            return citas;
        }
    }

    // fin citas
    //gesion de actividades
    /*
     void llenarCActividades() {
        for (int i = 0; i < 4; i++) {
            for (int j = 0; j < 6; j++) {
                Date f = new Date();
                actividades a = new actividades(f, "titulo " + i, "descripcion" + i);
                cronograma[i][j] = a;
            }
        }

    }
    */
    public void mostrarCronograma(){
        for(int i=0; i<4;i++){
            for(int j=0;j<6;j++){
                System.out.println(cronograma[i][j].toString());
            }
        }
    }
    // fin _actividades
    
    public void resportes(Paciente p) throws IOException{
        FilaSecuencial fs= new FilaSecuencial(p);
        fs.addArchivo(p);
    }
    /*
    public static void main(String[] args) {
        gestionador g= new gestionador();
        g.mostrarCronograma();
    }
    */

    public actividades[][] getCronograma() {
        return cronograma;
    }
    
}
