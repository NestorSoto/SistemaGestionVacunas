package newpackage;



public class Paciente {
    private String nombres;
    private String apellidos;
    private int DNI;
    private String fechaNac;
    String direccion;

    public Paciente() {
    }

    public Paciente(String nombres, String apellidos, int DNI, String fechaNac, String direccion) {
        this.nombres = nombres;
        this.apellidos = apellidos;
        this.DNI = DNI;
        this.fechaNac = fechaNac;
        this.direccion=direccion;
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

    public int getDNI() {
        return DNI;
    }

    public void setDNI(int DNI) {
        this.DNI = DNI;
    }

    public String getFechaNac() {
        return fechaNac;
    }

    public void setFechaNac(String fechaNac) {
        this.fechaNac = fechaNac;
    }

    public String getDireccion() {
        return direccion;
    }

    public void setDireccion(String direccion) {
        this.direccion = direccion;
    }
    
    

    @Override
    
    public String toString() {
        return "nombres y apellidos: " + nombres + ", apellidos=" + apellidos + "; DNI:" + DNI + "; fechaNac=" + fechaNac + "direccion"+direccion;
    }
    
}