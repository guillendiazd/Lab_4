package lab_4;

import java.util.Date;
import javax.swing.JOptionPane;

public class Lab_4 {
    public static void main(String[] args) {
       
    }
    public static Producto CrearProducto(int Serie) {
        Date Emision = new Date();
        double Tamaño = Double.parseDouble(JOptionPane.showInputDialog("Tamaño: "));
        double Precio = Double.parseDouble(JOptionPane.showInputDialog("Precio: "));
        String Descripcion = (JOptionPane.showInputDialog("Descripcion: "));
        String Nombre = (JOptionPane.showInputDialog("Nombre: "));
        int Num = Integer.parseInt(JOptionPane.showInputDialog("Num: "));
        Producto c = new Producto();
        return c;
    }
    
    public static Carga CrearCarga(int Serie) {
        double Sueldo = Double.parseDouble(JOptionPane.showInputDialog("Sueldo: "));
        int ID = Integer.parseInt(JOptionPane.showInputDialog("ID: "));
        String Nombre = (JOptionPane.showInputDialog("Nombre: "));
        int Edad = Integer.parseInt(JOptionPane.showInputDialog("Edad: "));
        double Altura = Double.parseDouble(JOptionPane.showInputDialog("Altura: "));
        double Peso = Double.parseDouble(JOptionPane.showInputDialog("Peso: "));
        String Residencia = (JOptionPane.showInputDialog("Residencia: "));
        int Entrada = Integer.parseInt(JOptionPane.showInputDialog("Entrada: "));
        int Salida = Integer.parseInt(JOptionPane.showInputDialog("Salida: "));
        Date Inicio = new Date();
        Carga s = new Carga(Entrada, Salida, Inicio, ID, Nombre, Edad, Peso, Residencia);
        return s;
    }
    
    public static Persona CrearPersona(int Serie) {
        int ID = Integer.parseInt(JOptionPane.showInputDialog("ID: "));
        String Nombre = (JOptionPane.showInputDialog("Nombre: "));
        int Edad = Integer.parseInt(JOptionPane.showInputDialog("Edad: "));
        double Altura = Double.parseDouble(JOptionPane.showInputDialog("Altura: "));
        double Peso = Double.parseDouble(JOptionPane.showInputDialog("Peso: "));
        String Residencia = (JOptionPane.showInputDialog("Residencia: "));
        Persona c = new Persona(ID, Nombre, Edad, Peso, Residencia);
        return c;
    }
    
    public static Empleado CrearEmpleado(int Serie) {
        double Sueldo = Double.parseDouble(JOptionPane.showInputDialog("Sueldo: "));
        int ID = Integer.parseInt(JOptionPane.showInputDialog("ID: "));
        String Nombre = (JOptionPane.showInputDialog("Nombre: "));
        int Edad = Integer.parseInt(JOptionPane.showInputDialog("Edad: "));
        double Altura = Double.parseDouble(JOptionPane.showInputDialog("Altura: "));
        double Peso = Double.parseDouble(JOptionPane.showInputDialog("Peso: "));
        String Residencia = (JOptionPane.showInputDialog("Residencia: "));
        Empleado c = new Empleado(ID, Nombre, Edad, Peso, Residencia);
        return c;
    }
}
