package Main;

public class CobrarImpuestos extends Accion {
    public CobrarImpuestos() {
        super("Cobrar Impuestos");
    }

    @Override
    public void ejecutar(Reino reino) {
        reino.modificarOro(+50);
        reino.modificarFelicidad(-10);
        ConsolaHelper.mostrarMensaje("💰 Has cobrado impuestos: +50 oro, -10 felicidad.");
    }
}

