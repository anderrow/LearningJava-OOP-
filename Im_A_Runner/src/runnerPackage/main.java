package runnerPackage;
import java.util.Scanner;
import java.util.InputMismatchException;
import java.util.InputMismatchException;

public class main {
	
	//Menu
	public static int mostrarMenu(boolean error) {
		Scanner sc=new Scanner(System.in);
		
		if (error) System.out.println("Introduce unicamente un valor [0,1,2,3]");
		
		System.out.println("--------MENU--------");
		System.out.println("[0] FINALIZAR");
		System.out.println("[1] NUEVO DATO");
		System.out.println("[2] MOSTRAR DATOS");
		System.out.println("[3] BORRAR ÚLTIMO DATO");
		System.out.println("---------------------");
		System.out.print("Tu opción -> ");
		try {
			int respuesta = sc.nextInt();
			
			if (respuesta < 0 || respuesta > 3) {
                return mostrarMenu(true); //Much better that respuesta=MostarMenu(true) because we are not calling a new fuction again
			}
			
			 return respuesta;
		}
		catch (InputMismatchException e) {
            System.out.println("Error: Debes introducir un número entero.");
            sc.nextLine(); // Limpiar el buffer del scanner
            return mostrarMenu(true);
        }
		
	}
	
	//Request a new register
	public static void nuevoRegistro(float time[], int lastreg) {
		Scanner sc = new Scanner(System.in); //Init scanner
		
		System.out.println("Introducir el nuevo tiempo en min,seg");
		float respuesta=sc.nextFloat();
		time[lastreg]=respuesta;
		
	}
	
	//Mostrar registros
	public static void mostrarRegistros(float time[], int lastreg) {
		System.out.println("--------DATA-----------");
		for(int i=0;i<lastreg;i++) {
			System.out.println("Dato["+i+"]: "+ time[i]);
		}
		System.out.println("-----------------------");
	}

	
	//------MAIN RUTINE-------
	public static void main(String[] args) {
		//Init variables
		float[] tiempos= new float[10];
		float[] distancias = new float[10];
		String[] etiquetas = new String[10];
		int ultReg=0;
		
		int respuesta=mostrarMenu(false);
		
		//Actions over the menu
		 while(respuesta!=0) {
			 switch(respuesta) {
			 	case 1:
			 		nuevoRegistro(tiempos, ultReg);
			 		ultReg++;
			 		break;
			 	case 2:
			 		mostrarRegistros(tiempos, ultReg);
			 		break;
			 	case 3:
			 		break;
			 }
			 respuesta=mostrarMenu(false);
		 }
	}

}
