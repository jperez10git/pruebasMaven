package principal;

public class Prueba2 {
	public int resta(int a, int b) {
		return a-b;
	}
	public static void main(String[] args) {
		int s= new Prueba2().resta(4, 99);
		System.out.println("la resta es "+s);
	}

}
