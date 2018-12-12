// Instrucciones de compilación:
// javac -cp .:./hamcrest-core-1.3.jar:./junit-4.12.jar BisiestosTest.java

import static org.junit.Assert.*;
import org.junit.*;
import java.util.*;

public class BisiestosTest
{
	Bisiestos bisiesto = new Bisiestos();   	// Test fixture
	private int año;

	// Test para comprobar los años que son bisiestos según el bloque b1:
	// "Años divisibles entre 4 pero no entre 100"
	// Recorre el camino de prueba i = [1, 3, 4]
	@Test
	public void testParaAñoBisiestoSegunB1()
	{
		año = 2004;
		boolean esBisiesto = bisiesto.esBisiesto(año);
		assertTrue ("testParaAñoBisiestoSegunB1", esBisiesto == true);
	}

	// Test para comprobar los años que son bisiestos según el bloque b2:
	// "Años divisibles entre 4, entre 100 y entre 400"
	// Recorre el camino de prueba i = [1, 3, 4]
	@Test
	public void testParaAñoBisiestoSegunB2()
	{
		año = 1600;
		boolean esBisiesto = bisiesto.esBisiesto(año);
		assertTrue ("testParaAñoBisiestoSegunB2", esBisiesto == true);
	}

	// Test para comprobar los años que no son bisiestos según el bloque b3:
	// "Resto de años"
	// Recorre el camino de prueba ii = [1, 3, 5]
	@Test
	public void testParaAñoNoBisiestoSegunB3()
	{
		año = 1;
		boolean esBisiesto = bisiesto.esBisiesto(año);
		assertTrue ("testParaAñoNoBisiestoSegunB3", esBisiesto == false);
	}

	// Test para comprobar que un año es inválido según el bloque b4:
	// "Años inválidos (números negativos y el 0)."
	// Recorre el camino de prueba iii = [1, 2]
	@Test (expected = RuntimeException.class)
	public void testParaAñoInvalido()
	{
		año = -1;
		bisiesto.esBisiesto(año);
	}
}
