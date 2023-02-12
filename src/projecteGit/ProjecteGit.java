package projecteGit;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class ProjecteGit {

	boolean esPrimo(int num) {
		if (num <= 1) return false;
		int i = 2;
		while (i <= Math.sqrt(num)) {
			if (num % i == 0) return false;
			i++;
		}
		return true;
	}
	
	static int leerEntero(String texto, int min, int max) throws NumberFormatException, IOException {
		
		BufferedReader entrada = new BufferedReader(new InputStreamReader(System.in));
		int dato;
		boolean error=false;
		do {
			dato=0;
			try {
				System.out.println(texto+" ("+min+"-"+max+")");
				dato=Integer.parseInt(entrada.readLine());
				if (dato<min || dato>max) System.out.println("Incorrecto");
				error=false;
			}
			catch (NumberFormatException e) {
				System.out.println("Solo se admiten dígitos");
				error=true;
			}
		} while (dato<min || dato>max || error);
		return dato;
	}
	
	public static void main(String[] args) {

		ProjecteGit programa = new ProjecteGit();

		// Leer el número
		int num = programa.leerEntero("Entra un número : ",1,Integer.MAX_VALUE);

		if (programa.esPrimo(num)) {
			System.out.println("Si es primo");
		} else {
			System.out.println("No es primo");
		}
		
	}

}
