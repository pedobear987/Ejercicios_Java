package Eje3;

import java.util.ArrayList;

public class libro {

	String titulo, ano_pu;
	int codigo;
	boolean prestado;
	
	ArrayList<String> librospres = new ArrayList<String>();
	
	public libro(String titulo, int codigo, String ano_pu) {
		this.titulo=titulo;
		this.codigo=codigo;
		this.ano_pu=ano_pu;
		this.prestado=false;
		librospres.add(this.titulo);
		librospres.add("--------");
		librospres.add("false");
		librospres.add("--------");
		librospres.add(this.ano_pu);
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
	
	public void prestar(String titulo) {
		boolean si=false;
		boolean entra=false;
		for (int i=0;i<librospres.size();i++) {
			if(librospres.get(i)==titulo) {
				entra=true;
			if(entra==true) {
		      if (librospres.get(i)=="--------") {
		    	  if(si==false) {
		    		  si=true;
		    	  }
		    	  else {
		    		  si=false;
		    		  entra=false;
		    	  }
		      }
		      if(librospres.get(i)=="false") {
		    	  librospres.set(i, "true");
		      }
		    }
			}
		}
	}
	
	public void devolver(String titulo) {
		boolean si=false;
		boolean entra=false;
		for (int i=0;i<librospres.size();i++) {
			if(librospres.get(i)==titulo) {
				entra=true;
			if(entra==true) {
		      if (librospres.get(i)=="--------") {
		    	  if(si==false) {
		    		  si=true;
		    	  }
		    	  else {
		    		  si=false;
		    		  entra=false;
		    	  }
		      }
		      if(librospres.get(i)=="true") {
		    	  librospres.set(i, "false");
		      }
		    }
			}
		}
	}
	public void prestado(String titulo) {
		boolean si=false;
		boolean entra=false;
		for (int i=0;i<librospres.size();i++) {
			if(librospres.get(i)==titulo) {
				entra=true;
			if(entra==true) {
		      if (librospres.get(i)=="--------") {
		    	  if(si==false) {
		    		  si=true;
		    	  }
		    	  else {
		    		  si=false;
		    		  entra=false;
		    	  }
		      }
		      if(librospres.get(i)=="true") {
		    	  librospres.set(i, "false");
		      }
		    }
			}
		}
	}
	interface Prestable{
		
	}
}
