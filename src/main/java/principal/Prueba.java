package principal;
/**
 * Clase Prueba de josema
 * @author josema
 *
 */
public class Prueba {
	/**
	 * método suma
	 * @param a  operando 1
	 * @param b  operando 2
	 * @return   devuelve la suma de los operandos 
	 */
  public int suma (int a, int b) {
	  return a+b;
  }
  int multiplicacion (int a, int b) {
	  return a*b;
  }
  int incremento (int a) {
	  return a++;
  }
	public static void main(String[] args) {
		int s= new Prueba().suma(4, 99);
		System.out.println("la suma es "+s);
	}

}
