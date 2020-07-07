package com.sophos.Capacitacion.ClaseAut;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

import com.sophos.Capacitacion.Clase4.Carro;
import com.sophos.Capacitacion.Clase6.EntradasSalidas;

/**
 * Hello world!
 *
 */
public class App 
{
   
	public static void main( String[] args )
    {
		Driver objDriver = new Driver();
		objDriver.lanzarnavegador("google");
		objDriver.navegarA("https://www.google.com/");
		WebElement cajaTexto = objDriver.getDriver().findElement(By.name("q"));
		cajaTexto.sendKeys("Sophos Chronus");
		cajaTexto.submit();
//		WebElement buscar = objDriver.getDriver().findElement(By.xpath("" + "//*[@id=\"tsf\"]/div[2]/div[1]/div[2]/div[2]/div[2]/center/input[1]"));
//		buscar.click();
		WebElement sophosChronus = objDriver.getDriver().findElement(By.xpath("" + "//*[@id=\"rso\"]/div[1]/div/div[1]/a/h3"));
		sophosChronus.click();
		WebElement usuario = objDriver.getDriver().findElement(By.xpath("" + "//*[@id=\"ctl00_maincontent_Login1_UserName\"]"));
		usuario.sendKeys("Mi usuario");
		WebElement contraseña = objDriver.getDriver().findElement(By.xpath("" + "//*[@id=\"ctl00_maincontent_Login1_Password\"]"));
		contraseña.sendKeys("Mi contraseña");
		WebElement ingresar = objDriver.getDriver().findElement(By.xpath("" + "//*[@id=\"ctl00_maincontent_Login1_LoginButton\"]"));
		ingresar.click();
		
		
		try {
			Thread.sleep(5000);
		} catch (Exception e) {
			// TODO: handle exception
		}
		
		objDriver.cierreNavegador();
		
		
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
	
	public void navegar1erEjercicio () {
	
	}
	
}