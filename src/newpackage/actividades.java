/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package newpackage;

public class actividades {
    int dia;
    String titulo;
    String descripcion; 

    public actividades() {
    }

    public actividades(int dia, String titulo, String descripcion) {
        this.dia = dia;
        this.titulo = titulo;
        this.descripcion = descripcion;
    }

    public int getDia() {
        return dia;
    }

    public void setDia(int dia) {
        this.dia = dia;
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
        return "actividades{" + "fecha=" + dia + ", titulo=" + titulo + ", descripcion=" + descripcion + '}';
    }
    
    
}
