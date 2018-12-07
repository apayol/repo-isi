//MODIFICADO cristina del Río Vergel
import org.junit.*;
import org.junit.runner.RunWith;
import org.junit.runners.Parameterized;
import org.junit.runners.Parameterized.Parameters;
import static org.junit.Assert.*;
import java.util.*;

@RunWith (Parameterized.class)
public class RomanNumeralTest
{
	public String roman;
	public int decimal;

	public RomanNumeralTest (String roman, int decimal)
   {
		this.roman = roman;
		this.decimal = decimal;
   }

	//He añadido además de los ejemplos que ellos tenían, unos cuantos más
	@Parameters
	public static Collection<Object[]> romanValues()
	{
		return Arrays.asList (new Object [][] {{"I", 1},{"V", 5},{"X", 10}, {"L", 50}, {"C", 100},{"D", 500},{"M", 1000}, {"VII", 7},{"IV", 4},{"IX", 9}, {"XL", 40},{"XC", 90}, {"CD", 400},{"CM", 900}});
	}
	
	//@Parameters
	//public static Collection<Object[]> romanValues()
	//{
		//return Arrays.asList (new Object [][] { {"VIIII", 5},{"MXV", 5},{"XXXX", 40}, {"MXVI", 1015}, {"MXV", 5}, {"XXXX", 40} , {"MXVI", 1015}, {"Z", 5}, {"5", 5}, {"VIIII", 9}});
	//}
	
	@Test
	public void additionTest()
	{
		assertTrue ("Addition Test", decimal == RomanNumeral.convierte(roman));
	}
	//@Test
	//public void additionTest()
	//{
		//assertFalse ("Addition Test", decimal == RomanNumeral.convierte(roman));
	//}
 }
   
