package ar.edu.info.unlp.ejercicioDemo;

import java.time.LocalDate;

public class Automovil extends Prenda{ 
	
	private int modelo;
	private double kms;
	private double costoCeroKm;
	
	public Automovil(double liquidez, int modelo, double kms, double costoCeroKm) {
		super(liquidez);
		this.modelo = modelo;
		this.kms = kms;
		this.costoCeroKm = costoCeroKm;
	}

	public double calcularValor() {
		
		int cantAnos = 2025 - modelo;
		double parcial = this.costoCeroKm;
		
		for (int i = 0; i < cantAnos; i++) {
			parcial = parcial * 0.9;
		}
		
		return parcial;
	}
	
}
