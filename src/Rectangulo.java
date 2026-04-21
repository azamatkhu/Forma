public class Rectangulo extends Forma {
    private double x;
    private double y;

    public Rectangulo(String nombre, double x, double y) {
        super(nombre);
        this.x = x;
        this.y = y;
    }

    @Override
    public double calcularArea() {
        return x * y;
    }
}
