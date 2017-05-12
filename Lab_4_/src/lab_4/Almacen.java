package lab_4;

import java.util.ArrayList;

public abstract class Almacen {
    private ArrayList<Empleado> empleados = new ArrayList();
    private ArrayList<Producto> productos = new ArrayList();
    private int tamanio;
    private int altura;
    private ArrayList<Cliente> clientes = new ArrayList();

    public Almacen() {
    }

    public Almacen(int tamanio, int altura) {
        this.tamanio = tamanio;
        this.altura = altura;
    }

    public ArrayList<Empleado> getEmpleados() {
        return empleados;
    }

    public void setEmpleados(ArrayList<Empleado> empleados) {
        this.empleados = empleados;
    }

    public ArrayList<Producto> getProductos() {
        return productos;
    }

    public void setProductos(ArrayList<Producto> productos) {
        this.productos = productos;
    }

    public int getTamanio() {
        return tamanio;
    }

    public void setTamanio(int tamanio) {
        this.tamanio = tamanio;
    }

    public int getAltura() {
        return altura;
    }

    public void setAltura(int altura) {
        this.altura = altura;
    }

    public ArrayList<Cliente> getClientes() {
        return clientes;
    }

    public void setClientes(ArrayList<Cliente> clientes) {
        this.clientes = clientes;
    }

    @Override
    public String toString() {
        return "Almacen{" + "empleados=" + empleados + ", productos=" + productos + ", tamanio=" + tamanio + ", altura=" + altura + ", clientes=" + clientes + '}';
    }
    
    public abstract char[] antirrobo();
}
