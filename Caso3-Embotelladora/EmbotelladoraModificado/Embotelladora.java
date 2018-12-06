public class Embotelladora {
	// Parámetros: número de botellas disponibles en el almacén.
	//			   pequeñas: número de botellas en almacén de 1L
	//			   grandes: número de botellas en almacén de 5L
	//			   total: número total de litros que hay que embotellar
	// Devuelve: número de botellas pequeñas necesarias para envasar
	// 			 el total de líquido, teniendo en cuenta que hay que
	// 			 minimizar el número de botellas pequeñas: primero
	//		     se rellenan las grandes.
	public int calculaBotellasPequenas(int pequenas, int grandes, int total) {
		int pequenasNecesarias;

		// Si alguno de los parámetros es inválido => RuntimeException
		if (pequenas < 0 || grandes < 0 || total < 0) {
			throw new RuntimeException("Parámetros inválidos");
		}
		// Si no tenemos botellas pequeñas en el almacén => RuntimeException
		if (pequenas == 0) {
			throw new RuntimeException("No hay botellas pequeñas en el almacén");
		}
		// Si el número total de litros que hay que embotellar supera la capacidad => RuntimeException
		if (total > grandes * 5 + pequenas) {
			throw new RuntimeException("No hay suficientes botellas en el almacén");
		}
		pequenasNecesarias = total - grandes * 5;
		//AÑADIDO ESTE IF PARA QUE EN CASO DE SER NEGATIVO EL NÚMERO DE BOTELLAS PEQUEÑAS NECESARIAS 
		//DEVUELVA 0 Y NO UN NÚMERO NEGATIVO. SE DA SI: total <= Capacidad y total-5*grandes<0
		//VER TEST B3
		if (pequenasNecesarias < 0) {    
			pequenasNecesarias = 0;
		} 
		return pequenasNecesarias;
	}
}
