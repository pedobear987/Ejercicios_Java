package Eje2;

import java.util.ArrayList;
import java.util.Scanner;


public class persona {
	
	String nombre;
	String apellidos;
	String NIF;
	String direccion;
	
	public persona(String nombre, String apellidos, String NIF, String direccion) {
		this.nombre=nombre;
		this.apellidos=apellidos;
		this.NIF=NIF;
		
	}
	
	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public String getApellidos() {
		return apellidos;
	}

	public void setApellidos(String apellidos) {
		this.apellidos = apellidos;
	}

	public String getNIF() {
		return NIF;
	}

	public void setNIF(String nIF) {
		NIF = nIF;
	}

	public String getDireccion() {
		return direccion;
	}

	public void setDireccion(String direccion) {
		this.direccion = direccion;
	}

	public String identificarse() {
		return "persona [nombre=" + nombre + ", apellidos=" + apellidos + ", NIF=" + NIF + ", direccion=" + direccion
				+ ", getClass()=" + getClass() + "]";
	}
	interface humano {
		void identificarse();
		
	}
	public void addpersona() {
		System.out.print("Nombre: ");
		Scanner sus=new Scanner(System.in);
		this.nombre=sus.next();
		System.out.print("Apellidos: ");
		this.apellidos=sus.next();
		System.out.print("Direccion: ");
		this.direccion=sus.next();
		System.out.print("NIF: ");
		this.NIF=sus.next();
	}
}
