package Main;

public class OrganizarFiesta extends Accion {
    public OrganizarFiesta() {
        super("Organizar Fiesta");
    }

    @Override
    public void ejecutar(Reino reino) {
        reino.modificarOro(-30);
        reino.modificarFelicidad(+20);
        ConsolaHelper.mostrarMensaje("🎉 Fiesta organizada: -30 oro, +20 felicidad.");
    }
}
