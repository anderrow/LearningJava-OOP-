package Main;

import java.util.Scanner;

public class ConsolaHelper {
    private static Scanner scanner = new Scanner(System.in);

    public static String leerTexto(String mensaje) {
        System.out.print(mensaje + " ");
        return scanner.nextLine();
    }

    public static int leerNumero(String mensaje) {
        System.out.print(mensaje + " ");
        return Integer.parseInt(scanner.nextLine());
    }

    public static void mostrarMensaje(String mensaje) {
        System.out.println(mensaje);
    }
}

