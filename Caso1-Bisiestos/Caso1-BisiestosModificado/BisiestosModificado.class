public class Bisiestos {
	// Devuelve true si año es bisiesto, false en caso contrario
	// No se especifica qué ocurre si el número es negativo
	// => Se ha optado por lanzar la excepción RuntimeException
	public boolean esBisiesto(int año) {
		if (año < 0 || año == 0) {
			throw new RuntimeException("Año inválido");
		}
		if ((año % 4 == 0 && año % 100 != 0) ||
			(año % 4 == 0 && año % 100 == 0 && año % 400 == 0)) {
			return true;
		} else {
			return false;
		}
	}

	// public static void main(String[] args) {
	// 	Bisiestos bisiesto = new Bisiestos();
	// 	System.out.println(bisiesto.esBisiesto(2004));
	// 	System.out.println(bisiesto.esBisiesto(2008));
	// 	System.out.println(bisiesto.esBisiesto(2012));
	// 	System.out.println();
	// 	System.out.println(bisiesto.esBisiesto(1600));
	// 	System.out.println(bisiesto.esBisiesto(2000));
	// 	System.out.println(bisiesto.esBisiesto(2400));
	// 	System.out.println();
	// 	System.out.println(bisiesto.esBisiesto(1));
	// 	System.out.println(bisiesto.esBisiesto(1997));
	// 	System.out.println(bisiesto.esBisiesto(2015));
	// 	System.out.println();
	// 	// System.out.println(bisiesto.esBisiesto(-1));
	// 	// System.out.println(bisiesto.esBisiesto(0));
	// }
}
