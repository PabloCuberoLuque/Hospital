package hospital;

public class Medico extends Trabajador{
    private int nColegiado;
    private int nPacientes;
    private EspecialidadesMedico especialidad;

    public Medico(){
    }
    
    public Medico(String nombre, int nId, double sueldo,int nColegiado, int nPacientes, EspecialidadesMedico especialidad){
        super(nombre, nId, sueldo);
        this.nColegiado = nColegiado;
        this.nPacientes = nPacientes;
        this.especialidad= especialidad;
    }

    public int getnColegiado() {
        return nColegiado;
    }

    public void setnColegiado(int nColegiado) {
        this.nColegiado = nColegiado;
    }

    public int getnPacientes() {
        return nPacientes;
    }

    public void setnPacientes(int nPacientes) {
        this.nPacientes = nPacientes;
    }

    public EspecialidadesMedico getEspecialidad() {
        return especialidad;
    }

    public void setEspecialidad(EspecialidadesMedico especialidad) {
        this.especialidad = especialidad;
    }
    
    
    
}
