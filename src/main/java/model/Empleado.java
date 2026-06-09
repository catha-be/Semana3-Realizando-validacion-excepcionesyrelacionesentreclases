package model;

public class Empleado extends Persona {
    private String cargo;
    private int aniosExperiencia;

    public Empleado(String rut, String nombre, String apellido, String telefono, Direccion direccion, String cargo, int aniosExperiencia) {
        super(rut, nombre, apellido, telefono, direccion);
        this.cargo = cargo;
        this.aniosExperiencia = aniosExperiencia;
    }

    public String getCargo() {
        return cargo;
    }

    public void setCargo(String cargo) {
        this.cargo = cargo;
    }

    public int getAniosExperiencia() {
        return aniosExperiencia;
    }

    public void setAniosExperiencia(int aniosExperiencia) {
        this.aniosExperiencia = aniosExperiencia;
    }

    @Override
    public String toString() {
        return "Empleado [Cargo=" + cargo + ", Experiencia=" + aniosExperiencia + " años, Datos=" + super.toString() + "]";
    }
}
