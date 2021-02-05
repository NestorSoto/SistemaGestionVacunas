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
public class vacuna {
   public Paciente p;
   public String descrpcion;

    public vacuna() {
        p= new Paciente();
    }

    public vacuna(Paciente p, String descrpcion) {
        p= new Paciente();
        this.p = p;
        this.descrpcion = descrpcion;
    }

    public Paciente getP() {
        return p;
    }

    public void setP(Paciente p) {
        this.p = p;
    }

    public String getDescrpcion() {
        return descrpcion;
    }

    public void setDescrpcion(String descrpcion) {
        this.descrpcion = descrpcion;
    }

    @Override
    public String toString() {
        return "vacuna{" + "p=" + p + ", descrpcion=" + descrpcion + '}';
    }
    
   
}
