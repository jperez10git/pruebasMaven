import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.Test;

import principal.Prueba;
import principal.Prueba2;

public class Test2 {
	@Test
	public void testSuma2a() {
		int r= new Prueba().suma(5,5);
		assertEquals(10,r);
	}
	@Test
	public void testSuma2b() {//ER
		int r= new Prueba().suma(1512,5);
		assertEquals(20,r);
	}
	@Test
	public void testResta2c() {
		int r= new Prueba2().resta(15,5);
		assertEquals(10,r);
	}
	@Test
	public void testResta2d() {//ER
		int r= new Prueba2().resta(151,5);
		assertEquals(10,r);
	}
}
