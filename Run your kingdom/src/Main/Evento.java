package Main;

import java.util.Random;

public class Evento {
    public static void generarEventoAleatorio(Reino reino) {
        Random r = new Random();
        int evento = r.nextInt(4);
        switch (evento) {
            case 0:
                reino.modificarComida(-15);
                ConsolaHelper.mostrarMensaje("🌾 ¡Sequía! Has perdido 15 de comida.");
                break;
            case 1:
                reino.modificarOro(+30);
                ConsolaHelper.mostrarMensaje("🤝 Ayuda extranjera: +30 de oro.");
                break;
            case 2:
                reino.modificarFelicidad(-20);
                ConsolaHelper.mostrarMensaje("⚠️ Revuelta pequeña: -20 de felicidad.");
                break;
            case 3:
                reino.modificarComida(+25);
                ConsolaHelper.mostrarMensaje("🌽 ¡Cosecha abundante! +25 de comida.");
                break;
        }
    }
}
