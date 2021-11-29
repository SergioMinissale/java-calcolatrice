package org.generation.italy.utils;

public class CalcoliHelper {
	private CalcoliHelper() {
		// costruttore privato, in modo da non creare istanze
	}
	
	// metodi somma
	public static int somma(int a, int b) {
		int somma = a + b;
		return somma;
	}
	public static double somma(double a, double b) {
		double somma = a + b;
		return somma;
	}
	
	// metodi differenza
	public static int differenza(int a, int b) {
		return a - b;
	}
	public static double differenza(double a, double b) {
		return a - b;
	}
	// metodi moltiplicazione
	public static int moltiplicazione(int a, int b) {
		return a * b;
	}
	public static double moltiplicazione(double a, double b) {
		return a * b;
	}
	// metodi valore assoluto
	public static int valoreAssoluto(int a) {
		if(a > 0) {
		return a;	
	} else {
		return - a;
	}
		
	}
	public static double valoreAssoluto(double a) {
		if(a > 0) {
			return -a;
			
		} else {
			return a;
		}
		
	}
	
	// metodi minimo
	public static int minimo(int a, int b) {
		if(a < b) {
			return a;
		} else {
			return b;
		}
	}
	public static double minimo(double a, double b) {
		if (a < b) {
			return a;
		} else {
			return b;
		}
	}
	
	// metodi massimo
	public static int massimo(int a, int b) {
		if(a > b) {
			return a;
		} else {
			return b;
		}
	}
	public static double massimo(double a, double b) {
		if (a > b) {
			return a;
		} else {
			return b;
		}
	}

}
