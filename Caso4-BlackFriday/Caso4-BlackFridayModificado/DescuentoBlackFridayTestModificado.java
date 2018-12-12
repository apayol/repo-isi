import static org.junit.Assert.*;
import org.junit.*;
import java.util.*;
import java.text.ParseException;


public class DescuentoBlackFridayTestModificado {
	DescuentoBlackFriday priceoriginal = new DescuentoBlackFriday();
	private double price;

	@Test
	public void DescuentoBlackFridayTest() throws ParseException 
	{
		price = 30.0;
		double pricefinal = priceoriginal.PrecioFinal(price);
		assertTrue ("DescuentoBlackFridayTest", pricefinal == 21.0);
	}

	@Test public void PrecioInvalido()
	{
		price = -30.0;
		double pricefinal = priceoriginal.PrecioFinal(price);
		try {
			assertTrue("Menor 0",pricefinal);	
		} catch (IllegalArgumentException e) {
			return;
		}
		fail("Valor menor de cero");
	}

	@Test public void PrecioValido()
	{
		price = 30.0;
		double pricefinal = priceoriginal.PrecioFinal(price);
		assertTrue("BFriday",pricefinal);
		
	}
}
