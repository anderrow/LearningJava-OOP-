package Main;

public class Main {
    public static void main(String[] args) {
        ConsolaHelper.mostrarMensaje("👑 ¡Bienvenido a Rey del Reino!");
        String nombre = ConsolaHelper.leerTexto("¿Cuál es tu nombre, majestad?");
        Rey rey = new Rey(nombre);
        Reino reino = new Reino();
        Juego juego = new Juego(reino, rey);
        juego.empezar();
    }
}

