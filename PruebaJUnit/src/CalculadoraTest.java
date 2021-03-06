import static org.junit.Assert.*;

import org.junit.Test;

public class CalculadoraTest {

	@Test
	public void testSuma() {
		Calculadora micalcu = new Calculadora(10, 20);
		int misuma;
		misuma = micalcu.suma();
		assertEquals(misuma, 30);
	}

	@Test
	public void testResta() {
		Calculadora miresta = new Calculadora(20, 10);
		assertTrue(miresta.resta() == 10);
		assertFalse(miresta.resta() == 11);
	}

	@Test
	public void testMultiplica() {
		Calculadora multi = new Calculadora(3,7);
		assertEquals(multi.multiplica(), 21);
	}

	@Test
	public void testDivide() {
		int resultado;
		Calculadora divi = new Calculadora(6,2);
		resultado = divi.divide();
		assertTrue(resultado == 3);
	}

}
