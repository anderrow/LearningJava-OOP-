package Main;

public class ConstruirGranero extends Accion {
    public ConstruirGranero() {
        super("Construir Granero");
    }

    @Override
    public void ejecutar(Reino reino) {
        reino.modificarOro(-40);
        reino.modificarComida(+20);
        ConsolaHelper.mostrarMensaje("🏗️ Has construido un granero: -40 oro, +20 comida.");
    }
}

