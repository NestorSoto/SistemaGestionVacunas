
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
    
    public FilaSecuencial() throws IOException {
        fw=new FileWriter(arch);
        
        
    }
    public void addArchivo(Paciente o){
        bw=new BufferedWriter(fw);
        salArch= new PrintWriter(bw);
        salArch.print(o.toString()+"\n");
        salArch.close();
    }
    /**
    public static void main(String[] args) throws IOException {
        FilaSecuencial f=new FilaSecuencial();
        Paciente P=new Paciente("Nombres2","Apellidos2","75465212","11/09/1997");
        f.addArchivo(P);
        
    }
    * */
}
