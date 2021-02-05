/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package newpackage;

/**
 *
 * @author User
 */
public class meses {
    public String mes;
    public actividades[][] cronograma = new actividades[4][7];

    public meses() {
    }

    public String getMes() {
        return mes;
    }

    public void setMes(String mes) {
        this.mes = mes;
    }

    public actividades[][] getCronograma() {
        return cronograma;
    }

    public void setCronograma(actividades[][] cronograma) {
        this.cronograma = cronograma;
    }
    
}
