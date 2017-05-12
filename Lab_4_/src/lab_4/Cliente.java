package Lab_4;

import java.util.ArrayList;
import java.util.Date;
public class Cliente extends Persona {
    private double Dinero;
    private Date Compra;
    private ArrayList<Producto> listProducto = new ArrayList();

    public Cliente() {
        super();
    }

    public Cliente(double Dinero, Date Compra, int ID, String Nombre, int Edad, double Peso, String Residencia) {
        super(ID, Nombre, Edad, Peso, Residencia);
        this.Dinero = Dinero;
        this.Compra = Compra;
    }

    public double getDinero() {
        return Dinero;
    }

    public void setDinero(double Dinero) {
        this.Dinero = Dinero;
    }

    public Date getCompra() {
        return Compra;
    }

    public void setCompra(Date Compra) {
        this.Compra = Compra;
    }

    public ArrayList<Producto> getListProducto() {
        return listProducto;
    }

    public void setListProducto(ArrayList<Producto> listProducto) {
        this.listProducto = listProducto;
    }
    
    @Override
    public String toString() {
        return "Cliente{" + "Dinero=" + Dinero + ", Compra=" + Compra + ", listProducto=" + listProducto + '}';
    }
    

}
