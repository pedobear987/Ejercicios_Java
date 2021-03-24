package Eje2;

import java.util.Scanner;

public class profesor extends persona{

	int despacho;
	public profesor(String nombre, String apellidos, String NIF, String direccion, int despacho) {
		super(nombre, apellidos, NIF, direccion);
		this.despacho=despacho;
	}
	public int getDespacho() {
		return despacho;
	}
	public void setDespacho(int despacho) {
		this.despacho = despacho;
	}
	@Override
	public String toString() {
		return "profesor [despacho=" + despacho + ", nombre=" + nombre + ", apellidos=" + apellidos + ", NIF=" + NIF
				+ ", direccion=" + direccion + "]";
	}
	public void addprofe() {
		System.out.print("Nombre: ");
		Scanner sus=new Scanner(System.in);
		this.nombre=sus.next();
		System.out.print("Apellidos: ");
		this.apellidos=sus.next();
		System.out.print("Direccion: ");
		this.direccion=sus.next();
		System.out.print("NIF: ");
		this.NIF=sus.next();
		System.out.print("Despacho: ");
		this.despacho=sus.nextInt();
	}
}
