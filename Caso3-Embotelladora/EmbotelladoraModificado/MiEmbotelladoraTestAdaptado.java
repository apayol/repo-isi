//javac -cp .:./hamcrest-core-1.3.jar:./junit-4.12.jar MiEmbotelladoraTestAdaptado.java
import org.junit.*;
import org.junit.runner.RunWith;
import org.junit.runners.Parameterized;
import org.junit.runners.Parameterized.Parameters;
import static org.junit.Assert.*;
import java.util.*;

//ADAPTAMOS NUESTRO CÓDIGO TEST A SU EMBOTELLADORA:

public class MiEmbotelladoraTestAdaptado
{
	private int pequenas, grandes, total;
	Embotelladora embotelladora = new Embotelladora();

	//Testing b1: grandes, pequenas o total son negativos
	@Test (expected = RuntimeException.class)
	public void negativeTest()
	{
		pequenas = -1;
		grandes = 0;
		total = 3;
		embotelladora.calculaBotellasPequenas(pequenas, grandes, total);
	}
	
	//Testing b2: total > miCapacidad
	@Test (expected = RuntimeException.class)
	public void b2Test()
	{
		pequenas = 4;
		grandes = 1;
		total = 20;
		embotelladora.calculaBotellasPequenas(pequenas, grandes, total);
	}
	
	//Testing b3: total <= miCapacidad y total-5*grandes<0
	@Test
	public void b3Test()
	{
		pequenas = 2;
		grandes = 5;
		total = 5;
		assertTrue ("b3Test", embotelladora.calculaBotellasPequenas(pequenas, grandes, total) == 0);
		//En su código, este caso devuelve el número negativo resultante de: total - grandes * 5
		//En mi opinión debería devolver 0 en este caso (solucionable en su código, lo modifico) 
	}

	//Testing b4: total <= miCapacidad y total-5*grandes>0
	@Test
	public void b4Test()
	{
		pequenas = 3;
		grandes = 1;
		total = 7;
		assertTrue ("b4Test", embotelladora.calculaBotellasPequenas(pequenas, grandes, total) == 2);
	}
	
	//Testing b5: total <= miCapacidad y total-5*grandes=0
	//Coincide con su caso de RuntimeException("No hay botellas pequeñas en el almacén");
	@Test (expected = RuntimeException.class)
	public void b5Test()
	{
		pequenas = 0;
		grandes = 4;
		total = 20;
		embotelladora.calculaBotellasPequenas(pequenas, grandes, total);
	}
}
		
  
