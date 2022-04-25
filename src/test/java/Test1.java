import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

import principal.Prueba;

public class Test1 {
	@Test
	public void testSuma2() {
		int r= new Prueba().suma(3,5);
		assertEquals(8,r);
	}
	@Test
	public void testSuma() {  //ER
		int r= new Prueba().suma(0,0);
		assertEquals(1,r);
	}
//	@Test
//	void test() {
//		fail("Not yet implemented");
//	}

}
