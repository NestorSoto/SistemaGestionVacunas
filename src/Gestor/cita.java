/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Gestor;

/**
 *
 * @author User
 */
public class cita {
    public int dni;
    public String fecha;
    public int hora;
    public cita(){
        
    }

    public cita(int dni, String fecha, int hora) {
        this.dni = dni;
        this.fecha = fecha;
        this.hora = hora;
    }
    
    public int getDni() {
        return dni;
    }

    public void setDni(int dni) {
        this.dni = dni;
    }

    public String getFecha() {
        return fecha;
    }

    public void setFecha(String fecha) {
        this.fecha = fecha;
    }

    public int getHora() {
        return hora;
    }

    public void setHora(int hora) {
        this.hora = hora;
    }

    @Override
    public String toString() {
        return "cita{" + "dni=" + dni + ", fecha=" + fecha + ", hora=" + hora + '}';
    }
    
}
