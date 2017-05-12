package Lab_4;
public class Persona {
    private int ID;
    private String Nombre;
    private int Edad;
    private double Peso;
    private String Residencia;

    public Persona() {
    }
    
    public Persona(int ID, String Nombre, int Edad, double Peso, String Residencia) {
        this.ID = ID;
        this.Nombre = Nombre;
        this.Edad = Edad;
        this.Peso = Peso;
        this.Residencia = Residencia;
    }

    public int getID() {
        return ID;
    }

    public void setID(int ID) {
        this.ID = ID;
    }

    public String getNombre() {
        return Nombre;
    }

    public void setNombre(String Nombre) {
        this.Nombre = Nombre;
    }

    public int getEdad() {
        return Edad;
    }

    public void setEdad(int Edad) {
        this.Edad = Edad;
    }

    public double getPeso() {
        return Peso;
    }

    public void setPeso(double Peso) {
        this.Peso = Peso;
    }

    public String getResidencia() {
        return Residencia;
    }

    public void setResidencia(String Residencia) {
        this.Residencia = Residencia;
    }

    @Override
    public String toString() {
        return "Persona{" + "ID=" + ID + ", Nombre=" + Nombre + ", Edad=" + Edad + ", Peso=" + Peso + ", Residencia=" + Residencia + '}';
    }
    
}
