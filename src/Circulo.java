public class Circulo extends Forma {
    private double radio;

    public Circulo(String nombre, double radio) {
        super(nombre);
        this.radio = radio;
    }

    // Para calcular area utilizamos unas funciones de Math, como el numero Pi y para calcular la potencia.
    @Override
    public double calcularArea() {
        return Math.PI * Math.pow(radio, 2);
    }
}
