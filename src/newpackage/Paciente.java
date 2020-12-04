/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package newpackage;

import java.util.Date;

public class Paciente {
    private String nombres;
    private String apellidos;
    private String DNI;
    private String fechaNac;

    public Paciente() {
    }

    public Paciente(String nombres, String apellidos, String DNI, String fechaNac) {
        this.nombres = nombres;
        this.apellidos = apellidos;
        this.DNI = DNI;
        this.fechaNac = fechaNac;
    }

    public String getNombres() {
        return nombres;
    }

    public void setNombres(String nombres) {
        this.nombres = nombres;
    }

    public String getApellidos() {
        return apellidos;
    }

    public void setApellidos(String apellidos) {
        this.apellidos = apellidos;
    }

    public String getDNI() {
        return DNI;
    }

    public void setDNI(String DNI) {
        this.DNI = DNI;
    }

    public String getFechaNac() {
        return fechaNac;
    }

    public void setFechaNac(String fechaNac) {
        this.fechaNac = fechaNac;
    }

    @Override
    public String toString() {
        return "Paciente{" + "nombres=" + nombres + ", apellidos=" + apellidos + ", DNI=" + DNI + ", fechaNac=" + fechaNac + '}';
    }
    
}
