package com.sophos.Capacitacion.Clase4;

import java.util.Scanner;

public class EntradasSalidas {
	
	public String lecturaConsola(String mensaje) {
		String salida;
		Scanner lector = new Scanner(System.in);
		System.out.println(mensaje);
		salida = lector.nextLine();
		lector.close();			
		return salida;
	}

}
