package Main;

import java.util.ArrayList;

public class Juego {
    private Reino reino;
    private Rey rey;
    private ArrayList<Accion> acciones = new ArrayList<>();
    private final int MAX_TURNOS = 10;

    public Juego(Reino reino, Rey rey) {
        this.reino = reino;
        this.rey = rey;
        acciones.add(new CobrarImpuestos());
        acciones.add(new OrganizarFiesta());
        acciones.add(new ConstruirGranero());
        acciones.add(new AtacarReinoVecino());
    }

    public void empezar() {
        while (rey.getTurnosJugados() < MAX_TURNOS && !reino.estaEnCrisis()) {
            System.out.println("\n🔁 Turno " + (rey.getTurnosJugados() + 1));
            reino.mostrarEstado();
            mostrarAcciones();

            int opcion = ConsolaHelper.leerNumero("Elige una acción:");
            if (opcion < 1 || opcion > acciones.size()) {
                ConsolaHelper.mostrarMensaje("❌ Opción no válida.");
                continue;
            }

            acciones.get(opcion - 1).ejecutar(reino);
            Evento.generarEventoAleatorio(reino);
            rey.aumentarTurno();
        }

        finDelJuego();
    }

    private void mostrarAcciones() {
        System.out.println("\nAcciones disponibles:");
        for (int i = 0; i < acciones.size(); i++) {
            System.out.println((i + 1) + ". " + acciones.get(i).getNombre());
        }
    }

    private void finDelJuego() {
        System.out.println("\n🧾 Fin del juego.");
        if (reino.estaEnCrisis()) {
            System.out.println("😢 Has perdido. El reino ha colapsado.");
        } else {
            System.out.println("🎉 ¡Has completado los 10 turnos con éxito!");
        }
    }
}

