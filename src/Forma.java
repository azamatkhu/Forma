// Una clase abstracta
public abstract class Forma {
    protected String nombre;

    public Forma(String nombre) {
        this.nombre = nombre;
    }

    public abstract double calcularArea();

    public void mostrarDescripcion() {
        System.out.println("La forma: " + this.nombre + ".");
        System.out.println("Mi área es: " + Math.round(this.calcularArea()) + " cm");
    }
}
