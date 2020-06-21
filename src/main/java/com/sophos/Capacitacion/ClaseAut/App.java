package com.sophos.Capacitacion.ClaseAut;

import com.sophos.Capacitacion.Clase4.Carro;

/**
 * Hello world!
 *
 */
public class App 
{
   
	public static void main( String[] args )
    {
		
		Carro nuevoCarro = new Carro();
		nuevoCarro.setCantidadLlantas(4);
		nuevoCarro.setColor("Negro");
		nuevoCarro.setTipoEnergia("Gasolina");
		
		System.out.println("Cantidad de llantas: " + nuevoCarro.getCantidadLlantas() + "," + " Color: " + nuevoCarro.getColor() + "," + " Fuente de energia: " + nuevoCarro.getTipoEnergia());
		      
    }
	
	public void clase3 () {
		//System.out.println( "Hello World!" );
		Edad calculoEdad = new Edad ();
		calculoEdad.setEdad(5);
	}
}