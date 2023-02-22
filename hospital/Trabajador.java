package hospital;

public class Trabajador {
    private String nombre;
    private int nId;
    private double sueldo;

    public Trabajador() {
    }

    public Trabajador(String nombre, int nId, double sueldo) {
        this.nombre = nombre;
        this.nId = nId;
        this.sueldo = sueldo;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public int getnId() {
        return nId;
    }

    public void setnId(int nId) {
        this.nId = nId;
    }

    public int getnPacientes() {
        return nPacientes;
    }

    public void setnPacientes(int nPacientes) {
        this.nPacientes = nPacientes;
    }
    
    
}
