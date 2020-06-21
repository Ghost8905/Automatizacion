package com.sophos.Capacitacion.ClaseAut;

public class Edad {
		
			int edad;

			public Edad() {
				edad = 0;	
			}

			public int getEdad() {
				return edad;
			}

			public void setEdad(int edad) {
				if (edad<18) {
					System.out.println("Usted es menor de edad");
				}else {
					System.out.println("Usted es mayor de edad");
				}
				this.edad = edad;
			}
			
			

			
			
			
			
			
			
			
}
