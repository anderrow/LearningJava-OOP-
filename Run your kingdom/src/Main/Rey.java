package Main;

public class Rey {
    private String nombre;
    private int turnosJugados;

    public Rey(String nombre) {
        this.nombre = nombre;
        this.turnosJugados = 0;
    }

    public void aumentarTurno() {
        turnosJugados++;
    }

    public int getTurnosJugados() {
        return turnosJugados;
    }

    public String getNombre() {
        return nombre;
    }
}
