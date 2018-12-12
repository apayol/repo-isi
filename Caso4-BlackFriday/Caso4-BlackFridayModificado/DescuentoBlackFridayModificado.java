
import java.util.*;
import java.time.*;
import java.lang.*;
import java.text.*;
import java.io.IOException;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;

public class DescuentoBlackFridayModificado {

	public double PrecioFinal(double precioOriginal) throws ParseException {
		
	    Date date=new SimpleDateFormat("yyyy-MM-dd").parse("2018-11-23");
	    Calendar cal=Calendar.getInstance();
	    cal.setTime(date);
	    Date datenow = new SimpleDateFormat("yyyy-MM-dd").parse(LocalDateTime.now().toString());
	    Calendar calNow=Calendar.getInstance();
	    calNow.setTime(datenow);

		if ((cal.get(Calendar.MONTH) == calNow.get(Calendar.MONTH))&&(cal.get(Calendar.DATE) == calNow.get(Calendar.DATE)))
 
		{

			return (0.7*PrecioOriginal); //descuento del 30%

		}else if (PrecioOriginal > 0){

			return (0.7*PrecioOriginal);


		}else if (PrecioOriginal <= 0) {

			throw new IllegalArgumentException("Precio invalido");

		}else if (fecha.getMonthValue() == 11 && fecha.getDayOfMonth()==23) {

			return (0.7*PrecioOriginal);

		}else {

			return PrecioOriginal;
		}
	}

}

