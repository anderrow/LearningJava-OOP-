package Main;

import java.util.Random;

public class AtacarReinoVecino extends Accion {
    public AtacarReinoVecino() {
        super("Atacar Reino Vecino");
    }

    @Override
    public void ejecutar(Reino reino) {
        Random r = new Random();
        int oro = (r.nextBoolean() ? +30 : -30);
        int comida = (r.nextBoolean() ? +20 : -20);
        int felicidad = (r.nextBoolean() ? +10 : -10);

        reino.modificarOro(oro);
        reino.modificarComida(comida);
        reino.modificarFelicidad(felicidad);

        ConsolaHelper.mostrarMensaje("⚔️ Resultado del ataque: " +
            (oro > 0 ? "+" : "") + oro + " oro, " +
            (comida > 0 ? "+" : "") + comida + " comida, " +
            (felicidad > 0 ? "+" : "") + felicidad + " felicidad.");
    }
}

