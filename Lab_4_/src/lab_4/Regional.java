package lab_4;
public class Regional extends Almacen {
    private String departamento;

    public Regional() {
    }

    public Regional(String departamento, int tamanio, int altura) {
        super(tamanio, altura);
        this.departamento = departamento;
    }

    public String getDepartamento() {
        return departamento;
    }

    public void setDepartamento(String departamento) {
        this.departamento = departamento;
    }

    @Override
    public String toString() {
        return "Regional{" + "departamento=" + departamento + '}';
    }
    
    public char[] antirrobo(){
        
    }
}
