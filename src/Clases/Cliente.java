package Clases;

import java.util.Scanner;

public class Cliente {
	Scanner teclado = new Scanner(System.in);
	protected int DNI, Antiguedad,nroCliente;
	protected String Nombre;

	// constructores

	public Cliente() {
		this.DNI = 0;
		this.Antiguedad = 0;
		this.Nombre = "";
	

	}
	public void cargarCliente (int c) {
		this.nroCliente = c;
		System.out.println("ingrese el nombre del cliente");
		this.Nombre = teclado.next();
		System.out.println("ingrese el dni del cliente");
		this.DNI = teclado.nextInt();
		System.out.println("ingrese la edad");
		this.Antiguedad= teclado.nextInt();
	}
}
