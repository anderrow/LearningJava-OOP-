package Main;

public abstract class Accion {
    private String nombre;

    public Accion(String nombre) {
        this.nombre = nombre;
    }

    public String getNombre() {
        return nombre;
    }

    public abstract void ejecutar(Reino reino);
}
