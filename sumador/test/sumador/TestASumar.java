package sumador;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class TestASumar {
	

	@Test
	void test() {
		ASumar sumaruno = new ASumar();
		String solucion = sumaruno.sumaruno("7");
		assertEquals("7", solucion);
	}
	
	@Test
	void test2() {
		ASumar sumaruno = new ASumar();
		String solucion = sumaruno.sumaruno("44");
		assertEquals("8", solucion);
	}
	
	@Test
	void test3() {
		ASumar sumaruno = new ASumar();
		String solucion = sumaruno.sumaruno("-4");
		assertEquals("Negativo. Siempre negativo", solucion);
	}
}


