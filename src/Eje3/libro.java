package Eje3;

import java.util.ArrayList;

public class libro {

	String titulo, ano_pu;
	int codigo;
	boolean prestado;
	
	public ArrayList<String> librospres = new ArrayList<String>();
	public libro(String titulo, int codigo, String ano_pu) {
		this.titulo=titulo;
		this.codigo=codigo;
		this.ano_pu=ano_pu;
		this.prestado=false;
	}

	public void add() {
		librospres.add(this.titulo);
		librospres.add("--------");
		librospres.add(this.ano_pu);
		librospres.add("--------");
		librospres.add("false");
	}
	public String getTitulo() {
		return titulo;
	}

	public void setTitulo(String titulo) {
		this.titulo = titulo;
	}

	public int getCodigo() {
		return codigo;
	}

	public void setCodigo(int codigo) {
		this.codigo = codigo;
	}

	public String getAno_pu() {
		return ano_pu;
	}

	public void setAno_pu(String ano_pu) {
		this.ano_pu = ano_pu;
	}

	public boolean isPrestado() {
		return prestado;
	}

	public void setPrestado(boolean prestado) {
		this.prestado = prestado;
	}

	@Override
	public String toString() {
		return "libro [titulo=" + titulo + ", codigo=" + codigo + ", ano_pu=" + ano_pu + ", prestado=" + prestado + "]";
	}
	
	public void prestar() {
		int yes=1;
		for (int i=0;i<librospres.size();i++) {
			if(librospres.get(i)==titulo) {yes=2;}
				if(yes==2) {
		      if(librospres.get(i)=="false") {
		    	  librospres.set(i, "true");
		    	  yes=1;
		      }
			}
			}
		}
	
	public void devolver() {
		int yes=1;
		for (int i=0;i<librospres.size();i++) {
			if(librospres.get(i)==titulo) {yes=2;}
				if(yes==2) {
		      if(librospres.get(i)=="true") {
		    	  librospres.set(i, "false");
		    	  yes=1;
		      }
			}
			}
	}
	public void prestado() {
		int yes=1;
		for (int i=0;i<librospres.size();i++) {
			if(librospres.get(i)==titulo) {yes=2;}
				if(yes==2) {
		      if(librospres.get(i)=="true") {
		    	  System.out.print("Esta prestado: "+titulo);
		    	  yes=1;
		      }
			}
			}
	}
	
	public void cuentaPrestados() {
		int cont=0;
		for (int i=0;i<librospres.size();i++) {
		      if(librospres.get(i)=="true") {
		    	  cont++;
		      }
		    }
		System.out.print("Se han prestado: "+cont);
	}	
	public void publicacionesAnterioresA(int num) {
		int cont=0;
		for (int i=0; i<librospres.size();i++) {
			if(librospres.get(i)=="--------") {
				cont++;
			}
			if(cont==2) {
				if(Integer.parseInt(librospres.get(i))>num) {
					System.out.print("El libro '"+librospres.get(i-3)+"' es del año "+librospres.get(i));
				}
			}
		}
	}
	interface Prestable{
		
	}
	
	public static void main(String[] args) {
		libro n=new libro("Pepe", 4, "2004");
		n.add();
		n.prestar();
		n.cuentaPrestados();
	}
}