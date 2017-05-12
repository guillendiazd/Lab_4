package Lab_4;

import java.util.Date;
public class Carga extends Empleado{
    private int Entrada;
    private int Salida;
    private Date Inicio;

    public Carga() {
        super();
    }

    public Carga(int Entrada, int Salida, Date Inicio, double Sueldo, int ID, String Nombre, int Edad, double Peso, String Residencia) {
        super(Sueldo, ID, Nombre, Edad, Peso, Residencia);
        this.Entrada = Entrada;
        this.Salida = Salida;
        this.Inicio = Inicio;
    }
    
    public int getEntrada() {
        return Entrada;
    }

    public void setEntrada(int Entrada) {
        this.Entrada = Entrada;
    }

    public int getSalida() {
        return Salida;
    }

    public void setSalida(int Salida) {
        this.Salida = Salida;
    }

    public Date getInicio() {
        return Inicio;
    }

    public void setInicio(Date Inicio) {
        this.Inicio = Inicio;
    }

    @Override
    public String toString() {
        return "Carga{" + "Entrada=" + Entrada + ", Salida=" + Salida + ", Inicio=" + Inicio + '}';
    }
    
}
