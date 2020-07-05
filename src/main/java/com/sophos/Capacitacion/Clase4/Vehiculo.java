package com.sophos.Capacitacion.Clase4;

public class Vehiculo {
	
	private int cantidadLlantas ;
	private String tipoEnergia ;
	public Vehiculo() {
		super();
		this.cantidadLlantas = 0;
		this.tipoEnergia = null;
	}
	public int getCantidadLlantas() {
		return cantidadLlantas;
	}
	public void setCantidadLlantas(int cantidadLlantas) {
		this.cantidadLlantas = cantidadLlantas;
	}
	public String getTipoEnergia() {
		return tipoEnergia;
	}
	public void setTipoEnergia(String tipoEnergia) {
		this.tipoEnergia = tipoEnergia;
	}
	

}
