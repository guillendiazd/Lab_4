package Lab_4;
public class Empleado extends Persona {

    private double Sueldo;

    public Empleado() {
        super();
    }
    
    public Empleado(double Sueldo, int ID, String Nombre, int Edad, double Peso, String Residencia) {
        super(ID, Nombre, Edad, Peso, Residencia);
        this.Sueldo = Sueldo;
    }

    public double getSueldo() {
        return Sueldo;
    }

    public void setSueldo(double Sueldo) {
        this.Sueldo = Sueldo;
    }

    @Override
    public String toString() {
        return "Empleado{" + "Sueldo=" + Sueldo + '}';
    }
    
}
