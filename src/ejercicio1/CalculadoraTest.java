package ejercicio1;

import static org.junit.Assert.*;

import org.junit.Test;

public class CalculadoraTest {

	@Test
	public void testResta2() {
		Calculadora calc= new Calculadora(20,10);
		String mensaje = "resta2 funciona correctamente";
		boolean resultado= calc.resta2();
		assertTrue(mensaje, resultado);
	}
	
	@Test
	public void test2Resta2() {
		Calculadora calc= new Calculadora(10,20);
		String mensaje = "resta2 funciona correctamente";
		boolean resultado= calc.resta2();
		assertFalse(mensaje, resultado);
	}

	

	@Test
	public void testResta() {
		Calculadora calc= new Calculadora(20,10);
		String mensaje = "resta2 funciona correctamente";
		int resultado= calc.resta();
		assertEquals(mensaje, 10,resultado);
	}

	@Test
	public void testDivide2() {
		Calculadora calc= new Calculadora(20,10);
		String mensaje = "divide2 funciona correctamente";
		int resultado= calc.divide2();
		assertEquals(mensaje, 2,resultado);
	}

}
