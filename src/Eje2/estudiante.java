package Eje2;

import java.util.Scanner;

public class estudiante extends persona{

	int id_s;
	public estudiante(String nombre, String apellidos, String NIF, String direccion, int id_s) {
		super(nombre, apellidos, NIF, direccion);
		this.id_s=id_s;
	}
	public int getId_s() {
		return id_s;
	}
	public void setId_s(int id_s) {
		this.id_s = id_s;
	}
	@Override
	public String toString() {
		return "estudiante [id_s=" + id_s + ", nombre=" + nombre + ", apellidos=" + apellidos + ", NIF=" + NIF
				+ ", direccion=" + direccion + "]";
	}
	public void addestu() {
		System.out.print("Nombre: ");
		Scanner sus=new Scanner(System.in);
		this.nombre=sus.next();
		System.out.print("Apellidos: ");
		this.apellidos=sus.next();
		System.out.print("Direccion: ");
		this.direccion=sus.next();
		System.out.print("NIF: ");
		this.NIF=sus.next();
		System.out.print("ID: ");
		this.id_s=sus.nextInt();
	}
}
