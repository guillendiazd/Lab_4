package Lab_4;

import java.util.ArrayList;
import java.util.Date;
public class Seguridad extends Empleado {
    private String Contrasenia;
    private ArrayList<char[]> listClaves = new ArrayList();
    private Date Dia;

    public Seguridad() {
        super();
    }

    public Seguridad(String Contrasenia, Date Dia, double Sueldo, int ID, String Nombre, int Edad, double Peso, String Residencia) {
        super(Sueldo, ID, Nombre, Edad, Peso, Residencia);
        this.Contrasenia = Contrasenia;
        this.Dia = Dia;
    }

    public String getContrasenia() {
        return Contrasenia;
    }

    public void setContrasenia(String Contrasenia) {
        this.Contrasenia = Contrasenia;
    }

    public ArrayList<char[]> getListClaves() {
        return listClaves;
    }

    public void setListClaves(ArrayList<char[]> listClaves) {
        this.listClaves = listClaves;
    }

    public Date getDia() {
        return Dia;
    }

    public void setDia(Date Dia) {
        this.Dia = Dia;
    }

    @Override
    public String toString() {
        return "Seguridad{" + "Contrasenia=" + Contrasenia + ", listClaves=" + listClaves + ", Dia=" + Dia + '}';
    }
    
}
