package Clases;

import java.util.Scanner;

public class Prestamo extends Cliente {
	Scanner teclado = new Scanner(System.in);
	private int Cuotapura;
	private float Porcentaje;
	private double Montoprestamo;

	// constructores

	public Prestamo() {
		this.Cuotapura = 0;
		this.Porcentaje = 0;
		this.Montoprestamo = 0;

	}
}
