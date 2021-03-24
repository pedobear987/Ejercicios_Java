package Eje2;

import java.util.ArrayList;
import java.util.Scanner;

public class menu {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ArrayList<String> personas = new ArrayList<String>();
		int n=1;
		while(n==1) {
		System.out.println("................");
		System.out.println("1.Identificar");
		System.out.println("2.Añadir profesor");
		System.out.println("3.Añadir estudiante");
		System.out.println("4.Añadir persona");
		System.out.println("5.Ver listado");
		System.out.println("6.SALIR");
		System.out.println("................");
		System.out.print("Opcion: ");
		Scanner p=new Scanner(System.in);
		int opt=p.nextInt();
		switch(opt) {
		case 1:
			persona l= new persona(null, null, null, null);
			l.identificarse();
			break;
		case 2:
			profesor pepe=new profesor(null, null, null, null, opt);
			pepe.addprofe();
			personas.add(".......");
			personas.add("Nombre: "+pepe.getNombre());
			personas.add("Apellidos: "+pepe.getApellidos());
			personas.add("Direccion: "+pepe.getDireccion());
			personas.add("NIF: "+pepe.getNIF());
			personas.add("Despacho: "+pepe.getDespacho());
			personas.add("Clase: Profesor");
			personas.add(".......");
			break;
		case 3:
			estudiante jose=new estudiante(null, null, null, null, opt);
			jose.addestu();
			personas.add(".......");
			personas.add("Nombre: "+jose.getNombre());
			personas.add("Apellidos: "+jose.getApellidos());
			personas.add("Direccion: "+jose.getDireccion());
			personas.add("NIF: "+jose.getNIF());
			personas.add("ID: "+jose.getId_s());
			personas.add("Clase: Estudiante");
			personas.add(".......");
			break;
		case 4:
			persona alguien=new persona(null, null, null, null);
			alguien.addpersona();
			personas.add(".......");
			personas.add("Nombre: "+alguien.getNombre());
			personas.add("Apellidos: "+alguien.getApellidos());
			personas.add("Direccion: "+alguien.getDireccion());
			personas.add("NIF: "+alguien.getNIF());
			personas.add("Clase: Persona");
			personas.add(".......");
			break;
		case 5:
			personas.forEach(System.out::println);
			break;
		case 6:
			System.out.println("Adios");
			n=2;
			break;
		default:
			System.out.println("Error");
		}
		}
	}

}
