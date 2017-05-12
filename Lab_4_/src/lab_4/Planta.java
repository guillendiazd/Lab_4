package lab_4;
public class Planta extends Almacen{
    private int num_planta;

    public Planta() {
        super();
    }

    public Planta(int num_planta, int tamanio, int altura) {
        super(tamanio, altura);
        this.num_planta = num_planta;
    }

    public int getNum_planta() {
        return num_planta;
    }

    public void setNum_planta(int num_planta) {
        this.num_planta = num_planta;
    }

    @Override
    public String toString() {
        return "Planta{" + "num_planta=" + num_planta + '}';
    }
    
    public char[] antirrobo(){
        
    }
}
