/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package newpackage;

/**

 */

public class gestionador {
    Lista personas ;
    Cola citas;
    Pila vacunados;
    
    // implementar la lógica del programa(nestor)
    // añadir metodos de ordenamiento y añadir metodos de filas secienciales(walter)
    // panles (jose harold )
    //modificas las clases exitentes (nilo)

    public gestionador() {
        personas = new Lista();
        citas = new Cola();
        vacunados=new Pila();
    }
    // para agragar personas
    public boolean agregarPersona(String nombres, String apellidos, String DNI, String fechaNac){
        Paciente p= new Paciente(nombres,apellidos,DNI,fechaNac);
        //personas.adiciona(nombres);//personas.adiciona(p);
        if(personas.vacio()){
            personas.adiciona(p);// cambiar por objeto                        
        }else{
            if(personas.existe(p)){
                return false;
            }
        }
        return true;
    }
    public boolean eliminarPersona(Paciente P){
        boolean salida= false;
        if(personas.vacio()){
            
        }else{
            salida=personas.eliminarElemento(P);
        }
        return salida;
    }
    // para citas
    public boolean programarCita(Paciente p){
        boolean guardado= false;
        if(citas.vacio()){
            citas.encolar(p);
            guardado= true;
        }else{
            if(citas.buscarenCola(p)){
                guardado =false;
            }else{
                citas.encolar(p);
                guardado= true;
            }
        }        
        return guardado;
    }
    public Cola mostrarcitas(){
        if(citas.vacio()){
            return null;
        }else{
            return citas;
        }    
    }
    // fin citas
    
}
