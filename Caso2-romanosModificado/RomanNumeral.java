//MODIFICADO, cristina del Río Vergel
import java.util.*;
public class RomanNumeral {
	
	public static int convierte(String s) {
        char Rom[]= {' ','I','V','X','L','C','D','M'};         
        int valor[] = {0,1,5,10,50,100,500,1000};              
        int ant = 0;
        int decimal = 0;
        
        char letra = ' ';
        int m = 0;
		int d = 0;
		int c = 0;
		int l = 0;
		int x = 0;
		int v = 0;
		int i = 0;
     //   String s = s.toUpperCase(); //lo ponemos todo en mayusculas para facilitarnos las cosas
        for(int z = 0; z < s.length(); z++){                   
			letra = s.charAt(z);
			if (letra!= 'I' && letra!= 'V' && letra!= 'X'&& letra!= 'L'&&letra!= 'C'&&letra!= 'D'&& letra!= 'M') {
				throw new RuntimeException("Letra incorrecta");
			}
			if(letra == 'I'){
				i= i +1;
			}
			if(letra == 'V'){
				v= v +1;
			}
			if(letra == 'X'){
				x = x + 1;
			}
			if(letra == 'L'){
				l= l +1;
			}
			if(letra == 'C'){
				c = c + 1;
			}
			if(letra == 'D'){
				d= d +1;
			}
			if(letra == 'M'){
				m= m +1;
			}
            for(int j = 0; j < Rom.length; j++){              
				if(letra == Rom[j]){                       	               
                	decimal = decimal + valor [j];          		
                 	if( ant < valor[j]){                     
                    	decimal = decimal - ant*2 ;              
                        ant = valor[j];                		 
                   }else {                            		 
                        ant = valor[j];                     
                   }              
                }
			}
        }
        if (i>3 ||v>3 ||x>3 ||l>3 || c>3 ||d>3 || m>3) {
			throw new RuntimeException("más de tres letras iguales");
		}
		 return(decimal);    
   }
	public static void main(String[] args)
	{
		RomanNumeral roman = new RomanNumeral();
		System.out.println(convierte("M"));
		System.out.println(convierte("V"));
	 	System.out.println(convierte("VI"));// 6 //Faltaban las comillas, sino no compila.
	 	System.out.println(convierte("IV"));
		System.out.println();
		System.out.println(convierte("XII"));//12
		System.out.println(convierte("IX"));
	 	System.out.println("XXX");
		System.out.println();
	 	System.out.println(convierte("M"));
	 	System.out.println(convierte("D"));
	 	System.out.println(convierte("CD"));//400
		System.out.println();
		System.out.println(convierte("H"));
		System.out.println(convierte("52"));
	}
}
