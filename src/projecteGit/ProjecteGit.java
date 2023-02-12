package projecteGit;

import java.io.IOException;

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
		
		return 1;
		
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
