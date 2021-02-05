/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Gestor;

import estructura_Doble.*;
import newpackage.Cola;
import newpackage.Lista;
import newpackage.Paciente;
import newpackage.Pila;
import newpackage.actividades;
import newpackage.meses;
import pilas.cola;

public final class gestor {
    public Lista listaPacientes;
    public meses vectorMeses[]= new meses[2];
    public Pila vacunados= new Pila();
    //public cola citas= new cola();
    public Cola colaDeCitas= new Cola();
    public int dia=1;
    public int hora_base=6;
    
    
    public gestor(){
        listaPacientes=new Lista();
        Paciente p=new Paciente("Nestor Raul","soto Piñares", 75465212,"11/09/2000","jr miquel grau 144");
        Paciente p2= new Paciente("Brandon Isaac","Mejia Tarazona", 74276312,"12/11/1999","av german amézaga 12");
        Paciente p3= new Paciente("Francis Daniela","Mori Bautista",73165392,"10/10/2001","av venezuela 187");
        Paciente p4=new Paciente("Kori Xiomara","Antúnez Palomino",78560371,"12/12/1998","psj breña 123");
        listaPacientes.adiciona(p);
        listaPacientes.adiciona(p2);
        listaPacientes.adiciona(p3);
        listaPacientes.adiciona(p4);
        llenarMeses();
        cita c= new cita();
        c.setDni(75465212);
        c.setFecha("1/03/2021");
        c.setHora(10);
        
        
    }
    void llenarMeses(){
        vectorMeses[0]=new meses();
        vectorMeses[0].setMes("enero");
        
        for (int i = 0; i < 4; i++) {
            actividades[][] cronograma = new actividades[4][7];
            for (int j = 0; j < 6; j++) {
                int dia=2;
                actividades a = new actividades(dia, "titulo " + i, "descripcion" + i);
                cronograma[i][j] = a;
                dia++;
            }
            vectorMeses[0].setCronograma(cronograma);
        }
        vectorMeses[1]=new meses();
        vectorMeses[1].setMes("febrero");
        
        for (int i = 0; i < 4; i++) {
            actividades[][] cronograma = new actividades[4][7];
            for (int j = 0; j < 7; j++) {
                int dia=2;
                actividades a = new actividades(dia, "titulo " + i, "descripcion" + i);
                cronograma[i][j] = a;
                dia++;
            }
            vectorMeses[1].setCronograma(cronograma);
        }
    }

    public int getDia() {
        return dia;
    }

    public void setDia(int dia) {
        this.dia = dia;
    }

    public int getHora_base() {
        return hora_base;
    }

    public void setHora_base(int hora_base) {
        this.hora_base = hora_base;
    }
    
    
    public static void main(String[] args) {
        gestor g= new gestor();
        Paciente pas= new Paciente();
        pas.setDNI(75465212);
        System.out.println(g.listaPacientes.existe(pas));
        System.out.println(g.listaPacientes.eliminarElemento(pas));
        System.out.println(g.listaPacientes.existe(pas));
    }

    
    
}
