package Main;

public class Reino {
    private int comida = 100;
    private int oro = 100;
    private int felicidad = 100;

    public void modificarComida(int valor) {
        comida += valor;
    }

    public void modificarOro(int valor) {
        oro += valor;
    }

    public void modificarFelicidad(int valor) {
        felicidad += valor;
    }

    public boolean estaEnCrisis() {
        return comida <= 0 || oro <= 0 || felicidad <= 0;
    }

    public void mostrarEstado() {
        System.out.println("\n📊 Estado del Reino:");
        System.out.println("Comida: " + comida);
        System.out.println("Oro: " + oro);
        System.out.println("Felicidad: " + felicidad);
    }
}

