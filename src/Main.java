//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        Circulo circulo = new Circulo("Circulo",60);
        Rectangulo rectangulo = new Rectangulo("Rectangulo", 10, 5);

        rectangulo.mostrarDescripcion();
        circulo.mostrarDescripcion();
    }
}