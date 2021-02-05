
package newpackage;

import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;

public class FilaSecuencial {
    private String arch="Historia.txt";
    private FileWriter fw;
    private BufferedWriter bw;
    private PrintWriter salArch;
    private String descripcion="";
    
    public FilaSecuencial(Paciente p) throws IOException {
        arch=p.getDNI()+".txt";
        fw=new FileWriter(arch);
        
        
    }
    public void addArchivo(Paciente o){
        
        bw=new BufferedWriter(fw);
        salArch= new PrintWriter(bw);
        salArch.print(o.toString()+"\n"+ descripcion);
        salArch.close();
    }
    
    /*
    public static void main(String[] args) throws IOException {
        Paciente p= new Paciente("nombre1", "apellido1",12345,"11/01/12","direccion");
        FilaSecuencial f=new FilaSecuencial(p);
        //Paciente P=new Paciente("Nombres2","Apellidos2","75465212","11/09/1997");
        f.addArchivo(p);
        
    }
*/

    public void setDescripcion(String descripcion) {
        this.descripcion = descripcion;
    }
    
}

