package com.sophos.Capacitacion.ClaseAut;

import com.sophos.Capacitacion.Clase4.Carro;
import com.sophos.Capacitacion.Clase4.EntradasSalidas;

/**
 * Hello world!
 *
 */
public class App 
{
   
	public static void main( String[] args )
    {
		Driver objDriver = new Driver();
		objDriver.navegadorGoogle();
		objDriver.navegadorFirefox();
		
		
    }
	
	public void tareaEdad () {
		//Ejercicio de edad
				Edad calculoEdad = new Edad ();
				calculoEdad.setEdad(5);
	  
	}
	
	public void tareaCarro () {
		//Ejercicio carro
				Carro nuevoCarro = new Carro();
				nuevoCarro.setCantidadLlantas(4);
				nuevoCarro.setColor("Negro");
				nuevoCarro.setTipoEnergia("Gasolina");
				
				System.out.println("Cantidad de llantas: " + nuevoCarro.getCantidadLlantas() + "," + " Color: " + nuevoCarro.getColor() + "," + " Fuente de energia: " + nuevoCarro.getTipoEnergia());
				      	  
	}
	
	public void  tareaNombre () {
		EntradasSalidas io = new EntradasSalidas();
		String nombre = io.lecturaConsola("por favor digite su nombre");
		System.out.println("Su nombre es: " + nombre);
		
	}
	
}