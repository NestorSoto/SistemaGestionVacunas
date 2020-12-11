/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package newpackage;

import java.util.Date;

public class actividades {
    Date fecha;
    String titulo;
    String descripcion; 

    public actividades() {
    }

    public actividades(Date fecha, String titulo, String descripcion) {
        this.fecha = fecha;
        this.titulo = titulo;
        this.descripcion = descripcion;
    }

    public Date getFecha() {
        return fecha;
    }

    public void setFecha(Date fecha) {
        this.fecha = fecha;
    }

    public String getTitulo() {
        return titulo;
    }

    public void setTitulo(String titulo) {
        this.titulo = titulo;
    }

    public String getDescripcion() {
        return descripcion;
    }

    public void setDescripcion(String descripcion) {
        this.descripcion = descripcion;
    }

    @Override
    public String toString() {
        return "actividades{" + "fecha=" + fecha.toString() + ", titulo=" + titulo + ", descripcion=" + descripcion + '}';
    }
    
    
}
