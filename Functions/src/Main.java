
public class Main {
	public static float precioTotal(float precioUd, int uds) {
		//Internal Variables
		float priceT=precioUd*uds;
		
		System.out.println("Fuction calculating the total price of a product: " + priceT);
		
		return priceT;
	}
	
	
	public static void main(String[] args) {
		float preciototal=precioTotal(52.7f, 4);

	}

}
