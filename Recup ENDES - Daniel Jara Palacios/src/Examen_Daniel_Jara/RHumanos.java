package Examen_Daniel_Jara;
import java.util.Scanner;

public class RHumanos {
	
	final static int complemento1 = 1000;
	final static int complemento2 = 500;
	final static int complemento3 = 300;
	final static int complemento4 = 100;
	
	public static int Validar(String string){
		Scanner s=new Scanner(string);
		s.useDelimiter(";");
		
		int codigo;
		String nombre;
		int antiguedad;
		String plus;
		
		int complemento=0;
		
		while (s.hasNext() == true){
			
			
			
			codigo=s.nextInt();
			if (codigo <= 0 || codigo >= 1000) {

				throw new RuntimeException();
			}
			
			
			
			
			nombre = s.next();
			
			if(nombre.length()>20){
				
				throw new RuntimeException();
			}
			
			
			
			
			antiguedad = s.nextInt();
			if (antiguedad < 0 || antiguedad >= 100) {

				throw new RuntimeException();
			}
			
			
			
			
			plus = s.next();

			if (plus.equals("SI") || (plus.equals("NO"))) {

				if (antiguedad < 5 && plus.equals("NO"))
					complemento = complemento1;
				else if (antiguedad >= 5 && plus.equals("NO"))
					complemento = complemento2;
				else if (antiguedad < 5 && plus.equals("SI"))
					complemento = complemento3;
				else if (antiguedad >= 5 && plus.equals("SI"))
					complemento = complemento4;

			}

			else

				throw new RuntimeException();

		}
		
		s.close();
		return complemento;
		
	}


	public static void main(String[] args) {
		
		/*
		String datos ="100;Diego Alvarez;1;SI";
		int complemento=0;
		
		complemento=Validar(datos);
		
		System.out.println("El complemento es: "+complemento);
		*/
	}
	
}
